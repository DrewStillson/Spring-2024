import java.util.ArrayList;
public class Student {

    private String studentName;
    private int studentID;
    private ArrayList<Course> courseList = new ArrayList<>();

    public Student(String name, int id) {
        this.studentName = name;
        this.studentID = id;
    }
    public void addCourse(Course course) {
        this.courseList.add(course);
    }
    public void removeCourse(Course course) {
        this.courseList.remove(course);
    }
    public ArrayList<Course> getCourseList() {
        return this.courseList;
    }
    public Course getCourse(String courseName) {
        Course wantedCourse = null;
        for (Course course: courseList) {
            if (course.getCourseTitle().equals(courseName)) {
                wantedCourse = course;
                break;
            }
        }
        return wantedCourse;
    }
    public StringBuilder getAllCourses(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Course course: courseList) {
            stringBuilder.append(course.toString());
        }
        return stringBuilder;
    }
    @Override
    public String toString() {
        return ("Student Name: " + this.studentName + "\nStudent ID: " + this.studentID + "\nCourses: " + getAllCourses());
    }
    public String getStudentName() {
        return this.studentName;
    }
    public int getStudentID() {
        return this.studentID;
    }
    public void setStudentName(String name) {
        this.studentName = name;
    }
    public void setStudentID(int id) {
        this.studentID = id;
    }

}
