import java.util.Scanner;

class a1prog5
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter a number: ");
int n = sc.nextInt();

if(n%2==0)

System.out.println("Even");
else

System.out.println("Odd");
sc.close();
}
}
