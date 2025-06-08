// StudentCourses.java
import java.util.HashMap;
import java.util.Map;

public class StudentCourses {
    private Map<String, Integer> semester1;
    private Map<String, Integer> semester2;

    public StudentCourses() {
        semester1 = new HashMap<>();
        semester2 = new HashMap<>();

        semester1.put("Mathematics", 85);
        semester1.put("Physics", 78);
        semester1.put("Chemistry", 90);

        semester2.put("Data Structures", 88);
        semester2.put("OOP", 80);
        semester2.put("DBMS", 82);
    }

    public void displayCoursesAndMarks() {
        System.out.println("Semester 1 Courses and Marks:");
        for (String course : semester1.keySet()) {
            System.out.println(course + ": " + semester1.get(course));
        }

        System.out.println("\nSemester 2 Courses and Marks:");
        for (String course : semester2.keySet()) {
            System.out.println(course + ": " + semester2.get(course));
        }
    }

    public static void main(String[] args) {
        StudentCourses sc = new StudentCourses();
        sc.displayCoursesAndMarks();
    }
}
