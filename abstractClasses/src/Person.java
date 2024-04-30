public abstract class Person {
    protected String name;
    protected int birthYear;

    public void setName(String n) {
        this.name = n;
    }
    public void setBirthYear(int y) {
        this.birthYear = y;
    }
    public String getName() {
        return this.name;
    }
    public int getBirthYear() {
        return this.birthYear;
    }
    abstract int computeAge();
    abstract void getInfo();
}
