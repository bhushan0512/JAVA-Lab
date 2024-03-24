import java.util.Scanner;

class employee1
{
int empno;
String ename;
char grade;
float salary;
float commission;
	
employee1()
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter employee number: ");
empno = sc.nextInt();

System.out.print("Enter employee name  : ");
ename = sc.next();

System.out.print("Enter employee grade : ");
grade = sc.next().charAt(0);

System.out.print("Enter employee salary: ");
salary = sc.nextFloat();

sc.close();
}
	
void findCommission()
{
if(grade == 'A' || grade == 'a')
commission = (float)(salary * 0.14);

else if(grade == 'B' || grade == 'b')
commission = (float)(salary * 0.1);

else if(grade == 'C' || grade == 'c')
commission = (float)(salary * 0.07);

else
{
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

class a1prog6
{   
public static void main (String args[])
{
employee1 e = new employee1();
e.findCommission();
}
}
