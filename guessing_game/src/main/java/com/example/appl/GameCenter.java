package com.example.appl;

import java.util.logging.Logger;

import com.example.model.GuessGame;

/**
 * The object to coordinate the state of the Web Application and keep sitewide statistics.
 *
 * This class is an example of the Pure Fabrication principle.
 *
 * @author <a href='mailto:bdbvse@rit.edu'>Bryan Basham</a>
 * @author <a href='mailto:jrv@se.rit.edu'>Jim Vallino</a>
 */
public class GameCenter {
  private static final Logger LOG = Logger.getLogger(GameCenter.class.getName());

  //
  // Constants
  //

  // Output strings made public for unit test access
  public final static String NO_GAMES_MESSAGE = "No games have been played so far.";
  public final static String ONE_GAME_MESSAGE = "One game has been played so far.";
  public final static String GAMES_PLAYED_FORMAT = "There have been %d games played.";

  // Enhancement 1, Adding global game stats
  public final static String WON_STATS = "Players have won %d%% of the games played";
  public final static String WON_STATS_NONE = "Percentage statistics will be displayed once a game has been played.";

  //
  // Attributes
  //
  private int totalGames = 0;
  private int gamesWon = 0;
  //
  // Constructors
  //

  //
  // Public methods
  //

  /**
   * Get a new {@Linkplain PlayerServices} object to provide client-specific services to
   * the client who just connected to this application.
   *
   * @return
   *   A new {@Link PlayerServices}
   */
  public PlayerServices newPlayerServices() {
    LOG.fine("New player services instance created.");
    return new PlayerServices(this);
  }

  /**
   * Create a new {@Linkplain GuessGame} game.
   *
   * @return
   *   A new {@link GuessGame}
   */
  public GuessGame getGame() {
    return new GuessGame();
  }

  /**
   * Collect sitewide statistics when a game is finished.
   */
  public void gameFinished() {
    // do some application-wide book-keeping
    synchronized (this) {  // protect the critical code
      totalGames++;
    }
  }

  /**
   * Collect statistics about games currently won
   */
  public void gameWon() {
    synchronized (this) {
      gamesWon++;
    }
  }

  /**
   * Get a user message about the sitewide statistics.
   *
   * @return
   *   The message to the user about global game statistics.
   */
  public synchronized String getGameStatsMessage() {
    if (totalGames > 1) {
      return String.format(GAMES_PLAYED_FORMAT, totalGames);
    } else if (totalGames == 1) {
      return ONE_GAME_MESSAGE;
    } else {
      return NO_GAMES_MESSAGE;
    }
  }

  /**
   *  Gets global game stats out of all games
   * @return
   */
  public synchronized String getWonStatsMessage() {
    if (gamesWon > 0) {
      return String.format(WON_STATS, gamesWon * 100 / totalGames);
    }
    return WON_STATS_NONE;
  }



}
