package shapes;
import java.awt.*;

public class HelloWorld extends Shape{
  
  /**  constructor to set the values of ... */
  public HelloWorld() {
  }
  
  /** display method for setting the colour and size of object */
  public void display (Graphics g) {
    g.setColor(colour);
    g.drawString("Hello World", x, y);
  }
}
