package Assignment1;
import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Substitute characters if string length < 3");
            System.out.println("2. Concatenate two strings");
            System.out.println("3. Extract Substring");
            System.out.println("4. Reverse a string");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    substituteChars(scanner);
                    break;
                case 2:
                    concatenateStrings(scanner);
                    break;
                case 3:
                    extractSubstring(scanner);
                    break;
                case 4:
                    reverseString(scanner);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    public static void substituteChars(Scanner scanner) {
        System.out.print("Enter the string: ");
        String str = scanner.next();
        String result = (str.length() < 3) ? "##" : str;
        System.out.println("Result: " + result);
    }

    public static void concatenateStrings(Scanner scanner) {
        System.out.print("Enter the first string: ");
        String str1 = scanner.next();
        System.out.print("Enter the second string: ");
        String str2 = scanner.next();
        System.out.println("Result: " + str1.concat(str2));
    }

    public static void extractSubstring(Scanner scanner) {
        System.out.print("Enter the string: ");
        String str = scanner.next();
        System.out.print("Enter the starting index: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending index: ");
        int end = scanner.nextInt();
        System.out.println("Result: " + str.substring(start, end));
    }

    public static void reverseString(Scanner scanner) {
        System.out.print("Enter the string: ");
        String str = scanner.next();
        System.out.println("Result: " + new StringBuilder(str).reverse().toString());
    }
}
