package Assignment1;
import java.util.Scanner;

public class GCDCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the two numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        
        // Find and print the GCD
        int gcd = findGCD(number1, number2);
        System.out.println("GCD: " + gcd);
        
        scanner.close();
    }
    
    // Method to find the GCD
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
