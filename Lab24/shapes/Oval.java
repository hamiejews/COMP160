package shapes;
import java.awt.*;

public class Oval extends Shape{
  
  /** Oval constructor to set the values of oval */
  public Oval() {
    height = (4*width);
    y = randomRange(0, (400-height));
  }
  /** display method for setting the colour and size of object */
  public void display (Graphics g) {
    g.setColor(colour);
    g.fillOval(x, y, width, height);
  }
}
