import java.util.Scanner;
public class DistanceTraveled {
    public static void main (String [] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the speed fo the vehicle in mph: ");
        int speed = reader.nextInt();

        System.out.print("Enter the number of hours traveling: ");
        int hours = reader.nextInt();

        System.out.println("Hour \tDistance Traveled");
        System.out.println("------------------------------");

        for (int i = 1; i <= hours; i++) {
            int dist = speed * i;
            System.out.println(i + " \t\t\t" + dist);
        }

    }
}
