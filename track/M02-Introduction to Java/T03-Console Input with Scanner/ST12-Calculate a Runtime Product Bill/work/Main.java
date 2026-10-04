import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read product name (single word)
        String productName = scanner.next();

        // 2. Read price (decimal)
        double price = scanner.nextDouble();

        // 3. Read quantity (integer)
        int quantity = scanner.nextInt();

        // 4. Calculate total bill
        double total = price * quantity;

        // 5. Print the output exactly as required
        System.out.println("Product: " + productName);
        System.out.println("Total: " + total);

        scanner.close();
    }
}
