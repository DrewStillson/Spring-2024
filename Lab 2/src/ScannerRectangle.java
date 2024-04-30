import java.util.Scanner;
public class ScannerRectangle {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        int length = reader.nextInt();

        System.out.print("Enter the width of the rectangle: ");
        int width = reader.nextInt();

        int area = length * width;
        int perimeter = 2*length + 2*width;

        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);

    }
}