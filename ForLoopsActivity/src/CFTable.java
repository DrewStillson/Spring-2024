public class CFTable {
    public static void main(String [] args) {

        System.out.println("Celcius \tFahrenheit");
        System.out.println("**********************");
        double f;

        for (int i = 0; i < 21; i++) {
            f = (i * (9.0/5) + 32);
            System.out.printf("\t" + i + " \t\t%.1f", f);
            System.out.println();
        }

    }
}
