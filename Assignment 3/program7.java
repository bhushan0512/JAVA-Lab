/*
Write a program to give example for multiple inheritance in Java.
*/

interface P
{
void meth1();
}

interface Q
{
void meth2();
}

class Demo7 implements P, Q
{
public void meth1()
{
System.out.println("Don't do meth");
}
	
public void meth2()
{
System.out.println("Let's do meth");
}
}

class program7
{	
public static void main(String args[])
{
Demo7 obj = new Demo7();
obj.meth1();
obj.meth2();
}
}
