public class SongApp{
  
  /* main method begins */
  public static void main(String[]args){
    
    Song song1 = new Song("while my guitar gently weeps");
    Song song2 = new Song("Let it be");
    Song song3 = new Song("Penny Lane");
    System.out.println(song1.toString());  
    song1.process();
    System.out.println(song2.toString());  
    song2.process();
    System.out.println(song3.toString());  
    song3.process();
    
  }
}