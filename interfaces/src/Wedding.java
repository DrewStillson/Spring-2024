public class Wedding implements Event{
    private int numPeople;
    private int hours;

    public Wedding(int people, int time) {
        this.numPeople = people;
        this.hours = time;
    }

    @Override
    public double computePrice() {
        return (this.hours * this.numPeople * 4.99);
    }
}
