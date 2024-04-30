import java.util.HashMap;
public class StudentRecord {
    private HashMap<String, Student> studentMap = new HashMap<>();

    public void addStudent(Student student) {
        studentMap.put(student.getID(), student);
    }

    public void removeStudent(Student student) {
        studentMap.remove(student.getID());
    }

    public Student getStudent(String id) {
        Student foundStudent = null;
        for (String theID: studentMap.keySet()) {
            if (theID.equals(id)) {
                foundStudent = studentMap.get(theID);
                break;
            }
        }
        return foundStudent;
    }

    public StringBuilder getAllStudents() {
        StringBuilder studentStringBuilder = new StringBuilder();
        for (String id : studentMap.keySet()) {
            studentStringBuilder.append(studentMap.get(id));
        }
        return studentStringBuilder;
    }
}
