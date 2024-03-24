/*
Write a program to create interface named test. In this interface the member function is square. Implement this interface in arithmetic class. Create one new class called ToTestInt in this class use the object of arithmetic class.
*/

interface Test
{
float square(float x);
}

class Arithmetic implements Test
{
public float square(float x)
{
return (float)(x*x);
}
}

class ToTestInt
{	
public static void main(String args[])
{
float x = 5;
Arithmetic obj = new Arithmetic();
System.out.println(x+"^2 = "+obj.square(x));
}
}
