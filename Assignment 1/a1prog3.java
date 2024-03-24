import java.util.Scanner;

class a1prog3
{
public static void main (String args[])
{
double comm = 0;
Scanner sc = new Scanner (System.in);

System.out.println ("Enter amount:");
int amt = sc.nextInt();

if (amt>20000)
{
comm = amt * 0.02;
}

System.out.println("Amount:" +amt+ "Commission:" +comm);
}
}

