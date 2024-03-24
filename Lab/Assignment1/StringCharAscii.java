package Assignment1;
import java.util.Scanner;

public class StringCharAscii {

  public static void main(String[] args) {

    // Create a Scanner object to get user input
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");

    // Get the string as input
    String str = scanner.nextLine();

    // Loop through each character in the string
    for (int i = 0; i < str.length(); i++) {
      char character = str.charAt(i);
      int asciiValue = (int) character; // Cast char to int to get ASCII value
      System.out.println("Character: " + character + "  ASCII Value: " + asciiValue);
    }

    scanner.close(); // Close the Scanner to avoid resource leaks
  }
}
