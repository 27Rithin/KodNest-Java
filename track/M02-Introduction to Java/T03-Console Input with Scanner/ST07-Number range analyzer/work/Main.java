import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the range limits
        int start = sc.nextInt();
        int end = sc.nextInt();

        // Initialize tracking variables before the loop
        int evenSum = 0;
        int oddCount = 0;

        // Traverse through the range
        while (start <= end) {
            if (start % 2 == 0) {
                evenSum += start; // Add even numbers to sum
            } else {
                oddCount++; // Count odd numbers
            }
            start++; // Move to the next number in the range
        }

        // Print the output exactly as required
        System.out.println("Even sum: " + evenSum);
        System.out.println("Odd count: " + oddCount);

        sc.close();
    }
}
