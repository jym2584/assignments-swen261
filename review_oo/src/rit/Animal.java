package rit;
/**
 * This Object represents all types of animals.
 * Dog and Spider share the same attributes and therefore should be a part of the Animal class
 */
public abstract class Animal {
  /**
   * Number of legs an animal has
   */
  private int numberOfLegs;

  /**
   * An animal
   * @param numberOfLegs
   */
  public Animal(int numberOfLegs) {
    this.numberOfLegs = numberOfLegs;
  }

  public int getNumberOfLegs() {
    return numberOfLegs;
  }

  /**
   * Unique method used by every animal
   * @return a phrase
   */
  public abstract String move();

  @Override
  public String toString() {
    return "Animal{" +
            "numberOfLegs=" + numberOfLegs +
            '}';
  }

}