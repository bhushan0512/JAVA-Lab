package Assignment1;
import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for total semesters
        System.out.print("Enter total semesters: ");
        int totalSemesters = scanner.nextInt();

        int totalMarks = 0;

        // Ask for marks in 5 semesters
        System.out.println("Enter marks for " + totalSemesters + " semesters:");

        // Read marks and calculate total marks
        int[] marksArray = new int[totalSemesters];
        for (int i = 0; i < totalSemesters; i++) {
            System.out.print("Semester " + (i + 1) + ": ");
            marksArray[i] = scanner.nextInt();
            totalMarks += marksArray[i];
        }

        // Calculate total percentage
        double totalPercentage = ((double) totalMarks / (totalSemesters * 100)) * 100;

        // Calculate CGPA
        double cgpa = totalPercentage / 10;

        // Display marks, CGPA, and total percentage
        System.out.println("\nMarks for " + totalSemesters + " semesters:");
        for (int i = 0; i < totalSemesters; i++) {
            System.out.println("Semester " + (i + 1) + ": " + marksArray[i]);
        }
        System.out.println("\nTotal Percentage: " + totalPercentage + "%");
        System.out.println("CGPA: " + cgpa);
    }
}
