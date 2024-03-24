/*
Write a program to create a class Student2 along with two method getData(),printData() to get the value through
argument and display the data in printData. Create the two objects s1 ,s2 to declare and access the values from
class STtest.
*/

class Student2
{
String name;
int age;
String city;
	
void getData(String name, int age, String city)
{
this.name = name;
this.age = age;
this.city = city;
}
	
void printData()
{
System.out.println("Name: "+name);
System.out.println("Age : "+age);
System.out.println("City: "+city);
}
}

class a2prog2
{
public static void main(String args[])
{
Student2 s1 = new Student2();
Student2 s2 = new Student2();
s1.getData("Karan",21,"Mangalore");
s2.getData("Kavitha",21,"Udupi");
s1.printData();
s2.printData();
}
}
