import java.util.HashMap;
public class Student {
    private String name;
    private String id;
    private HashMap<String, Course> courseMap = new HashMap<>();

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // methods
    public String getName() {
        return name;
    }
    public String getID() {return id;}

    @Override
    public String toString() {
        return String.format("Name: %s\n" +
                        "ID: %s\n\n",
                name, id);
    }

    public void addCourse(Course course) {
        courseMap.put(course.getCourseName(), course);
    }

    public void removeCourse(Course course) {
        courseMap.remove(course.getCourseName());
    }

    public Course getCourse(String courseName) {
        Course foundCourse = null;
        for (String name : courseMap.keySet()) {
            if (name.equals(courseName)) {
                foundCourse = courseMap.get(name);
                break;
            }
        }
        return foundCourse;
    }

    public StringBuilder getAllCourses() {
        StringBuilder courseStringBuilder = new StringBuilder();
        for (String name: courseMap.keySet()) {
            Course course = courseMap.get(name);
            courseStringBuilder.append(course);
        }
        return courseStringBuilder;
    }
}
