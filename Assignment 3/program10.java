/* Write a program to give the example for ‘this’ operator And also use the ‘this’ keyword as return statement.*/

class Student 
{
String name;

Student(String name) 
{
this.name = name;
}

String display() 
{
return this.name;
}
}

public class program10 
{
public static void main(String args[]) 
{
Student s1 = new Student("ramesh");
Student s2 = new Student("suresh");

System.out.println(s1.display());
System.out.println(s2.display());
}
}
