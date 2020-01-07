import java.util.* ;

public class ReadString{
  /* main method which takes a string and counts the number of vowels and consonants */
  public static void main(String[]args){
    
    int vowelCount = 0;
    int consonantCount = 0;
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter a sentence");
    String myString = sc.nextLine();
    System.out.println("Sentence is: " + myString);
    for (int i = 0; i < myString.length(); i++) {
      switch(myString.charAt(i)){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I' :
        case 'O':
        case 'U':
          vowelCount++;
          break;
        default:
          if ((myString.charAt(i)>='a'&&myString.charAt(i)<='z')||(myString.charAt(i)>='A'&&myString.charAt(i)<='Z')){
          consonantCount++;
        }
      }
    }
    System.out.println("VowelCount: " + vowelCount);
    System.out.println("ConsonantCount: " + consonantCount);
  }
}