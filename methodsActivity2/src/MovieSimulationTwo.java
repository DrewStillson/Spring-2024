public class MovieSimulationTwo {
    public static void main(String [] args) {
            String[] names = new String[]{"Jumanji", "Matrix", "Star Wars", "Oppenheimer"};
            String[] types = new String[]{"2D", "3D","2D", "Drama/Historical"};
            double[] prices = new double[]{15.15, 20.15, 18.11, 22.12};
            final int ROWS = 5;
            final int COLLUMNS = 10;
            int[][] movieAvailability = new int [ROWS][COLLUMNS];

            displayMovieDetails(names, types, prices);
            System.out.println();
            System.out.println("------------------INITIAL SEATS-------------------");
            System.out.println();
            setSeatAvailability(movieAvailability);
            displaySeatAvailability(movieAvailability);
            randomizeAvailability(movieAvailability);
            System.out.println();
            System.out.println("------------------RANDOM SEATS-------------------");
            System.out.println();
            displaySeatAvailability(movieAvailability);

    }
    public static void displayMovieDetails(String[] array1, String[] array2, double[] array3) {
        System.out.println("----------------------------- Movie Details --------------------------------");
        System.out.println("\t\tMovie Name \tMovie Type \tMovie Price");
        for (int i = 0; i < array1.length; i++) {
            System.out.printf("Movie: %-15s %-15s $%-15.2f\n", array1[i], array2[i], array3[i]);
        }
    }
    public static void setSeatAvailability(int[][] array) {
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 0;
            }
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
}
