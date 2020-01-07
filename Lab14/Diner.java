import java.awt.*;

/* class definition */  

public class Diner{
  
/* declaring variables*/    
  
  private int x;
  private int y;
  private String name;
  private int seatNum;
  private Color colour;
  private final int DIAMETER = 50;
  
/* diner constructor which sets all variables for each diner sent to it*/    
  
  public Diner(int setX, int setY, String setName, int setSeatNum){
    x = setX;
    y = setY;
    name = setName;
    seatNum = setSeatNum;
    if ((setSeatNum % 2) == 0){
      colour = Color.gray;
    }else{
      colour = Color.white;
    }
  }
  
/* draw method called in the tablePanel class containing the commands needed to draw the diners */    
  
  public void draw(Graphics g){
    g.setColor(colour);
    g.fillOval(x, y, DIAMETER, DIAMETER);
    g.setColor(Color.pink);
    g.setFont(new Font("Courier", Font.BOLD, 13));
    g.drawString(name, x+5, y+27);
    g.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
    g.drawString(Integer.toString(seatNum), x+23, y+12);

    
    
  }
}
  
  
  
    