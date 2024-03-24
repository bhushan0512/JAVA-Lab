/*
Write a class, Grader, which has an instance variable, score, an appropriate constructor and appropriate methods. A method, letterGrade() that returns the letter grade as O/E/A/B/C/F.
Now write a demo class to test the Grader class by reading a score from the user, using it to create a Grader object after validating that the value is not negative and is not greater then 100. Finally, call the letterGrade() method to get and print the grade.
*/

import java.util.Scanner;

class Grader
{
int score;
Grader(int score)
{
this.score = score;
}
	
char letterGrade()
{
if(score <= 35)
return 'F';

else if(score <= 50)
return 'C';

else if(score <= 65)
return 'B';

else if(score <= 80)
return 'A';

else if(score <= 95)
return 'E';

else
return 'O';
}
}

class a2prog8
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int score;

do
{
System.out.print("Enter valid score: ");
score = sc.nextInt();
}

while(score < 0 || score > 100);
Grader g = new Grader(score);

System.out.println("Grade: "+g.letterGrade());
}
}
