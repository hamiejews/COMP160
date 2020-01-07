import java.util.Scanner;

public class FruitArray{
  
/* main method */  
  
  public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
    
    String[] fruits = new String[3];
    
/* for loop which iterates through asking the user for a fruit to add to the array */    
    
    for (int i = 0; i < fruits.length; i++ ){
      System.out.println("Enter a fruit");
      fruits[i] = sc.nextLine();
    }
   
/* foreach loop which iterates through the fruits array asking the user to guess each fruit they entered */        
    
    for (String fruit : fruits){
      System.out.println(fruit);
      System.out.println("Guess what fruit I am? " + fruit.substring(0, 2) + "\t" + fruit.length() + " Letters");
      String guess = sc.nextLine();
      while (!(guess.equals(fruit))) {
            System.out.println("Try again");
            guess = sc.nextLine();
      }
      System.out.println("Correct");
    }
  }
}