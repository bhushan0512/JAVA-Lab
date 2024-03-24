/*
Write a program for reuse class.
*/

class Demo2
{
Demo2(int i)
{
System.out.println("Class instance "+i);
}
}

class program2
{
public static void main(String args[])
{
new Demo2(1);
new Demo2(2);
}
}
