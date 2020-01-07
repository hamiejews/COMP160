package shapes;
import java.awt.*;
import java.util.*;

public abstract class Shape{
  
  protected int x;
  protected int y;
  protected int width;
  protected int height;
  protected Color colour;
  
  protected int moveX = 1;
  protected int moveY = 1;
  
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
  /** display method for setting the solour and size of object */
  public abstract void display (Graphics g);
  
    public void showIndex(Graphics g, int index){
    g.setColor(Color.black);
    g.drawString("" + index, x, y-1);
  }
  
}
  


