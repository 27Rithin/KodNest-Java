import java.util.Scanner;

class StudentResult {
    void showTitle() {
        System.out.println("Student Result");
    }

    void displayName(String name) {
        System.out.println("Name: " + name);
    }

    int getPassingMark() {
        return 40;
    }

    int calculateAverage(int first, int second) {
        int average = (first + second) / 2;
        return average;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create object
        StudentResult s = new StudentResult();
        // Call methods
        s.showTitle();
        s.displayName(name);
        s.getPassingMark();
        int passingMark = s.getPassingMark();
        s.calculateAverage(first, second);
        int average1 = s.calculateAverage(first, second);
        System.out.println("Passing Mark: " + passingMark);
        System.out.println("Average: " + average1);

        // Print returned values
    }
}
