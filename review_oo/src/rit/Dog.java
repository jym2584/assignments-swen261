package rit;
/**
 * This Object represents all dogs.
 */
public class Dog extends Animal {

  /**
   * Dog class
   * @param numberOfLegs
   */
  public Dog(int numberOfLegs) {
    super(numberOfLegs);
  }

  @Override
  public String move() {
    return "chase my tail";
  }

  public static void main(String[] args) {
    Animal dog = new Dog(4);
    System.out.println(dog);
    System.out.println(dog.move());
    System.out.println(dog.getNumberOfLegs());
  }
}