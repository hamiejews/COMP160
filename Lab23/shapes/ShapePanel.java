package shapes;
import java.awt.*;
import javax.swing.*;
import javax.swing.Timer;
import java.util.*;
import java.io.*;
import java.awt.event.*;

/** defining the class */
public class ShapePanel extends JPanel{
  
  private JPanel controlPanel;
  private JTextField showNum = new JTextField(2);
  private JLabel countLabel;
  private DrawingPanel drawPanel;
  
  private Shape[] shapes = new Shape[20];
  private int count = 0;
  
  private JButton[] buttons = new JButton[11];
  
  javax.swing.Timer timer;
  private final int DELAY = 10;
  
  /** shapePanel constructor adds labels, panels, buttons, and ButtonListener */
  public ShapePanel(){
    setPreferredSize(new Dimension(700,410));
    setBackground(Color.gray);
    
    JPanel controlPanel = new JPanel();
    controlPanel.setPreferredSize(new Dimension(100, 400));
    add(controlPanel); 
    
    countLabel = new JLabel("Count");
    controlPanel.add(countLabel);
    
    controlPanel.add(showNum);
    
    DrawingPanel drawPanel = new DrawingPanel();
    add(drawPanel);  
    
    ButtonListener listener = new ButtonListener();

    timer = new javax.swing.Timer(DELAY, listener);
    
    buttons[0] = new JButton("Circle");
    buttons[1] = new JButton("Square");
    buttons[2] = new JButton("Oval");
    buttons[3] = new JButton("Smiley");
    buttons[4] = new JButton("Swirl");
    buttons[5] = new JButton("Hello World");
    buttons[6] = new JButton("Pikachu");
    buttons[7] = new JButton("Cartman");
    buttons[8] = new JButton("Pig");
    buttons[9] = new JButton("Start");
    buttons[10] = new JButton("Stop");
    for (JButton button : buttons) {
      button.addActionListener(listener);
      controlPanel.add(button);
    }

  }
  /** declaring the drawingPanel class within shapePanel */
  private class DrawingPanel extends JPanel {
    
    /* DrawingPanel constructor */
    public DrawingPanel(){
      setPreferredSize(new Dimension(400,400));
      setBackground(Color.white);
    }
    
    /** paintComponent method to display the shapes, using loop to display the number of shapes up to the "count" value */ 
    public void paintComponent (Graphics g){
      super.paintComponent(g);   
      if ( count > 0 ) {
        for(int i = 0; i < count; i++) {
          shapes[i].display(g); 
        }
      }
    }
  }
  
  /** declaring the ButtonListener class within shapePanel */
  private class ButtonListener implements ActionListener {
    
    /** actionPerformed method displays the count and refreshes the panel */
    public void actionPerformed(ActionEvent e) {
      if(e.getSource() == timer) {
         for( int i = 0; i < count; i++) {
            shapes[i].move();
         }
      } else {
        
        JButton button = (JButton) e.getSource();
        
        if ((button.getText().equals("Circle")) && ((count+1) <= 20)){
          shapes[count] = new Circle();
          count++; 
          showNum.setText("" + count);        
        } else if ((button.getText().equals("Square")) && (count < shapes.length)){
          shapes[count] = new Square();
          count++; 
          showNum.setText("" + count);       
        } else if ((button.getText().equals("Oval")) && (count < shapes.length)){
          shapes[count] = new Oval();
          count++; 
          showNum.setText("" + count);        
        } else if ((button.getText().equals("Smiley")) && (count < shapes.length)){
          shapes[count] = new Smiley();
          count++; 
          showNum.setText("" + count);         
        } else if ((button.getText().equals("Swirl")) && (count < shapes.length)){
          shapes[count] = new Swirl();
          count++; 
          showNum.setText("" + count); 
        } else if ((button.getText().equals("Hello World")) && (count < shapes.length)){
          shapes[count] = new HelloWorld();
          count++; 
          showNum.setText("" + count);
        } else if ((button.getText().equals("Pikachu")) && (count < shapes.length)){
          shapes[count] = new Pikachu();
          count++; 
          showNum.setText("" + count);
        } else if ((button.getText().equals("Cartman")) && (count < shapes.length)){
          shapes[count] = new Cartman();
          count++; 
          showNum.setText("" + count);
        } else if ((button.getText().equals("Pig")) && (count < shapes.length)){
          shapes[count] = new Pig();
          count++; 
          showNum.setText("" + count);
        } 
        
        if(button.getText().equals("Start")) {
          timer.start();
        } else if (button.getText().equals("Stop")) {
          timer.stop();
        }
      }
      repaint();  
    }
  }
}

