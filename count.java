import java.io.*;
import java.util.*;
class count
{
public static void main(String args[])throws IOException
{
String str;
char ch;
int space=0,letter=0,other=0,number=0;
System.out.println("Enter the string");
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
for(int i=0;i<str.length();i++)
{
ch=str.charAt(i);
if(Character.isDigit(ch))
number++;
else if(Character.isLetter(ch))
letter++;
else if(Character.isWhitespace(ch))
space++;
else 
other++;
}
System.out.println("Letters:"+letter);
System.out.println("WhiteSpace:"+space);
System.out.println("Number:"+number);;
System.out.println("Other:"+other);
}
}
