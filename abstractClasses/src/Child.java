public class Child extends Person {
    private String schoolName;

    public Child(String n, int y, String s) {
        this.name = n;
        this.birthYear = y;
        this.schoolName = s;
    }

    @Override
    public int computeAge() {
        return 2024-this.birthYear;
    }
    @Override
    public void getInfo() {
        System.out.println("Child's Name: " + this.name + "\nBirth Year: "
        + this.birthYear + "\nSchool: " + this.schoolName);
    }

}
