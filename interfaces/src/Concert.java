public class Concert implements Event{
    private int numPeople;
    private int hours;

    public Concert(int people, int time) {
        this.numPeople = people;
        this.hours = time;
    }

    @Override
    public double computePrice() {
        return (this.hours * this.numPeople * 8.99);
    }
}
