
/**
 * BookApp.java
 * Tom Valentine July 2019
 * 
 */

public class BookApp {
  /* Main Method    */
    public static void main(String[]args){
      Book b1 = new Book();
      b1.setTitle("Life of Pi");
      b1.setPages(348);
      b1.setPrice(28.90);
      b1.displayBook();
      Book b2 = new Book();
      b2.setTitle("Mister Pip");
      b2.setPages(240);
      b2.setPrice(22.70);
      b2.displayBook();
      Book b3 = new Book();
      b3.setTitle("biography");
      b3.setPages(1006);
      b3.setPrice(49.99);
      b3.displayBook();
    }
}