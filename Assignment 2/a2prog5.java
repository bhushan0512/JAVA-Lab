/*
WAP using parameterized constructor with two parameters id and name. While creating the objects obj1 and obj2
passed two arguments so that this constructor gets invoked after creation of obj1 and obj2.
*/

class Demo5
{
String id, name;
Demo5(String id, String name)
{
this.id = id;
this.name = name;
}
	
void printData()
{
System.out.println("ID  : "+id);
System.out.println("Name: "+name);
}
}

class a2prog5
{
public static void main(String args[])
{
Demo5 obj1, obj2;
obj1 = new Demo5("EMP101","Karan");
obj2 = new Demo5("EMP102","Kavitha");
obj1.printData();
obj2.printData();
}
}
