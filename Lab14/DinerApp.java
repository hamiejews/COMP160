import javax.swing.*;

public class DinerApp{

/* main method creates Jframe object calls two methods, setVisible and setDefaultCloseOperation */  
  
  public static void main(String[]args){
    
    JFrame frame = new JFrame("Diner");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.getContentPane().add(new TablePanel());
    frame.pack();
    frame.setVisible(true);
  }
}