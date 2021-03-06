package shapes;
import java.awt.*;
import java.util.*;

public class Shape{
  
  private int x;
  private int y;
  private int width;
  private int height;
  private Color colour;
  
  private int moveX = 1;
  private int moveY = 1;
  
  /** move method to assign values to movex/y to x and y*/
  public void move(){
    x += moveX;
    y += moveY;
    
    if((x <= 0) || (x >= (400-width))){
      moveX = -moveX;
      colour = new Color(randomRange(0, 255), randomRange(0, 255),randomRange(0, 255));
    }
    
    if((y <= 0) || (y >= (400-height))){
      moveY = -moveY;
      colour = new Color(randomRange(0, 255), randomRange(0, 255),randomRange(0, 255));
    }
  }
  
  /** Shape contructor method */
  public Shape() {
    width = randomRange(10, 30);
    height = width;
    x = randomRange(0, (400-width));
    y = randomRange(0, (400-height));
    colour = new Color(randomRange(0, 255), randomRange(0, 255),randomRange(0, 255));
    if(y > 200) {
      moveY = -1;
    } else{
      moveX = 1; 
    }
  }
  
  /** rand number method */ 
  public int randomRange( int lo, int hi ){
    Random generator = new Random();
    return generator.nextInt(hi-(lo+1)) + lo;
  }
  /** display method for setting the colour and size of object */
  public void display (Graphics g) {
    g.setColor(colour);
    g.fillOval(x, y, width, height);
  }
}
  


