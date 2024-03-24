/*
Accept 5 random integers and display them in sorted order.
*/

import java.util.Scanner;

class a0prog4
{
void bubbleSort(int a[], int n)
{

for(int i=0;i<n;i++)
{

for(int j=0;j<n-i-1;j++)
{

if(a[j] > a[j+1])
{
int temp = a[j];
a[j] = a[j+1];
a[j+1] = temp;
}
}
}
}	

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter 5 numbers: ");
int a[] = new int[5];

for(int i=0;i<5;i++)
a[i] = sc.nextInt();
program4 obj = new program4();
obj.bubbleSort(a,5);

for(int i=0;i<5;i++)

System.out.print(a[i]+", ");
System.out.println("\b\b ");
sc.close();
}
}
