/*
Accept 5 random integers into an array and display their maximum value and minimum value.
*/

import java.util.Scanner;

class a0prog2
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter 5 numbers: ");
int n[] = new int[5];

for(int i=0;i<5;i++)
n[i] = sc.nextInt();
int max = n[0];
int min = n[0];

for(int i=1;i<5;i++)
{

if(max < n[i])
max = n[i];

if(min > n[i])
min = n[i];
}

System.out.println("Max: "+max+"\nMin: "+min);
sc.close();
}
}
