import java.util.Scanner;

class a1prog4
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter a number: ");
int n = sc.nextInt();

if(n%2==0)
{
System.out.println("Even");
System.exit(0);
}

System.out.println("Odd");
sc.close();
}
}
