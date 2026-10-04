import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read the learner's details
        String fullName = scanner.nextLine();
        int days = scanner.nextInt();

        // 2. Use a loop to read the solved-problem counts for each day
        int total = 0;
        for (int i = 1; i <= days; i++) {
            total += scanner.nextInt();
        }

        // 3. Calculate the decimal daily average
        double average = (double) total / days;

        // 4. Print the total and daily average
        System.out.println("Total solved: " + total);
        System.out.println("Daily average: " + average);

        // 5. Determine and print readiness status
        if (average >= 5.0) {
            System.out.println("Status: Consistent");
        } else {
            System.out.println("Status: Needs consistency");
        }

        scanner.close();
    }
}
