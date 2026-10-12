import java.util.Scanner;

class Calculator {
    int add(int first, int second) {
        // Return sum
        int sum = first + second;
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create object
        Calculator c = new Calculator();
        // Call add()
        c.add(first, second);
        // Print returned sum
        System.out.println(c.add(first, second));
    }
}
