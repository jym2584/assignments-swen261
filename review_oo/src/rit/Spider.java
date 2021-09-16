package rit;
/**
 * This Object represents all spiders.
 */
public class Spider extends Animal {

  /**
   * Spider class
   * @param numberOfLegs
   */
  public Spider(int numberOfLegs) {
    super(numberOfLegs);
  }

  @Override
  public String move() {
    return "climb my web";
  }

  public static void main(String[] args) {
    Animal dog = new Spider(8);
    System.out.println(dog);
    System.out.println(dog.move());
    System.out.println(dog.getNumberOfLegs());
  }
}