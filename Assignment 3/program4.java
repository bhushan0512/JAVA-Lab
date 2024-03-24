/*
Write a program to give the example for ‘super’ keyword.
*/

class C
{
void display()
{
System.out.println("Class C method (parent/super class method)");
}
}

class D extends C
{
void display()
{
System.out.println("Class D method (child class method)");
super.display();
}
}

class program4
{	
public static void main(String args[])
{
D obj = new D();
obj.display();
}
}
