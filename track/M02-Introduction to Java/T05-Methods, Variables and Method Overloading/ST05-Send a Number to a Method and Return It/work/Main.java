import java.util.Scanner;

class NumberUtility {
    int getValue(int number) {
        // Return number
        return number;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        // Create object
        NumberUtility nu = new NumberUtility();
        // Pass number to the method
        nu.getValue(number);
        // Print returned value
        int a = nu.getValue(number);
        System.out.println(a);
    }
}
