package rit;
/**
 * This Object holds an RGB color definition.
 * 
 * WHAT PRICIPLE IS VIOLATED?
 * There is no constructor for color
 */
public class Color {
    private int red;
    private int green;
    private int blue;

    public Color(int red, int green, int blue) {
      this.red = red;
      this.green = green;
      this.blue = blue;
    }
    
    public String getCssCode() {
      return String.format("#%s%s%s",
              Integer.toHexString(red),
              Integer.toHexString(green),
              Integer.toHexString(blue)
            );
    }

    public static void main(String[] args) {
      Color myColor = new Color(255, 233, 212);
      System.out.println(myColor.getCssCode());
    }

}