import java.util.Scanner;

class a1prog10
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter a number: ");
int n = sc.nextInt();

int fact = 1;
n = Math.abs(n);

for(int i=2;i<=n;i++)
fact = fact * i;

System.out.println(n+"! = "+fact);
sc.close();
}
}
