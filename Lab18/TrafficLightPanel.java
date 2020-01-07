import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 /* defining TrafficLightPanel class */ 

public class TrafficLightPanel extends JPanel{
  
  private JButton red, amber, green;
  private JLabel label;
  private JPanel buttonPanel;
  
/* contructor which initialises the buttons and labels and adds them to the JPanel */ 
  
  public TrafficLightPanel(){
   
    red = new JButton("Red");
    amber = new JButton("Amber");
    green = new JButton("Green");
    label = new JLabel("Last Pressed");
    buttonPanel = new JPanel();
    
    buttonPanel.setPreferredSize(new Dimension(80, 290));
    buttonPanel.setBackground(Color.white);
    buttonPanel.add(red);
    buttonPanel.add(amber);
    buttonPanel.add(green);
    
    setPreferredSize(new Dimension(200, 300));
    setBackground(Color.blue);
    add(buttonPanel);
    
    ButtonListener listener = new ButtonListener();
    red.addActionListener(listener);
    amber.addActionListener(listener);
    green.addActionListener(listener);
    
    LightPanel lp = new LightPanel();
    add(lp);
    
  }
  
 /* inner class ButtonListener */ 
  
  private class ButtonListener implements ActionListener{
    
     /* actionPerformed method listens to buttons */ 
    
    public void actionPerformed (ActionEvent event){
      
      if (event.getSource() == red){
        label.setText("Red");
      }else if (event.getSource() == amber){
        label.setText("Amber");
      }else if (event.getSource() == green){
        label.setText("Green");
      }
      repaint();
    }
  }
  
   /* inner class LightPanel */ 
  
  private class LightPanel extends JPanel{
    
     /* paintComponent method to draw all the trafic lights */ 
    
    public void paintComponent (Graphics g){
      
      super.paintComponent(g);
      g.setColor (Color.black);
      g.fillOval (20, 30, 40, 40);
      g.setColor (Color.black);
      g.fillOval (20, 70, 40, 40);
      g.setColor (Color.black);
      g.fillOval (20, 110, 40, 40);
      if (label.getText().equals("Red")){
        g.setColor (Color.red);
      g.fillOval (20, 30, 40, 40);
      } else if (label.getText().equals("Amber")){
        g.setColor (Color.orange);
      g.fillOval (20, 70, 40, 40);
      } else if (label.getText().equals("Green")){
        g.setColor (Color.green);
      g.fillOval (20, 110, 40, 40);
      }
      
    }
    
     /* LightPanel contructor */ 
    
    public LightPanel(){
      
      setPreferredSize(new Dimension(80, 290));
      setBackground(Color.white);
      
    }
  }
}