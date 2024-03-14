import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
    	int rev=0;
    	String[] text = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int sumOfDigits = sumOfDigits(number);

        System.out.println("The sum of digits is: " + sumOfDigits);

        while (sumOfDigits != 0) {
            rev=rev*10+(sumOfDigits%10);
            sumOfDigits /= 10;
        }
        while (rev != 0) {
            int digit=rev%10;
            System.out.print(text[digit]+" ");
            rev /= 10;
        }
        System.out.println();
    }

    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
