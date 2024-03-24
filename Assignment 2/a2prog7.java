/*
Write a Java program to show METHOD overloading.
*/

class Demo7
{
String id, name;
Demo7(String id, String name)
{
this.id = id;
this.name = name;
}
	
void printData()
{
System.out.println("ID  : "+id);
System.out.println("Name: "+name);
}
	
void printData(String id, String name)
{
System.out.println("ID  : "+id);
System.out.println("Name: "+name);
}
}

class a2prog7
{
public static void main(String args[])
{
Demo7 obj = new Demo7("EMP101","Karan");
obj.printData();
obj.printData("EMP102","Kavitha");
}
}
