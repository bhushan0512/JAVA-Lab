package Assignment1;
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input units consumed
        System.out.print("Enter the units consumed: ");
        int units = scanner.nextInt();
        
        // Calculate the electricity bill
        double billAmount;
        if (units <= 300) {
            billAmount = units * 4.5;
        } else if (units <= 500) {
            billAmount = 300 * 4.5 + (units - 300) * 7.75;
        } else {
            billAmount = 300 * 4.5 + 200 * 7.75 + (units - 500) * 10;
        }
        
        // Print the electricity bill
        System.out.println("Electricity bill: Rs. " + billAmount);
        
        scanner.close();
    }
}
