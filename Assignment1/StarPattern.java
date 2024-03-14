package Assignment1;
import java.util.Scanner;

public class StarPattern {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of rows for the star pattern: ");
    int rows = scanner.nextInt();

    for (int i = rows; i >= 1; i--) {
      // Print stars for each row
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println(); // Move to the next line after each row
    }
  }
}
