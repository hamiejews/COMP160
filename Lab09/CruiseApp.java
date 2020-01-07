import java.text.DecimalFormat;
import java.util.Scanner;

/** application class for Customer.java
  * Lab 9 COMP160
  */

public class CruiseApp{
  
  public static void main(String[]args){
    DecimalFormat dp = new DecimalFormat("0.#");
    //each Customer created with name, age, showed student ID card
    Customer customer1 = new Customer("Aaron Stott",17, true);
    Customer customer2 = new Customer("Betty Adams",17, false);
    Customer customer3 = new Customer("Corin Child",16, true);
    Customer customer4 = new Customer("Doris Stewart",25, true);
    Customer customer5 = new Customer("Edmond Cheyne",12, false);
    Customer customer6 = new Customer("Fiona Chaney",7, false);
    Customer customer7 = new Customer("Ged Still-Child",16, true);
    Customer customer8 = new Customer("Harry Adamson",20, false);
    confirmBooking(customer1);
    confirmBooking(customer2);
    confirmBooking(customer3);
    confirmBooking(customer4);
    confirmBooking(customer5);
    confirmBooking(customer6);
    confirmBooking(customer7);
    confirmBooking(customer8);
    showBooked(customer1);
    showBooked(customer2);
    showBooked(customer3);
    showBooked(customer4);
    showBooked(customer6);
    showBooked(customer7);
    showBooked(customer8);
  }
/** prints ticket price, meal price and total price for each customer, then prints whether or not they are booked */
  public static void confirmBooking(Customer customer){
    double ticketPrice = 56.0;
    double mealPrice = 30.0;
    if (customer.isStudent() || customer.isChild())
      ticketPrice = ticketPrice * 0.5;
    else
      ticketPrice = ticketPrice - ticketPrice * 0.2;
    if (customer.isChild())
      mealPrice = mealPrice * 0.5;
    else
      mealPrice = mealPrice - mealPrice * 0.1;
    System.out.println(customer.getName() + " Ticket Price: " + ticketPrice + " Meal Price: " + mealPrice + " Total Price: " + (ticketPrice + mealPrice));
    String x = readString(customer);
    if (x.equals("Y") || x.equals("y")){
      customer.setBooked();
      System.out.println("Booked");
    }
  }
/** uses a scanner to ask for user input to see if a customer is booked */
  public static String readString(Customer customer) {
    Scanner sc = new Scanner(System.in);
    System.out.println ("Confirm booking for " + customer.getName() +"[Y/N]");
    return sc.next();
  }         
/** prints the confirmation of the booking for each customer */  
  public static void showBooked(Customer customer){
    if (customer.isBooked())
      System.out.println(customer.getName() + " is booked");
  
}
}

