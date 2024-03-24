import java.util.Scanner;

class employee2
{
int empno;
String ename;
char grade;
float salary;
float commission;
	
employee2()
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter employee number: ");
empno = sc.nextInt();

System.out.println("Enter employee name  : ");
ename = sc.next();

System.out.println("Enter employee grade : ");
grade = sc.next().charAt(0);

System.out.println("Enter employee salary: ");
salary = sc.nextFloat();

sc.close();
}
	
void findCommission()
{

switch(grade)
{
case 'A':
case 'a':
commission = (float)(salary * 0.14);
break;

case 'B':
case 'b':
commission = (float)(salary * 0.1);
break;

case 'C':
case 'c':
commission = (float)(salary * 0.07);
break;

default:
System.out.println("Invalid grade");
System.exit(0);	
}

System.out.println("Employee number    : "+empno);
System.out.println("Employee name      : "+ename);
System.out.println("Employee grade     : "+grade);
System.out.println("Employee salary    : "+salary);
System.out.println("Employee commission: "+commission);
}
}

class a1prog7
{   
public static void main(String args[])
{
employee2 e = new employee2();
e.findCommission();
}
}
