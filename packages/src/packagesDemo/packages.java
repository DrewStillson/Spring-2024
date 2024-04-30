package packagesDemo;

public class packages {

    public String model;
    public double price;
    private int daysOnLot;
    private boolean isUsed;

    public packages(String m, double p, int d, boolean u) {
        model = m;
        price = p;
        daysOnLot = d;
        isUsed = u;
    }

    public double getPrice() {
        return price;
    }
    public void buyCar() {
        showCarInfo();
        testDrive(30);
    }
    private void testDrive(int time) {
        System.out.println("Going on a test drive for " + time + " minutes...");
    }

    private void showCarInfo() {
        System.out.println("Model: " + model + "\nPrice: $" + price + "\nDays on Lot: " + daysOnLot + "\nUsed: " + isUsed);
    }
}
