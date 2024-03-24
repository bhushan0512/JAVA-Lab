package Assignment1;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n1. Substitute characters if string length < 3");
            System.out.println("2. Concatenate two strings");
            System.out.println("3. Extract Substring");
            System.out.println("4. Reverse a string");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            System.out.print("Enter the first string: ");
            String str1 = sc.next();

            switch (choice) {
                case 1:
                    substituteChars(sc, str1);
                    break;
                case 2:
                    concatenateStrings(sc, str1);
                    break;
                case 3:
                    extractSubstring(sc, str1);
                    break;
                case 4:
                    reverseString(sc, str1);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    public static void substituteChars(Scanner sc, String str1) {
        String result = (str1.length() < 3) ? "##" : str1;
        System.out.println("Result: " + result);
    }

    public static void concatenateStrings(Scanner sc, String str1) {
        System.out.print("Enter the second string: ");
        String str2 = sc.next();
        System.out.println("Result: " + str1.concat(str2));
    }

    public static void extractSubstring(Scanner sc, String str1) {
        System.out.print("Enter the starting index: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending index: ");
        int end = sc.nextInt();
        System.out.println("Result: " + str1.substring(start, end));
    }

    public static void reverseString(Scanner sc, String str1) {
        System.out.println("Result: " + new StringBuilder(str1).reverse().toString());
    }
}
