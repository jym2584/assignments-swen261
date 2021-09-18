<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"></meta>
    <title>${title}</title>
    <link rel="stylesheet" type="text/css" href="/styles/main.css">
</head>
<body>
    <h1>${title}</h1>
    
    <div class="body">
    
      <h2>Application Stats</h2>
      <p>
        ${gameStatsMessage}
      </p>
        <p>
        ${gamesWonStats}
        </p>

      <p>
      
      <#if newPlayer>
        <p>
          <a href="/game">Want to play a game?!?</a>
        </p>
      <#else>
      <h3>Personal Statistics</h3>
        <p>${personalStats!'No worky'}</p>
        <h4>Result</h4>
        <#if youWon>
          <p>
            Congratulations!  You must have read my mind.
            <br/><br/>
            <a href="/game">Do it again</a>
          </p>
        <#else>
          <p>
            Aww, too bad.  Better luck next time.
            <br/><br/>
            <a href="/game">How about it?</a>
          </p>
        </#if>
      </#if>
    
    </div>
  </div>
</body>
</html>
