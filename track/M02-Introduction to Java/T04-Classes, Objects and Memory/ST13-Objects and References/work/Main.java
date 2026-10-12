class Student {
    String name;
}

public class Main {
    public static void main(String[] args) {
        // 1. Create a new Student object in memory
        Student firstStudent = new Student();
        firstStudent.name = "Asha";
        System.out.println("Original name: " + firstStudent.name); // Prints: Asha

        // 2. Both reference variables now point to the EXACT SAME object
        Student selectedStudent = firstStudent;

        // 3. Changing data via one variable updates the shared object
        selectedStudent.name = "Anu";

        // 4. Checking the value through the original variable
        System.out.println("Name after modification: " + firstStudent.name); // Prints: Anu
    }
}
