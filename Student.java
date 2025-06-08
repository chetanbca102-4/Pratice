// Student.java
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Student {
    private String name;
    private Date dob;

    public Student(String name, String dobStr) throws ParseException {
        this.name = name;

        // Accepts both DD-MM-YYYY and YYYY-MM-DD
        if (dobStr.matches("\\d{2}-\\d{2}-\\d{4}")) {
            this.dob = new SimpleDateFormat("dd-MM-yyyy").parse(dobStr);
        } else if (dobStr.matches("\\d{4}-\\d{2}-\\d{2}")) {
            this.dob = new SimpleDateFormat("yyyy-MM-dd").parse(dobStr);
        } else {
            throw new IllegalArgumentException("Invalid date format!");
        }
    }

    public int calculateAge() {
        long diffInMillies = Math.abs(new Date().getTime() - dob.getTime());
        long days = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        return (int)(days / 365);
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + calculateAge());
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter Date of Birth (DD-MM-YYYY or YYYY-MM-DD): ");
        String dob = sc.nextLine();

        Student s = new Student(name, dob);
        s.displayStudentInfo();
    }
}
