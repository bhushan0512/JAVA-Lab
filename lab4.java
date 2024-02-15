import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
        String inWords = " ";
        System.out.print("Enter a number:");
        int num = sc.nextInt();

        int n = num, sum = 0;
        while (n > 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }
        System.out.println("Sum = " + sum);
        int a = sum;
        System.out.println("Digits in words:");
        while (a > 0) {
            int x = a % 10;
            inWords = words[x] + " " + inWords;
            a = a / 10;
        }
        System.err.println(inWords);
    }
}
