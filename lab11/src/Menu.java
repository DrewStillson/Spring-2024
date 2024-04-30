import java.util.Scanner;
import java.util.ArrayList;
public class Menu {

    private Scanner reader = new Scanner(System.in);
    StudentRecord studentRecord = new StudentRecord();

    public void displayMenu() {
        while (true) {
            System.out.print("********** MENU **********\n" +
                    "1) Add a Student\n" +
                    "2) Remove a Student\n" +
                    "3) Display Student Info\n" +
                    "4) Display All Students' Info\n" +
                    "5) Exit\n" +
                    ">> ");
            int choice = reader.nextInt();
            reader.nextLine();
            if (choice == 1) {
                createStudent();
            }
            else if (choice == 2) {
                removeStudent();
            }
            else if (choice == 3) {
                displayStudentInfo();
            }
            else if (choice == 4) {
                displayAllStudentInfo();
            }
            else if (choice == 5) {
                break;
            }
            else {
                System.out.println("That is not one of the options try again!");
            }
        }
    }
    public void createStudent() {
        System.out.print("Enter the name of the student: ");
        String name = reader.nextLine();
        System.out.print("Enter the ID of the student: ");
        int id = reader.nextInt();
        reader.nextLine();

        Student student = new Student(name, id);

        while (true) {
            System.out.print("Enter the name of the course you would like to add or q to quit: ");
            String choice = reader.nextLine();
            if (choice.equals("q")) {
                break;
            }
            System.out.print("Enter the course hours: ");
            int hours = reader.nextInt();
            reader.nextLine();
            Course course = new Course(choice, hours);
            student.addCourse(course);
            System.out.println(course.getCourseTitle() + " added to courses.");
        }
        studentRecord.addStudent(student);
    }
    public void removeStudent() {
        System.out.print("What is the name of the student you would like to remove: ");
        String removedStudent = reader.nextLine();
        if (studentRecord.getStudent(removedStudent) == null) {
            System.out.println("This student does not exist.");
        }
        Student selectedStudent = studentRecord.getStudent(removedStudent);
        System.out.println(selectedStudent.getStudentName() + " has been removed.");
        studentRecord.removeStudent(studentRecord.getStudent(removedStudent));
    }
    public void displayStudentInfo() {
        System.out.print("What is the name of the student you would like to display: ");
        String displayedStudent = reader.nextLine();
        if (studentRecord.getStudent(displayedStudent) == null) {
            System.out.println("This student does not exist.");
        }
        else {
            System.out.println(studentRecord.getStudent(displayedStudent));
        }
    }
    public void displayAllStudentInfo() {
        ArrayList<Student> studentList = studentRecord.getStudentList();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

}
