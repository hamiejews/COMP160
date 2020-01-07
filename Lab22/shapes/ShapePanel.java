package shapes;
import java.awt.*;
import javax.swing.*;
import javax.swing.Timer;
import java.util.*;
import java.io.*;
import java.awt.event.*;

public class ShapePanel extends JPanel{
  
  private JPanel controlPanel;
  private JButton addShape;
  private JTextField showNum = new JTextField(2);
  private JLabel countLabel;
  private DrawingPanel drawPanel;
  
  private Shape[] shapes = new Shape[20];
  private int count = 0;
  
  private JButton start;
  private JButton stop;
  javax.swing.Timer timer;
  private final int DELAY = 10;
  
  /** shapePanel constructor adds labels, panels, buttons, and ButtonListener */
  public ShapePanel(){
    setPreferredSize(new Dimension(700,410));
    setBackground(Color.gray);
    
    JPanel controlPanel = new JPanel();
    controlPanel.setPreferredSize(new Dimension(100, 400));
    add(controlPanel); 
    
    addShape = new JButton("Add Shape");
    controlPanel.add(addShape);
    
    countLabel = new JLabel("Count");
    controlPanel.add(countLabel);
    
    controlPanel.add(showNum);
    
    DrawingPanel drawPanel = new DrawingPanel();
    add(drawPanel);  
    
    ButtonListener listener = new ButtonListener();
    
    addShape.addActionListener(listener);
       
    start = new JButton("Start");
    start.addActionListener(listener);
    controlPanel.add(start);
    
    stop = new JButton("Stop");
    stop.addActionListener(listener);
    controlPanel.add(stop);

    timer = new javax.swing.Timer(DELAY, listener);

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
      } else if (count < shapes.length) {
        if (e.getSource() == addShape){
          shapes[count] = new Shape();
          count++; 
          showNum.setText("" + count);         
        }
      }
      
      if(e.getSource() == start) {
        timer.start();
      } else if (e.getSource() == stop) {
        timer.stop();
      }
      repaint();  
    }
  }
}

