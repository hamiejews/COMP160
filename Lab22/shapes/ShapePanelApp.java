package shapes;
import javax.swing.*;

public class ShapePanelApp{
  /** creates  an instance of the ShapePanel class and puts it on a frame*/
  public static void main(String[]args){
    JFrame frame = new JFrame("ShapePanel"); 
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    ShapePanel shapepanel1 = new ShapePanel();
    frame.getContentPane().add(shapepanel1);
    frame.pack();
    frame.setVisible(true);
  }
}