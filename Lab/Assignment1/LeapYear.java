package Assignment1;
import java.util.Scanner;

public class LeapYear {

  public static void main(String[] args) {

    // Create a Scanner object to get user input
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a year: ");

    // Get the year as an integer
    int year = scanner.nextInt();

    // Check leap year logic
    boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

    if (isLeapYear) {
      System.out.println(year + " is a leap year.");
    } else {
      System.out.println(year + " is not a leap year.");
    }

    scanner.close(); // Close the Scanner to avoid resource leaks
  }
}
