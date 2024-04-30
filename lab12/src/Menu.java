import java.util.Scanner;


public class Menu {
    // Instances of the Scanner Class & Student Record Class.

    private Scanner scanner = new Scanner(System.in);
    private StudentRecord record = new StudentRecord();

    // default constructor--don't need to write

    // method to display menu
    public void displayMenu() {
        while (true) {
            String selection;
            System.out.printf("\n%s MENU %s\n", "*".repeat(9), "*".repeat(9));
            System.out.print("Please make a selection:\n" +
                    "1) Add a Student\n" +
                    "2) Remove a Student\n" +
                    "3) Display Student Info\n" +
                    "4) Display All Student Info\n" +
                    "5) Exit\n" +
                    ">> ");
            selection = scanner.nextLine();   // Get information from user
            // If-else-if  statements to
            if (selection.equals("1")) {
                createStudent();
            } else if (selection.equals("2")) {
                deleteStudent();
            } else if (selection.equals("3")) {
                displayStudent();
            } else if (selection.equals("4")) {
                displayAllStudents();
            } else if (selection.equals("5")) {
                System.out.println("Exiting...");
                break;
            }
            else {
                System.out.println("Invalid entry");
            }
        }
    }

    private void createStudent() {
        String name;
        String id;
        Student student;
        String courseName;
        int credits;
        Course course;

        System.out.print("Enter the Student name: ");
        name = scanner.nextLine();
        System.out.print("Enter the Student id: ");
        id =  scanner.nextLine();
        student = new Student(name, id);
        System.out.printf("Enter Courses for %s.\n", name);
        while (true) {
            System.out.print("\tEnter a Course name or q if finished: ");
            courseName = scanner.nextLine();
            if (courseName.equals("q")) {
                break;
            }
            System.out.print("\tEnter course's credits: ");
            credits = Integer.parseInt( scanner.nextLine() );
            course = new Course(courseName, credits);
            student.addCourse(course);
        }
        record.addStudent(student);
        System.out.printf("%s added to Record\n\n", name);
    }

    private void deleteStudent() {
        String name;
        Student student;
        System.out.print("Enter the ID of the Student " +
                "you want to delete: ");
        name = scanner.nextLine();
        student = record.getStudent(name);
        if (student == null) {
            System.out.println("Student not found.");
        } else {
            record.removeStudent(student);
            System.out.printf("%s removed from Record\n", student.getName());
        }
    }
    //private void displayStudent() {
    private void displayStudent() {
        String id;
        Student student;
        System.out.print("Enter the ID of the Student " +
                "to see info: ");
        id = scanner.nextLine();
        student = record.getStudent(id);
        if (student == null) {
            System.out.println("Student not found.");
        } else {
            System.out.println(student);
        }
    }

    private void displayAllStudents() {
        System.out.println(record.getAllStudents());
    }
}
