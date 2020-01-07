public class Song{
  
  /* defining variables */
  private String songLine;
  
  /* assigning songLine to the string input sLine */
  public Song(String sLine){
    songLine = sLine;
  }
  
  /* toString method returning songLine */
  public String toString(){
    return songLine;
  }
  
  /* process method */
  public void process(){
    int songLength = songLine.length();
    System.out.println("Length: " + songLength);
    System.out.println("Last letter: " + songLine.charAt(songLength-1));
    int songlineFirstSpace =  songLine.indexOf(" ");
    int songlineSecondSpace =  songLine.indexOf(" ", songlineFirstSpace+1);
    if (-1 != songlineSecondSpace){
      System.out.println("first two: " + songLine.substring(0, songlineSecondSpace));
      System.out.println("other letters: " + songLine.substring(songlineSecondSpace+1));
    }
    
    int indexOfChar = songLine.lastIndexOf(" ", songLength);
    System.out.println("last word first letter: " + songLine.charAt(indexOfChar+1));
    System.out.println("upper case: " + songLine.toUpperCase());
    System.out.println("replace space: " + songLine.replace(" ", "x"));
    System.out.println("index of b: " + songLine.indexOf("b"));
    System.out.println("print song: " + songLine);
  }
}