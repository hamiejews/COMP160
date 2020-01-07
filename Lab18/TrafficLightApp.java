import javax.swing.JFrame;

 /* application class TrafficLightApp */ 

public class TrafficLightApp{
  
   /* main method */ 
  
  public static void main(String [] args){
    
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    frame.getContentPane().add(new TrafficLightPanel());
    
    frame.pack();
    frame.setVisible(true);
  }
}