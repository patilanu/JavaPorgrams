package String;
import java.util.Scanner;

public class CharacterCount {
        public static void main(String args[]) {
            String str= "String Occurance Program";
            int i, length, counter[] = new int[256];

          //  Scanner scanner = new Scanner(System.in);
            //System.out.println("Enter a String");
           // str = scanner.nextLine();
           // str = "String Occurance Program";
            //length = str.length();

            // Count frequency of every character and store
            // it in counter array
            for (i = 0; i < str.length(); i++) {
                counter[(int) str.charAt(i)]++;
            }
            // Print Frequency of characters
            for (i = 0; i < 256; i++) {
                if (counter[i] != 0) {
                   // System.out.println((char) i + " --> " + counter[i]);
                    System.out.println(i + " --> " + counter[i]);
                }
            }
        }
    }

