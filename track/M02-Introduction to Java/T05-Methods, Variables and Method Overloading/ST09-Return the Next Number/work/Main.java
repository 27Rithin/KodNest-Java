import java.util.Scanner;

class NumberUtility {
    int getNextNumber(int number) {
        // Return next number
        int number1 = number + 1;
        return number1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        // Create object
        NumberUtility n = new NumberUtility();
        // Call method
        int num = n.getNextNumber(number);
        // Print result
        System.out.println(num);
    }
}
