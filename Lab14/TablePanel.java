import javax.swing.*;
import java.awt.*;

/* class definition TablePanel extends JPanel*/  

public class TablePanel extends JPanel{
  
  private Diner diner1, diner2, diner3, diner4, diner5, diner6;
  
/* method creating instances of each diner and setting the background*/    
  
  public TablePanel(){
    
    diner1 = new Diner(175,65,"Yoda",1);
    diner2 = new Diner(240,140,"Luke",2);
    diner3 = new Diner(240,210,"Han",3);
    diner4 = new Diner(175,290,"Leia",4);
    diner5 = new Diner(105,210,"Darth",5);
    diner6 = new Diner(105,140,"Chewy",6);
    setPreferredSize(new Dimension(400, 400));
    setBackground(Color.yellow);
    
  }
  
/* paintcomponent method which draws each diner by calling the draw method*/    
  
  public void paintComponent(Graphics g){
    
    super.paintComponent(g);
    diner1.draw(g);
    diner2.draw(g);
    diner3.draw(g);
    diner4.draw(g);
    diner5.draw(g);
    diner6.draw(g);
    g.fillRect (170, 125, 60, 25*6);
  
}
}
  
  