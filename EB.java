import java.util.Scanner;

public class EB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of units consumed: ");
        int units = sc.nextInt();

        double billAmount = 0;

        if (units >= 1 && units <= 100) {
            billAmount = units * 3.50;
        } else if (units >= 101 && units <= 200) {
            billAmount = units * 4.50;
        } else if (units >= 201 && units <= 300) {
            billAmount = units * 5.50;
        } else if (units >= 301 && units <= 500) {
            billAmount = 7.75;
        } else if (units > 500) {
            billAmount = units * 8.50;
        }

        System.out.println("Electricity bill amount: " + billAmount + " Rupees");

        sc.close();
    }
}
