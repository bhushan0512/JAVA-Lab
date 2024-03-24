package Assignment1;
import java.util.*;

public class Fibonacci {

  public static int fib(int n) {
    if (n <= 1) {
      return n;
    } else {
      return fib(n - 1) + fib(n - 2);
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the position of the desired Fibonacci number (n): ");
    int n = scanner.nextInt();

    System.out.println("The " + n + "th Fibonacci number is: " + fib(n));
  }
}
