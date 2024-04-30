import java.util.Scanner;
public class MovieSimulationOne {
    public static void main(String [] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("How many movies do you want to enter: ");
        int numMovies = reader.nextInt();

        String [] names = new String[numMovies];
        String [] types = new String[numMovies];
        int [] avails = new int[numMovies];
        double [] prices = new double[numMovies];

        for (int i = 0; i < numMovies; i++) {
            System.out.println("Enter the information for Movie " + (i+1) + "- ");
            System.out.println("Enter the name: ");
            names[i] = reader.next();
            System.out.println("Enter the type: ");
            types[i] = reader.next();
            System.out.println("Enter the seats available: ");
            avails[i] = reader.nextInt();
            System.out.println("Enter the price: ");
            prices[i] = reader.nextDouble();
        }

        printMovies(numMovies, names, types, avails, prices);

    }
    public static void printMovies(int num, String[] name, String[] type, int[] seats, double[] price) {
        System.out.println("----------------------------- Movie Details --------------------------------");
        System.out.println("\t\tMovie Name \tMovie Type \tAvailable Seats \tMovie Price");
        for (int i = 0; i < num; i++) {
            System.out.printf("Movie: %-15s %-15s %-15d $%-15.2f\n", name[i], type[i], seats[i], price[i]);
        }
    }
}
