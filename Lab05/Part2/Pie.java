import javax.swing.*;
import java.awt.*;
/**
 Pie.java
 Support class provided for Part 2, Lab5, COMP160 2019 
 */
public class Pie extends JPanel{
    /** constructor method, sets up the Pie panel */
  public Pie(){
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.white);
  }
 
    
    /** all drawing code goes in the paint method, which is called automatically*/
    public void paintComponent (Graphics page){
      super.paintComponent(page);
      //your pie chart code goes here - you MUST use local variables as described in the lab book
      
      int x = 10;
      int y = 10;
      int width = 250;
      int height = 250;
      int arcAngle = -45;
      
      page.setColor (Color.cyan);
      page.fillArc(x, y, width, height, 0, arcAngle);
      
      page.setColor (Color.blue);
      page.fillArc(x, y, width, height, -45, arcAngle);
      
      page.setColor (Color.green);
      page.fillArc(x, y, width, height, -90, arcAngle);
      
      page.setColor (Color.yellow);
      page.fillArc(x, y, width, height, -135, arcAngle);
      
      page.setColor (Color.orange);
      page.fillArc(x, y, width, height, -180, arcAngle);
      
      page.setColor (Color.red);
      page.fillArc(x, y, width, height, - 225, arcAngle);
      
      page.setColor (Color.black);
      page.fillArc(x, y, width, height, -270, arcAngle);
      
      page.setColor (Color.magenta);
      page.fillArc(20, 5, width, height, -315, arcAngle);
    }
}
