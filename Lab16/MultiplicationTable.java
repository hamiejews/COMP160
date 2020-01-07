public class MultiplicationTable{

/* main method */  
  
  public static void main(String[]args){
    
    int rows = 12;
    int cols = 12;
    int table[][] = new int[rows][cols];
    
/* nested for loop which sets the values for the 2D array */    
    
    for(int rowInt = 1; rowInt <= rows; rowInt++){ 
      for(int colInt = 1; colInt <= cols; colInt++){
        table[rowInt-1][colInt-1] = rowInt * colInt;
      }
    }
    
 /* nested foreach loop which iterates through the rows in the table printing the values set above */   
    
    for(int [] rowInt: table) {
      for(int x: rowInt) {
        System.out.print(x + "\t"); 
      }
      System.out.println();
    }
  }
}