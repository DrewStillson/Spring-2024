import java.util.Scanner;
public class Rectangle {
    static Scanner reader = new Scanner(System.in);

    public static double getLength() {
        System.out.print("Enter in the length of your rectangle: ");
        return reader.nextDouble();
    }
    public static double getWidth() {
        reader.nextLine();
        System.out.print("Enter in the width of your rectangle: ");
        return reader.nextDouble();
    }
    public static double getArea(double l, double w) {
        return l*w;
    }
    public static void displayData(double l, double w, double a) {
        System.out.print("Rectangle length: " + (int)l + "\nRectangle width: " + (int)w + "\nRectangle Area: " + (int)a);
    }

    public static void main(String [] args) {

        double length = getLength();
        double width = getWidth();
        double area = getArea(length, width);
        displayData(length, width, area);

        reader.close();
    }
}
