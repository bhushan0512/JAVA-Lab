
//Write a program to demonstrate static variables and methods.


class Demo1
{
static int age = 25;
	
static int getAge()
{
return age;
}
	
void display()
{
System.out.println("Age (non-static method): "+getAge());
}
}

class program1
{
public static void main(String args[])
{
System.out.println("Age (static method): "+Demo1.getAge());
Demo1 d = new Demo1();
d.display();
}
}
