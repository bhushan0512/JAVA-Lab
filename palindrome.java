import java.io.*;
import java.util.*;
class palindrome
{
public static void main(String args[])throws IOException
{
String str,rev="";
System.out.println("Enter the string");
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
for(int i=str.length()-1;i>=0;i--)
rev=rev+str.charAt(i);
{
if(rev.equals(str))
System.out.println("It is palindrome");
else
System.out.println("It is  not palindrome");
}
}
}
