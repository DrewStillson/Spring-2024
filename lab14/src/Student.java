import java.util.ArrayList;
public class Student {

    private String firstName;
    private String lastName;
    private int id;
    private String major;
    private String gradeLevel;
    private double gpa;
    private ArrayList<String> courseList = new ArrayList<>();

    public Student(String first, String last, int ID, String studentMajor, String level, double studentGpa) {
        this.firstName = first;
        this.lastName = last;
        this.id = ID;
        this.major = studentMajor;
        this.gradeLevel = level;
        this.gpa = studentGpa;
    }
    public void addCourse(String courseName) {
        courseList.add(courseName);
    }
    public void removeCourse(String courseName) {
        courseList.remove(courseName);
    }
    public String toString() {
        return ("Student Name: " + firstName + " " + lastName + "\nID: " + id +
                "\nMajor: " + major + "\nClass Standing: " + gradeLevel +
                "\nGPA: " + gpa);
    }
    public void sortCourseList() {
        String [] tempList = new String[courseList.size()];
        for (int i = 0; i < tempList.length; i++) {
            tempList[i] = courseList.get(i);
        }
        for (int i = 1; i < tempList.length; i++) {
            int j = i - 1;
            while (j > 0) {
                if (tempList[i].compareTo(tempList[j]) < 0) {
                    String temp = tempList[i];
                    tempList[i] = tempList[j];
                    tempList[j] = temp;
                    j--;
                }
            }
        }
        for (int i = 0; i < tempList.length; i++) {
            courseList.set(i, tempList[i]);
        }
    }
    public StringBuilder getStudentCourses() {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for (String course: courseList) {
            stringBuilder.append("Course " + count + ": " + course + "\n");
            count++;
        }
        return stringBuilder;
    }
}
