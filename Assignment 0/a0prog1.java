/*
Accept 10 random integers into an array and display them.
*/

import java.util.Scanner;

class a0prog1
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter 10 numbers: ");
int n[] = new int[10];
for(int i=0;i<10;i++)
n[i] = sc.nextInt();
for(int i=0;i<10;i++)
System.out.println("n["+i+"] = "+n[i]);
sc.close();
}
}
