import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input score
        System.out.print("Enter the student's score (0 - 100): ");
        int score = sc.nextInt();

        // Validate input
        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a number between 0 and 100.");
            return;
        }

        // Determine grade
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Output result
        System.out.println("The grade is: " + grade);
    }
}
