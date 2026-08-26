import java.util.Scanner;

public class ScoreToGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();

        // Determine the letter grade based on the score
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

        // Output the resulting grade
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
