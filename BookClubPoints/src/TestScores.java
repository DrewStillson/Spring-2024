import java.util.Scanner;
public class TestScores {
    public static void main(String [] args){

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the first score: ");
        int score1 = reader.nextInt();

        System.out.print("Enter the second score: ");
        int score2 = reader.nextInt();

        System.out.print("Enter the third score: ");
        int score3 = reader.nextInt();

        double average = (score1 + score2 + score3) / 3.0;

        System.out.print("Your average grade is " + average + " and your letter grade is ");

        if (average >= 90) {
            System.out.print("A");
        }
        else if (average >= 80) {
            System.out.print("B");
        }
        else if (average >= 70){
            System.out.print("C");
        }
        else if (average >= 60){
            System.out.print("D");
        }
        else{
            System.out.print("F");


        }
    }


}
