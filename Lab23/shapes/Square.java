package shapes;
import java.awt.*;

public class Square extends Shape{
  
  public Square(){
  }
  
  /** display abstract method for setting the colour and size of object */
  public void display (Graphics g) {
    g.setColor(colour);
    g.fillRect(x, y, width, height);
  }
}
