import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Read total minutes
        int totalMinutes = scanner.nextInt();

        // 2. Calculate hours and remaining minutes
        int hours = totalMinutes / 60;
        int remainingMinutes = totalMinutes % 60;

        // 3. Print both results exactly as required
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + remainingMinutes);

        scanner.close();
    }
}
