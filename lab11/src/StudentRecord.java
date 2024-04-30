import java.util.ArrayList;
public class StudentRecord {

    private ArrayList<Student> studentList = new ArrayList<>();

    public ArrayList<Student> getStudentList() {
        return this.studentList;
    }
    public void addStudent(Student student) {
        this.studentList.add(student);
    }
    public void removeStudent(Student student) {
        this.studentList.remove(student);
    }
    public Student getStudent(String studentName) {
        Student wantedStudent = null;
        for (Student student: studentList) {
            if (student.getStudentName().equals(studentName)) {
                wantedStudent = student;
                break;
            }
        }
        return wantedStudent;
    }
    public StringBuilder getAllStudents(){
        StringBuilder studentStringBuilder = new StringBuilder();
        for (Student student: studentList) {
            studentStringBuilder.append(student.toString());
        }
        return studentStringBuilder;
    }

}
