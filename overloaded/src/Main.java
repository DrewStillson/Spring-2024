
public class Main {
    public static void main(String[] args) {

        IceCream item1 = new IceCream();
        IceCream item2 = new IceCream("Chocolate");
        IceCream item3 = new IceCream("Rocky Road", 2, "Waffle", true);

        item3.setFlavor();
        item3.setFlavor("Strawberry");

        System.out.println("Your Ice Cream - \n" + "Flavor: " + item3.getFlavor() +
                "\nScoop #: " + item3.getScoops() + "\nCone: " + item3.getCone() + "\nHas Sprinkles: " + item3.getSprinkles());

    }
}
