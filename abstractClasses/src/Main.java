public class Main {
    public static void main(String [] args) {

        Parent parent1 = new Parent("Steve", 1984, "Kevin");
        Child child1 = new Child("Kevin", 2009, "Tipton");

        System.out.println("Parent 1 Age: " + parent1.computeAge() +
                "\nChild 1 Age: " + child1.computeAge());
        parent1.getInfo();
        child1.getInfo();

    }
}
