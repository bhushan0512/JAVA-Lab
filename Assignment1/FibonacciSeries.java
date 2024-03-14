package Assignment1;
import java.util.*;
public class FibonacciSeries {

	public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
  
	  System.out.print("Enter the number of Fibonacci numbers to print (N): ");
	  int n = scanner.nextInt();
  
	  int a = 0;
	  int b = 1;
	  int c;
  
	  System.out.print("Fibonacci Series: ");
	  for (int i = 1; i <= n; i++) {
		System.out.print(a + " ");
		c = a + b;
		a = b;
		b = c;
	  }
	  System.out.println();
	}
  }
  