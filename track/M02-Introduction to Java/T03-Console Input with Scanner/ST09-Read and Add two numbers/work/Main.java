import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first integer
        int num1 = scanner.nextInt();

        // Read the second integer
        int num2 = scanner.nextInt();

        // Calculate and print the sum
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        scanner.close();
    }
}
