package Assignment1;
import java.util.Scanner;

public class DigitSumAndEnglishCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Calculate the sum of digits
        int sum = 0;
        int temp = Math.abs(number); // To handle negative numbers
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        // Write the number of each digit of the sum in English
        System.out.println("Sum of digits: " + sum);
        System.out.print("Number of each digit in English: ");
        printDigitsInEnglish(sum);

        scanner.close();
    }

    public static void printDigitsInEnglish(int number) {
        String[] digitNames = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        // Convert the number to a string to access each digit
        String numberString = Integer.toString(number);

        // Loop through each digit and print its English representation
        for (int i = 0; i < numberString.length(); i++) {
            int digit = Character.getNumericValue(numberString.charAt(i));
            System.out.print(digitNames[digit]);
            if (i < numberString.length() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
