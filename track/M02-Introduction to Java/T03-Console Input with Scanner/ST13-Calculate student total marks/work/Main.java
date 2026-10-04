import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read the student name (single word)
        String studentName = scanner.next();

        // 2. Read the Java mark and SQL mark
        int javaMark = scanner.nextInt();
        int sqlMark = scanner.nextInt();

        // 3. Calculate the total marks
        int total = javaMark + sqlMark;

        // 4. Print the output exactly as required
        System.out.println("Student: " + studentName);
        System.out.println("Total: " + total);

        scanner.close();
    }
}
