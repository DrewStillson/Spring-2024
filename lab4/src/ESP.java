import java.util.Scanner;
public class ESP {
    public static void main(String [] args) {

        Scanner reader = new Scanner(System.in);
        String compGuess;
        int numRight = 0;

        for (int i = 1; i <= 10; i++) {
            int random = (int)(Math.random() * 4);
            System.out.println(i + ". What color has the computer chosen?");
            String guess = reader.nextLine();

            if (random == 0) {
                compGuess = "red";
            }
            else if (random == 1) {
                compGuess = "green";
            }
            else if (random == 2) {
                compGuess = "blue";
            }
            else if (random == 3) {
                compGuess = "orange";
            }
            else {
                compGuess = "yellow";
            }

            System.out.println("> The computer chose " + compGuess);

            if (compGuess.equals(guess)) {
                numRight++;
            }
        }

        System.out.println("You got " + numRight + " out of 10 correct");

    }
}
