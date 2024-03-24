package Assignment2;
import java.util.*;
import java.lang.*;

class StringReverse{
	String str;
	StringReverse(String str){
		this.str=str;
	}
	public String reverse(){
		int len=str.length();
		StringBuilder rev=new StringBuilder();
		for(int i=len-1;i>=0;i--){
			rev.append(str.charAt(i));
		}
		return rev.toString();
	}
}

class prog7{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str=sc.nextLine();
		StringReverse ob=new StringReverse(str);
		System.out.println("Reverse of "+str+" is "+ob.reverse()+"\n");
	}
}