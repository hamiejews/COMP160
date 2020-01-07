
/**
 * MyPanelApp.java
 * Tom Valentine July 2019
 * 
 */

public class MyPanelApp {
  /* Main Method    */
    public static void main(String[]args){
      MyPanel mp1 = new MyPanel();
      mp1.decorate(java.awt.Color.blue, 100);
      MyPanel mp2 = new MyPanel();
      mp2.decorate(java.awt.Color.yellow, 400);
    }
}