public class Course {

    private String courseTitle;
    private int creditHours;

    public Course(String title, int hours) {
        this.courseTitle = title;
        this.creditHours = hours;
    }
    public String getCourseTitle() {
        return this.courseTitle;
    }
    public void setCourseTitle(String title) {
        this.courseTitle = title;
    }
    public int getCreditHours() {
        return this.creditHours;
    }
    public void setCreditHours(int hours) {
        this.creditHours = hours;
    }
    @Override
    public String toString() {
        return ("Course Title: " + this.courseTitle + "\nCredit Hours: " + this.creditHours + "\n");
    }
}
