/*
Generate the first 15 Fibonacci numbers using an array.
*/

import java.util.Scanner;

class a0prog5
{

int fibonacci(int n)
{
if(n == 0 || n == 1)
return n;
return fibonacci(n-1) + fibonacci(n-2);
}	
	
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int fib[] = new int[15];

program5 obj = new program5();
for(int i=0;i<15;i++)
fib[i] = obj.fibonacci(i);

System.out.print("First 15 fibonacci numbers: ");
for(int i=0;i<15;i++)

System.out.print(fib[i]+", ");
System.out.println("\b\b ");

sc.close();
}
}
