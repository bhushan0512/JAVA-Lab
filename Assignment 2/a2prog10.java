/*
Write a Java program to calculate total, average and grade for 10 students. Consider the necessary datamembers and member methods required to achieve the requirements.
*/

import java.util.Scanner;

class Student10
{
int marks[] = new int[3];
int total = 0;
float avg;
char grade;
Student10()
{
Scanner sc = new Scanner(System.in);
for(int i=0;i<3;i++)
{
do
{
System.out.print("Enter marks in subject "+(i+1)+": ");
marks[i] = sc.nextInt();
}
while(marks[i] < 0 || marks[i] > 100);
}
}
	
void setResult()
{
for(int i=0;i<3;i++)
{
total += marks[i];
}
avg = (float)total/3;
for(int i=0;i<3;i++)
{
if(marks[i] <= 35)
{
grade = 'F';
return;
}
if(avg <= 35)
grade = 'F';
else if(avg <= 50)
grade = 'C';
else if(avg <= 65)
grade = 'B';
else if(avg <= 80)
grade = 'A';
else if(avg <= 95)
grade = 'E';
else
grade = 'O';
}
	
void getResult()
{
for(int i=0;i<3;i++)
{
System.out.println("Marks "+i+": "+marks[i]);
}
System.out.println("Total  : "+total);
System.out.println("Average: "+avg);
System.out.println("Grade  : "+grade);
System.out.println("");
}
}

class a2prog10
{
public static void main(String args[])
{
Student10 s[] = new Student10[10];

for(int i=0;i<10;i++)
{
System.out.println("Student "+(i+1)+":");

s[i] = new Student10();
s[i].setResult();
s[i].getResult();
}
}
}
