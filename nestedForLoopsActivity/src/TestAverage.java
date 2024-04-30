import java.util.Scanner;
public class TestAverage {
    public static void main(String [] args) {

        Scanner reader = new Scanner(System.in);
        double average;

        System.out.print("Enter the number of students: ");
        int numStudents = reader.nextInt();
        System.out.print("Enter the number of tests per student: ");
        int numScores = reader.nextInt();
        System.out.println();

        for (int i = 1; i <= numStudents; i++) {
            double total = 0;
            System.out.println("Student number " + i);
            System.out.println("-------------------");
            for (int j = 1; j <= numScores; j++) {
                System.out.print("Enter score " + j + ": ");
                int score = reader.nextInt();
                total += score;
            }
            average = total/numScores;
            System.out.printf("The average for student " + i + " is %.2f", average);
            System.out.println();
            System.out.println();
        }

    }
}
