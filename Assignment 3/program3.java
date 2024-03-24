/*
Write a program to give the example for method overriding concepts.
*/

class X
{
void display()
{
System.out.println("Class X method (parent class method)");
}
}

class Y extends X
{
void display()
{
System.out.println("Class Y method (overloaded child class method)");
super.display();
}
}

class program3
{	
public static void main(String args[])
{
Y obj = new Y();
obj.display();
}
}
