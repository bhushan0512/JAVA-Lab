import java.util.Scanner;

class employee3
{
int empno;
String ename;
char grade;
float salary;
float commission;
	
employee3()
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
}
	
void findCommission()
{
Scanner sc = new Scanner(System.in);

while(true)
{
if(grade == 'A' || grade == 'a')
{
commission = (float)(salary * 0.14);
break;
}

else if(grade == 'B' || grade == 'b')
{
commission = (float)(salary * 0.1);
break;
}

else if(grade == 'C' || grade == 'c')
{
commission = (float)(salary * 0.07);
break;
}

else
{
System.out.println("Invalid grade");

System.out.print("Enter employee grade : ");
grade = sc.next().charAt(0);
}
}

sc.close();
System.out.println("Employee number    : "+empno);
System.out.println("Employee name      : "+ename);
System.out.println("Employee grade     : "+grade);
System.out.println("Employee salary    : "+salary);
System.out.println("Employee commission: "+commission);
}
}

class a1prog8
{   
public static void main(String args[])
{
employee3 e = new employee3();
e.findCommission();
}
}
