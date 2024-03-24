/*
Write a Java program to show parameterized constructor
*/

class Demo4
{
String status;
Demo4(String status)
{
this.status = status;
}
	
void printData()
{
System.out.println("Status: "+status);
}
}

class a2prog4
{
public static void main(String args[])
{
Demo4 obj = new Demo4("Parameter to constructor passed");
obj.printData();
}
}
