/*
Accept 5 random integers into an array and display their sum and average.
*/

import java.util.Scanner;

class a0prog3
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter 5 numbers: ");
int n[] = new int[5];

for(int i=0;i<5;i++)
n[i] = sc.nextInt();
int sum = 0;
float avg;

for(int i=0;i<5;i++)
sum += n[i];
avg = (float)sum/5;

System.out.println("Sum: "+sum+"\nAvg: "+avg);
sc.close();
}
}
