/*
Write a class, Commission, which has an instance variable, sales; an appropriate constructor; and a method, commission() that returns the commission. Now write a demo class to test the Commission class by reading a sale from the user, using it to create a Commission object after validating that the value is not negative. Finally, call the commission() method to get and print the commission. If the sales are negative, your demo should print the message “Invalid Input”.
*/

import java.util.Scanner;

class Commission
{
float sales;
Commission(float sales)
{
this.sales = sales;
}
	
float commission()
{
return (float)0.1*sales;
}
}

class a2prog9
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
float sales;

System.out.print("Enter sales: ");
sales = sc.nextFloat();

if(sales < 0)
{
System.out.println("Invalid input");
return;
}

Commission c = new Commission(sales);
System.out.println("Commission (10%): "+c.commission());
}
}
