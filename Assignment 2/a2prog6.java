/*
Write a Java program to show constructor overloading.
*/

import java.util.Scanner;

class Demo6
{
String id, name;
	
Demo6()
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter ID  : ");
id = sc.next();

System.out.print("Enter name: ");
name = sc.next();
}
	
Demo6(String id, String name)
{
this.id = id;
this.name = name;
}
		
void printData()
{
System.out.println("ID  : "+id);
System.out.println("Name: "+name);
}
}

class a2prog6
{
public static void main(String args[])
{
Demo6 obj1, obj2;
obj1 = new Demo6();
obj2 = new Demo6("EMP102","Kavitha");
obj1.printData();
obj2.printData();
}
}
