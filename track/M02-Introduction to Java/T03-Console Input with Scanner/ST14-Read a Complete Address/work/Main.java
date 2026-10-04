import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read the complete address line (including spaces)
        String address = scanner.nextLine();

        // 2. Print the address with the correct label prefix
        System.out.println("Address: " + address);

        scanner.close();
    }
}
