import java.util.Scanner;
public class MovieSimulationThree {
        static Scanner reader = new Scanner(System.in);
        public static void main(String [] args) {
            String[] names = new String[]{"Jumanji", "Matrix", "Star Wars", "Oppenheimer"};
            String[] types = new String[]{"2D", "3D","2D", "Drama/Historical"};
            double[] prices = new double[]{15.15, 20.15, 18.11, 22.12};
            final int ROWS = 5;
            final int COLUMNS = 10;
            int[][] movieAvailability = new int [ROWS][COLUMNS];

            displayMovieDetails(names, types, prices);
            System.out.println();
            int index = selectMovie(names);
            displaySelectedMovie(names, types, prices, index);
            randomizeAvailability(movieAvailability);
            System.out.println("------------------AVAILABLE SEATS-------------------");
            System.out.println();
            displaySeatAvailability(movieAvailability);
            reader.close();
        }
        public static void displayMovieDetails(String[] array1, String[] array2, double[] array3) {
            System.out.println("----------------------------- Movie Details --------------------------------");
            System.out.println("\t\tMovie Name \tMovie Type \tMovie Price");
            for (int i = 0; i < array1.length; i++) {
                System.out.printf("Movie " + (i+1) + ": %-15s %-15s $%-15.2f\n", array1[i], array2[i], array3[i]);
            }
        }
        public static void displaySeatAvailability(int[][] array) {
            System.out.println("Seating Availability: [1 = unavailable ; 0 = available]");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
        public static void randomizeAvailability(int[][] array) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = (int)(Math.random() * 2);
                }
            }
        }
        public static int selectMovie(String[] movies) {
            boolean correct = false;
            int chosenMovie = 0;
            while (!correct) {
                System.out.print("Enter the name of the movie you are purchasing tickets for: ");
                String choice = reader.nextLine();
                for (int i = 0; i < movies.length; i++) {
                    if (choice.equals(movies[i])) {
                        correct = true;
                        chosenMovie = i;
                    }
                }
                if (!correct) {
                    System.out.println("Movie not found! Please try again.");
                    System.out.println();
                }
            }
            return chosenMovie;
        }
    public static void displaySelectedMovie(String[] array1, String[] array2, double[] array3, int index) {
        System.out.println("------------------------- Movie Selection ----------------------------");
        System.out.println("Movie Name \tMovie Type \tMovie Price");
        System.out.printf("%-15s %-15s $%-15.2f\n", array1[index], array2[index], array3[index]);
        System.out.println();

    }
}
