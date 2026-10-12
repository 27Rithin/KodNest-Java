import java.util.Scanner;

class Student {
    int mark;

    void showFinalMark(int bonus) {
        // Create finalMark
        int finalMark = mark + bonus;
        // Calculate mark + bonus
        // Print mark
        System.out.println(mark);
        // Print finalMark
        System.out.println(finalMark);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        student.mark = scanner.nextInt();
        int bonus = scanner.nextInt();

        student.showFinalMark(bonus);

        scanner.close();
    }
}
