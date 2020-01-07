
import java.text.DecimalFormat;

/**
 * TriangleApp.java
 * Lab 8, COMP160  2019
 * Tom Valentine
 */
public class TriangleApp{
  
  public static void main(String[]args){
    
    DecimalFormat dp = new DecimalFormat("0.##");
    Triangle a = new Triangle();
    System.out.println("Triangle " + a.getName() + " perimerter is " + dp.format(a.getPerimeter()) + " units");
    Triangle b = new Triangle(0,3,3,4,1,9,"A");
    System.out.println("Triangle " + b.getName() + " perimerter is " + dp.format(b.getPerimeter()) + " units");
    Triangle c = new Triangle(4,2,9,4,6,7,"B");
    System.out.println("Triangle " + c.getName() + " perimerter is " + dp.format(c.getPerimeter()) + " units");
  }
}
    