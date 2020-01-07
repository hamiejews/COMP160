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
  private JLabel removeLabel;
  private DrawingPanel drawPanel;
  private int num;
  
  ArrayList<Shape> shapes = new ArrayList<Shape>();
  //private Shape[] shapes = new Shape[20];
  //private int count = 0;
  
  private JButton[] buttons = new JButton[12];
  
  javax.swing.Timer timer;
  private final int DELAY = 10;
  
  /** shapePanel constructor adds labels, panels, buttons, and ButtonListener */
  public ShapePanel(){
    
    JPanel controlPanel = new JPanel();
    controlPanel.setPreferredSize(new Dimension(100, 480));
    add(controlPanel); 
    
    removeLabel = new JLabel("Remove Which?");
    controlPanel.add(removeLabel);
    
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
    buttons[11] = new JButton("Remove");
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
      if ( shapes.size() > 0 ) {
        for(int i = 0; i < shapes.size(); i++) {
          shapes.get(i).display(g);
          shapes.get(i).showIndex(g, i);
        }
      }
    }
  }
  
  /** declaring the ButtonListener class within shapePanel */
  private class ButtonListener implements ActionListener {
    
    /** actionPerformed method displays the count and refreshes the panel */
    public void actionPerformed(ActionEvent e) {
      if(e.getSource() == timer) {
         for( int i = 0; i < shapes.size(); i++) {
            shapes.get(i).move();
         }
      } else {
        
        JButton button = (JButton) e.getSource();
        
        if ((button.getText().equals("Circle"))){
          shapes.add(new Circle());
          showNum.setText("" + (shapes.size()-1));   
        } else if ((button.getText().equals("Square"))){
          shapes.add(new Square());
          showNum.setText("" + (shapes.size()-1));       
        } else if ((button.getText().equals("Oval"))){
          shapes.add(new Oval());
          showNum.setText("" + (shapes.size()-1));        
        } else if ((button.getText().equals("Smiley"))){
          shapes.add(new Smiley());
          showNum.setText("" + (shapes.size()-1));         
        } else if ((button.getText().equals("Swirl"))){
          shapes.add(new Swirl());
          showNum.setText("" + (shapes.size()-1)); 
        } else if ((button.getText().equals("Hello World"))){
          shapes.add(new HelloWorld());
          showNum.setText("" + (shapes.size()-1));
        } else if ((button.getText().equals("Pikachu"))){
          shapes.add(new Pikachu()); 
          showNum.setText("" + (shapes.size()-1));
        } else if ((button.getText().equals("Cartman"))){
          shapes.add(new Cartman());
          showNum.setText("" + (shapes.size()-1));
        } else if ((button.getText().equals("Pig"))){
          shapes.add(new Pig());
          showNum.setText("" + (shapes.size()-1));
        } 
        if (button.getText().equals("Remove") && (shapes.size() > 0)) {
          String text = showNum.getText();
          
          try {
            num = Integer.parseInt(text);
            shapes.remove(num);
            if (shapes.size() == 0) {
              showNum.setText("");
            } else if (shapes.size() > 0 ) {
              showNum.setText("" + (shapes.size()-1));
            }
            
          } catch(NumberFormatException ex) {
            showNum.setText(text);
            System.out.println("Enter an integer");
          } catch(IndexOutOfBoundsException ex) {
            showNum.setText(text);
            System.out.println("Enter an integer less than " + shapes.size());
          }
          
        } else if (shapes.size() == 0) {
          showNum.setText("");
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

