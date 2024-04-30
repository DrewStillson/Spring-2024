import java.util.Scanner;
public class GCDTest {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = reader.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = reader.nextInt();
        GCD gcd = new GCD();
        System.out.println("1. for loop gcd: " + gcd.findGCDForLoop(num1, num2));
        System.out.println("2. while loop gcd: " + gcd.findGCDWhileLoop(num1, num2));
        System.out.println("3. recursive loop gcd: " + gcd.findGCDRecursively(num1, num2));
        System.out.println("\nOptional Bonus");
        System.out.println("Enter a positive number: ");
        int posNum = reader.nextInt();
        System.out.println("Enter a negative number: ");
        int negNum = reader.nextInt();
        System.out.println("4. negative gcd: " + gcd.findNegativeGCD(posNum, negNum));
    }
}
