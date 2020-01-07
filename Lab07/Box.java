/** Lab07 Box class 
  * Tom Valentine August 2019
  */
/** defining the class */
public class Box{ 
  /** defining the variables */
  private int height;
  private int width;
  private int length;
  /** defining static variable */
  static String owner;
  
  /** mutator methods */
  
  /** sets the static variable owner to the input parameter */
  
  static void setOwner(String o){
    owner = o;
  }
  
  /** sets the variable height to the supplied input parameter */
  
  public void setHeight(int h){
    height = h;
  }
  
  /** sets the variable width to the supplied input parameter */
  
  public void setWidth(int w){
    width = w;
  }
  
  /** sets the variable length to the supplied input parameter */
  
  public void setLength(int l){
    length = l;
  }
  
  /** accessor methods */
  
  /** returns the surface area */
  
  public int getSurfaceArea(){
    return (2*(length*height))+(2*(length*width))+(2*(height*width));
  }
  
  /** returns the volume */
  
  public int getVolume(){
    return length*height*width;
  }
  
  /** returns the owners name */
  
  static String getOwner(){
    return owner;
  }
  
  /** toString method to return string wth all details */
  
  public String toString(){
    return "The height is " + height + ", the width is " + width + ", the length is " + length + ", the volume is " + getVolume() + ", the surface area is " + getSurfaceArea() + " and the owner's name is " + getOwner();
  }
  
  /** box constructor where all values are set to zero */
  
  Box(){
    height = 0;
    length = 0;
    width = 0;
  }
  
  /** box constructor where all values are set to input parameters */
  
  Box(int h, int w, int l){
    height = h;
    length = l;
    width = w;
  }
  
  /** box constructor where all values are equal (cube) */
  
  Box(int side){
    length = side;
    height = side;
    width = side;
  }
}
  
  
  
    