import java.util.Scanner;

class ResultCalculator {
    int getTotal(int first, int second) {
        // Return the total of two marks
        int total = first + second;
        return total;
    }

    int getTotal(int first, int second, int third) {
        // Return the total of three marks
        int total1 = first + second + third;
        return total1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read three marks
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        // Create one ResultCalculator object
        ResultCalculator rc = new ResultCalculator();
        // Call both overloaded methods and print both totals
        int First = rc.getTotal(first, second);
        int Second = rc.getTotal(first, second, third);
        System.out.println("Two-Mark Total: " + First);
        System.out.println("Three-Mark Total: " + Second);

        sc.close();
    }
}
