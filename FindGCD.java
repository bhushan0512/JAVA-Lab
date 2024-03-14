import java.util.*;
public class FindGCD {
    public static void main(String[] args) {
        int gcd = 1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int x=sc.nextInt();
	int y=sc.nextInt();
        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0)
                gcd = i;
        }
        System.out.printf("GCD of %d and %d is: %d\n", x, y, gcd);
    }
}
