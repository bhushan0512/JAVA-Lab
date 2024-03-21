package Assignment2;

import java.util.*;
import java.io.*;
class Alpha{
	int a,b;
	Alpha(int a,int b){
		this.a=a;
		this.b=b;
		a++;
		b++;
		System.out.println("Instance Variables are : a="+this.a+" and b="+this.b+"\n");
		System.out.println("Local Variables are : a="+a+" and b="+b+"\n");
		
	}
}
class prog4{
	public static void main(String args[]){
		Alpha ob=new Alpha(1,2);
	}
}