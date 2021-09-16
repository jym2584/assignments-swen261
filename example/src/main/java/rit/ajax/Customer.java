package rit.ajax;

/**
 *
 *
 * @author <a href='mailto:bdbvse@rit.edu'>Bryan Basham</a>
 */
public class Customer {
  private int id;
  private String name;

  public Customer(final int id, final String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }
  public String getName() {
    return name;
  }
}
