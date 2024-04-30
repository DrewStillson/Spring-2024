import java.util.Scanner;
public class ScannerInterest {
    public static void main(String [] args){

        Scanner reader = new Scanner(System.in);

        int principal;
        int inputRate;
        int numCompounded;
        int years;
        double money;

        System.out.print("What is the original principal: ");
        principal = reader.nextInt();

        System.out.print("What is the annual interest rate: ");
        inputRate = reader.nextInt();
        double rate = inputRate/100.0;

        System.out.print("How many times per year is interest compounded: ");
        numCompounded = reader.nextInt();

        System.out.print("For how many years will interest be compounded: ");
        years = reader.nextInt();

        money = principal * Math.pow(1 + rate / numCompounded, numCompounded * years);

        System.out.print("After " + years + " years you will have $");
        System.out.printf("%.2f", money + ".");

    }
}
