import java.util.Scanner;

class MobilePlan {
    String planName;
    int price;

    MobilePlan() {
        // Set Basic and 199
        this.planName = "Basic";
        this.price = 199;
    }

    MobilePlan(String planName, int price) {
        // Store both received values
        this.planName = planName;
        this.price = price;
    }

    void display() {
        System.out.println("Plan: " + planName + ", Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the selected plan name and price
        String planName = sc.nextLine();
        int price = sc.nextInt();

        // Create the default plan
        MobilePlan dm = new MobilePlan();

        // Create the selected plan
        MobilePlan m = new MobilePlan(planName, price);

        // Display both plans
        dm.display();
        m.display();
    }
}
