public class Main {
    public static void main(String [] args) {

        Student student = new Student("Drew", "Stillson", 1234, "CS", "Freshman", 3.7);

        student.addCourse("CS121");
        student.addCourse("MATH200");
        student.addCourse("ENG150");
        student.addCourse("BIO110");

        System.out.println("Print Student Info:\n" + student);
        System.out.println();
        System.out.println("Print Unsorted Student Courses:\n" + student.getStudentCourses());
        System.out.println();
        student.sortCourseList();
        System.out.println("Print Ordered Student Courses: \n" + student.getStudentCourses());
        System.out.println();
        student.removeCourse("MATH200");
        System.out.println("Print Removed Student Courses: \n" + student.getStudentCourses());


    }
}
