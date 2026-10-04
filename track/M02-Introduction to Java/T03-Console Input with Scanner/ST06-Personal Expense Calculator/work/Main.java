import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double monthlyIncome = sc.nextDouble();
        double rentExpense = sc.nextDouble();
        double foodExpense = sc.nextDouble();
        double travelExpense = sc.nextDouble();

        double totalExpense = rentExpense + foodExpense + travelExpense;
        System.out.println("Total expense: " + totalExpense);

        double remainingAmount = monthlyIncome - totalExpense;
        System.out.println("Remaining: " + remainingAmount);

        if (remainingAmount >= 0) {
            String status1 = "Within budget";
            System.out.println("Status: " + status1);
        } else {
            String status2 = "Over budget";
            System.out.println("Status: " + status2);
        }

        sc.close();
    }
}
