/*
Accept empcode(example: APRD101 where first letter will be A/B/C, next three characters will be PRD/ACC/SLS), name, basic. 
If dept is SLS, Da will be 13% of basic and hra will be 14% of basic.
If dept is PRD, Da will be 9% of basic and hra will be 10% of basic.
If dept is ACC, Da will be 5% of basic and hra will be 7% of basic.
Net will be basic+da+hra.
Display the Name, grade, dept, basic, da, hra and net.
*/

import java.util.Scanner;

class Employee
{
String empcode, grade, dept;
String name;
float basic, DA, HRA, net;
	
Employee()
{
Scanner sc = new Scanner(System.in);
entercode:

do
{
System.out.print("Enter valid employee number: ");
empcode = sc.next();

if(empcode.length() == 7)
{
grade = empcode.substring(0,1);
dept = empcode.substring(1,4);

switch(grade)
{
case "A":
case "B":
case "C":

switch(dept)
{
case "PRD":
case "ACC":
case "SLS":
break entercode;
}
}
}
}
while(true);

System.out.print("Enter employee name        : ");
name = sc.next();

System.out.print("Enter basic salary         : ");
basic = sc.nextFloat();
}
	
void findSalary()
{
switch(dept)
{
case "PRD":
DA = (float) 0.09 * basic;
HRA = (float) 0.10 * basic;
break;

case "ACC":
DA = (float) 0.05 * basic;
HRA = (float) 0.07 * basic;
break;

case "SLS":
DA = (float) 0.13 * basic;
HRA = (float) 0.14 * basic;
break;
}

net = basic + DA + HRA;
}
}

class a0prog6
{
public static void main(String args[])
{
Employee obj = new Employee();
obj.findSalary();
System.out.println("Employee code: "+obj.empcode);
System.out.println("Name         : "+obj.name);
System.out.println("Grade        : "+obj.grade);
System.out.println("Department   : "+obj.dept);
System.out.println("Basic salary : "+obj.basic);
System.out.println("DA           : "+obj.DA);
System.out.println("HRA          : "+obj.HRA);
System.out.println("Net salary   : "+obj.net);
}
}
