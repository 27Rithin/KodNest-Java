import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read the integer age
        int age = scanner.nextInt();

        // 2. Consume the pending newline character left behind by nextInt()
        scanner.nextLine();

        // 3. Read the complete name (which may contain spaces)
        String fullName = scanner.nextLine();

        // 4. Print the name and age on separate lines exactly as required
        System.out.println("Name: " + fullName);
        System.out.println("Age: " + age);

        scanner.close();
    }
}
