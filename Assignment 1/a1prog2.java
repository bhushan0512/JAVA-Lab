import java.util.Scanner;

public class a1prog2
{
public static void main (String args[])
{
Scanner sc= new Scanner (System.in);

System.out.println("Enter a 1st number:");
int x = sc.nextInt();

System.out.println("Enter a 2nd number:");
int y = sc.nextInt();

int s = x+y;
System.out.println("Sum=" +s);
}
}
