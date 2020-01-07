import java.util.*;
/* class name */

public class Anagram{
  
  public static void main (String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first phrase");
    
    String a = sc.nextLine(); 
    
    System.out.println("Enter second phrase");
    String b = sc.nextLine(); 
    
    
    System.out.println(sortString(b) + " are the letters of " + b +  " in order");
    System.out.println(sortString(a) + " are the letters of " + a +  " in order");
    
    if(sortString(a).equals(sortString(b))){
      System.out.println(a + " is an sortString of " + b);
    }else{
      System.out.println(a + " is NOT an sortString of " + b);
    }
    
  }  
  
  /* sortString method returning the final anagram string */
  
  public static String sortString(String input){
    String lower = input.toLowerCase();
    String s = "";
    
    for (char c ='a'; c <= 'z'; c++) {
      for(int i = 0; i < lower.length(); i++){
        if(lower.charAt(i) == c){
          s += lower.charAt(i);
        }
      }
      
    }
    return s;
  }
}



