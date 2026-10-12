import java.util.Scanner;

// 1. The Student class defines the common structure (the blueprint)
class Student {
    int id;
    String name;
    double gpa;

    // Constructor to initialize student details
    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    // Method to display individual student details
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", GPA: " + gpa);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students to register: ");
        int totalStudents = sc.nextInt();

        // 2. Create an array to hold multiple Student objects
        Student[] studentList = new Student[totalStudents];

        // Loop to create and populate each Student object
        for (int i = 0; i < totalStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next(); // Reads a single-word name

            System.out.print("Enter GPA: ");
            double gpa = sc.nextDouble();

            // Instantiate a new Student object for each entry
            studentList[i] = new Student(id, name, gpa);
        }

        // Displaying all collected student records
        System.out.println("\n--- Registered Placement Students ---");
        for (Student s : studentList) {
            s.displayDetails(); // Each object runs its own structured method
        }

        sc.close();
    }
}
