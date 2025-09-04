import java.util.Scanner;

public class GradeCalculator {
    	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("Student name?");
        String name = in.nextLine();
        System.out.println("Number of Studios Attended?");
        double studiosAttended = in.nextInt();
        double weightedstudiograde = ((studiosAttended/8) * 0.15);
        System.out.println("Weighted Studio Grade: " + weightedstudiograde);
        System.out.println("Average Quiz Grade?");
        double averageQuizGrade = in.nextInt();
        double weightedaverageQuizGrade = ((averageQuizGrade / 100) * 0.25);
        System.out.println("Weighted Average Exam Grade: " + weightedaverageQuizGrade);
        System.out.println("Average Exam Grade?");
        double averageExamGrade = in.nextInt();
        double weightedaverageExamGrade = ((averageExamGrade / 100) * 0.60);
        System.out.println("Weighted Average Exam Grade: " + weightedaverageExamGrade);
        double FinalGrade = weightedstudiograde + weightedaverageQuizGrade + weightedaverageExamGrade;
        System.out.println("Final Grade: " + (FinalGrade * 100) + "%");
        }
}
