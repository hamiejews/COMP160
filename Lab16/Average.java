public class Average{
  
  public static void main(String[]args){
    
    int [][] table = {{1,2,3},{4,5,6},{7,8}};
        
/* loops through every element in the table */
    for(int i = 0; i < table.length; i++){
      int[] currentElement = table[i]; 
      String outputString = ""; 
      int value = 0;      
      
      for(int j = 0; j < currentElement.length; j++ ) {
        value += currentElement[j]; 
        outputString += currentElement[j] + " "; 
      }
      
/* finding the average */
      double average = (double) value / (double) currentElement.length;
      outputString += "Average: " + average;

      System.out.println(outputString);
    }
  }
}