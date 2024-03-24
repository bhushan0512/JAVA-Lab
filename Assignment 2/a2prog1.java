/*
Write a program to create a class Student with data ‘name, city and age’ along with method printData to display the data. Create the two objects s1 ,s2 to declare and access the values.
*/

import java.util.Scanner;

class Student
{
String name;
int age;
String city;
	
Student()
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter name: ");
name = sc.next();

System.out.print("Enter age : ");
age = sc.nextInt();

System.out.print("Enter city: ");
city = sc.next();
}
	
void printData()
{
System.out.println("Name: "+name);
System.out.println("Age : "+age);
System.out.println("City: "+city);
}
}

class a2prog1
{
public static void main(String args[])
{
Student s1 = new Student();
Student s2 = new Student();

s1.printData();
s2.printData();
}
}
