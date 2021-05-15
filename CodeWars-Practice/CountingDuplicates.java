// Count the number of Duplicates
// Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur
// more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) 
// and numeric digits.

// Example
// "abcde" -> 0 # no characters repeats more than once
// "aabbcde" -> 2 # 'a' and 'b'
// "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
// "indivisibility" -> 1 # 'i' occurs six times
// "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
// "aA11" -> 2 # 'a' and '1'
// "ABBA" -> 2 # 'A' and 'B' each occur twice

import java.lang.Character;
import java.util.Scanner;
public class CountingDuplicates {
  static final int NO_OF_CHARS = 256;
  public static int duplicateCount(String text) {
    // Write your code here
    int result = 0;
    int count[] = new int[NO_OF_CHARS];
    for(int i = 0; i < text.length(); ++i){
      count[Character.toLowerCase(text.charAt(i))]++;
      }
    for (int i = 0; i < NO_OF_CHARS; i++) {    
        if(count[i] > 1) {
          result++;
          }
        }
    return result;
  }
  
  public static void main(String[] args) {
		
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please Enter a a set of characters: ");
    for(int i = 0 ; i < 3; i++){

    String input = scanner.nextLine();
  
    System.out.println("The number of duplicate characters is: " + duplicateCount(input));

  } 
 }
}