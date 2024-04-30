public class Parent extends Person {

    private String childName;

    public Parent(String n, int y, String c) {
        this.name = n;
        this.birthYear = y;
        this.childName = c;
    }
    @Override
    public int computeAge() {
        return 2024-this.birthYear;
    }
    @Override
    public void getInfo() {
        System.out.println("Parent's Name: " + this.name + "\nBirth Year: " + this.birthYear +
                "\nParent's Child: " + this.childName);
    }
}
