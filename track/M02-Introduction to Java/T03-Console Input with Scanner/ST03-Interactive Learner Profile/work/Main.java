import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        System.out.println("Learner: " + firstName);
        int solvedProblems = sc.nextInt();
        System.out.println("Problems solved: " + solvedProblems);
        double assessmentPercentage = sc.nextDouble();
        System.out.println("Assessment: " + assessmentPercentage);
        sc.close();
    }
}
