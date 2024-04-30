import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String [] args){

        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        int randNum = random.nextInt(1, 101);
        int counter = 0;
        int numGuess;

        System.out.println("Guess a number between 1 and 100, or enter \"q\" if you want to give up: ");
        String guess = reader.nextLine();

        while (!guess.equals("q")) {
            numGuess = Integer.parseInt(guess);
            counter++;

            if (numGuess == randNum){
                System.out.println("Correct");
                break;
            }
            else if (numGuess > randNum){
                System.out.println("Too high. Guess again: ");
            }
            else {
                System.out.println("Too low. Guess again: ");
            }
            guess = reader.nextLine();
        }

        if (guess.equals("q")) {
            System.out.println("Quitter! The number was " + randNum + ".");
        }
        else{
            System.out.print("Number of guesses: " + counter);
        }

    }
}
