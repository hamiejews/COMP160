import java.util.* ;

public class ReadInt{
  
  public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter an integer greater than 1");
    int myInt = sc.nextInt();
    int num = 2;
    int sum = 0;
    while (num <= myInt){
      sum += num;
      num += 2;
    }
    if (myInt < 2){
      System.out.println("Input value must not be less than 2");
    }else{
      System.out.println("Sum of even numbers between 2 and " + myInt + " inclusive is: " + sum);
    }
  }
}
  
    