/*
Create an outer class with a function display, again create another class inside the outer class named inner with a function called display and call the two functions in the main class.
*/

class OuterClass
{
void display()
{
System.out.println("Outer class display method");
}
	
class InnerClass
{
void display()
{
System.out.println("Inner class display method");
}
}
}

class program9
{	
public static void main(String args[])
{
OuterClass obj = new OuterClass();
obj.display();

OuterClass.InnerClass objk = obj.new InnerClass();
objk.display();
}
}
