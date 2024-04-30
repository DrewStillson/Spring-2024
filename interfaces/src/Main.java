public class Main {
    public static void main(String [] args) {

        Wedding marriage = new Wedding(200, 15);
        Concert concert = new Concert(500, 5);

        System.out.println("Wedding Price: $" + marriage.computePrice() + "\nConcert Price: $" + concert.computePrice());

    }
}
