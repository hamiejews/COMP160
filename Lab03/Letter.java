/**
 * Lab 3, COMP160, 2019
 */

import java.util.Scanner;

public class Letter{
  private static String yours = "Yours sincerely";
  private static String sign = "Mr Albert Agnew Esq.\nHuman Resources Manager\nButtery Baps Unlimited\nwww.bb.co.nz";
  
  public static void main(String [] args){
    String name = "";
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the successful applicant's name: ");
    name = scan.nextLine();
    int junior = 25000;     // standard pay rate for Junior employee
    int intermediate = 35000;  // standard pay rate for Intermediate employee
    int senior = 50000;    // standard pay rate for Senior employee
    jobOffer("Chief Cook", 10000, name);
    jobOffer("Lawyer", 80000, name);
    
  } // end method
  
  /** displays a job offer for Bottle Washer at $25K */
  public static void jobOffer(){
    System.out.println("Dear applicant\nI wish to offer you the position of Bottle Washer.\nThe pay rate will be $25000 per annum.");
    signature();
  } // end method
  
  /** displays a job offer for for a given jobTitle parameter at $25K */
  public static void jobOffer(String jobTitle){
    System.out.println("Dear applicant\nI wish to offer you the position of " + jobTitle + ".\nThe pay rate will be $25000 per annum."); 
    signature();
  } // end method
  
  /** displays a job offer for a given jobTitle parameter at a given payRate parameter */
  public static void jobOffer(String jobTitle, int payRate){
    System.out.println("Dear applicant\nI wish to offer you the position of " + jobTitle + ".\nThe pay rate will be $" + payRate + " per annum."); 
    signature();
  } // end method
  
  /** displays a job offer for a name given by the user, for a given jobTitle parameter at a given payRate parameter */
  public static void jobOffer(String jobTitle, int payRate, String name){
    System.out.println("Dear " + name + ",\nI wish to offer you the position of " + jobTitle + ".\nThe pay rate will be $" + payRate + " per annum."); 
    signature();
  } // end method
  
  /** prints out the signature at the end of the document */
  public static void signature(){
    System.out.println(yours + "\n" + sign + "\n"); 
    } // end method

} // end class
