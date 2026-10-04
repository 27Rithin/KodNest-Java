import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of days
        int days = sc.nextInt();
        int total = 0;

        for (int day = 1; day <= days; day++) {
            total += sc.nextInt();
        }

        String status;
        if (total >= 20) {
            status = "Strong progress";
        } else if (total >= 10) {
            status = "Keep improving";
        } else {
            status = "Needs more practice";
        }

        System.out.println("Total solved: " + total);
        System.out.println("Status: " + status);

        sc.close();
    }
}
