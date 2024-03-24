/*
Write a program to create a class named shape. In this class we have three sub classes circle, triangle and square each class has two member function named draw () and erase (). Create these using polymorphism concepts.
*/

class Shape
{
void draw()
{
System.out.println("Draw shape");
}
	
void erase()
{
System.out.println("Erase shape");
}
}

class Circle extends Shape
{
void draw()
{
System.out.println("Draw circle");
}
	
void erase()
{
System.out.println("Erase circle");
}
}

class Triangle extends Shape
{
void draw()
{
System.out.println("Draw triangle");
}
	
void erase()
{
System.out.println("Erase triangle");
}
}

class Square extends Shape
{
void draw()
{
System.out.println("Draw square");
}
	
void erase()
{
System.out.println("Erase square");
}
}

class program5
{	
public static void main(String args[])
{

Shape obj;       
obj = new Shape();
obj.draw();
obj.erase();

System.out.println();
obj = new Circle();
obj.draw();
obj.erase();

System.out.println();
obj = new Triangle();
obj.draw();
obj.erase();

System.out.println();
obj = new Square();
obj.draw();
obj.erase();
}
}
