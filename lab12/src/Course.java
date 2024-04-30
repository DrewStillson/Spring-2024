public class Course {
    private String courseName;
    private int credits;

    public Course(String name, int credits) {
        this.courseName = name;
        this.credits = credits;
    }

    @Override
    public String toString() {
        return String.format("Course: %s\n" +
                "Credits: %d\n\n",
                courseName, credits);
    }

    public String getCourseName() {
        return this.courseName;
    }
}
