import java.util.Scanner;
public class TestScores {
    public static void main(String [] args) {

            Scanner reader = new Scanner(System.in);
            final int SIZE = (int)(Math.random() * 8 + 3);
            int[] scores = new int[SIZE];
            char[] grades = new char[SIZE];

            System.out.println("Enter your " + SIZE + " test scores");

            for (int i = 0; i < SIZE; i++) {
                System.out.print("Enter test " + (i+1) + " score: ");
                scores[i] = reader.nextInt();
                reader.nextLine();
            }
            System.out.println();

            for (int i = 0; i < SIZE; i++) {
                grades[i] = getLetterGrade(scores[i]);
            }

            printGrades(scores, grades);
            printHighestScore(scores);
            printLowestScore(scores);
            printAverageScore(scores);

    }
    public static char getLetterGrade(int score) {
        char result;

        if (score >= 90) {
            result = 'A';
        }
        else if (score >= 80) {
            result = 'B';
        }
        else if (score >= 70) {
            result = 'C';
        }
        else if (score >= 60) {
            result = 'D';
        }
        else {
            result = 'F';
        }
        return result;
    }
    public static void printGrades(int[] scores, char[] grades) {
        System.out.println("Score \tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(" " + scores[i] + " \t   " + grades[i]);
        }
    }
    public static void printHighestScore(int[] scores) {
        int highest = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
        }
        System.out.println("The highest score is " + highest);
    }
    public static void printLowestScore(int[] scores) {
        int lowest = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }
        System.out.println("The lowest score is " + lowest);
    }
    public static void printAverageScore(int[] scores) {
        double total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        double average = total/scores.length;
        System.out.printf("Average score is %.1f", average);
    }
}
