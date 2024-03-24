import java.util.Scanner;

class a1prog1
{
public static void main (String args[])
{
byte b;
int i;
float f;
double d;
char ch;
boolean bl;
String Str;

Scanner sc = new Scanner(System.in);

System.out.println("Enter byte value:");
b=sc.nextByte();

System.out.println("Enter a Integer value:");
i=sc.nextInt();

System.out.println("Enter a Character:");
ch=sc.next().charAt(0);

System.out.println("Enter Float value:");
f=sc.nextFloat();

System.out.println("Enter Double value:");
d=sc.nextDouble();

System.out.println("Enter Boolean value:");
bl=sc.nextBoolean();

System.out.println("Enter String:");
Str=sc.next();

System.out.println(b +"\t"+ i +"\t"+ f +"\t"+ d +"\t"+ ch +"\t"+ bl +"\t"+ Str);
}
}
