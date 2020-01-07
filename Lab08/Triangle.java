/**
 * Triangle.java
 * Lab 8, COMP160  2019
 * Tom Valentine
 */


public class Triangle{
  /**
 * data field declerations
 */
  private int p1x;
  private int p1y;
  private int p2x;
  private int p2y;
  private int p3x;
  private int p3y;
  private String name;
    /**
 * default constructor to set data fields to test data
 */
  public Triangle(){
    p1x = 0;
    p1x = 0;
    p2x = 3;
    p2y = 0;
    p3x = 3;
    p3y = 4;
    name = "TEST";
  }
 
 
 /** second constructor to take data as parameters */
  public Triangle(int pt1x, int pt1y, int pt2x, int pt2y, int pt3x, int pt3y, String nameIn){
    p1x = pt1x;
    p1y = pt1y;
    p2x = pt2x;
    p2y = pt2y;
    p3x = pt3x;
    p3y = pt3y;
    name = nameIn;
  }
    /**
 * takes 4 side length arguments and returns the length of one triangle side
 */
  private double calcSide(int x1, int x2, int y1, int y2){
    double distance = Math.sqrt(Math.pow((x2-x1),2) + (Math.pow((y2-y1),2)));
    return distance;
  }
    /**
 * adds the 3 side lengths to form perimeter length
 */
  public double getPerimeter(){
    double side1 = calcSide(p1x, p2x, p1y, p2y);
    double side2 = calcSide(p2x, p3x, p2y, p3y);
    double side3 = calcSide(p3x, p1x, p3y, p1y);
    return side1 +side2 + side3;
  }
    /**
 * returns name
 */
  public String getName(){
    return name;
  }
}