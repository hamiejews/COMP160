import java.util.*;

public class IntCounter {
  
   private int[] numArray;
   
/* intCounter method which prints the array and its length */
   
   public IntCounter(int[] numArray){
      this.numArray = numArray;
     for( int i : numArray) {     
         System.out.print(i + " ");
      }                                                      
      System.out.println("Array is of length " + numArray.length);
   }
   
/* method which checks whether the target int is found in the array */
   
   public void showTarget (int target){
     
     int count = -1;
     for( int i : numArray) {
       count ++;
       if( i == target) {
         System.out.println("\tThere is a " + target + " in position " + count);
       }
     }
      
      if (count == 0) {
         System.out.println("\tThere are no " + target + "'s in this array");
      }
      System.out.println();
   }   
} 


