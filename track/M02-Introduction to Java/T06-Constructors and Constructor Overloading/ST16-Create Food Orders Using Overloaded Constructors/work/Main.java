import java.util.Scanner;

class FoodOrder {
    String item;
    int quantity;

    FoodOrder(String item) {
        // Store the item and set quantity to 1
        this.item = item;
        this.quantity = 1;
    }

    FoodOrder(String item, int quantity) {
        // Store both values
        this.item = item;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Order: " + item + ", Quantity: " + quantity);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the item and quantity
        String item = sc.nextLine();
        int quantity = sc.nextInt();

        // Create one order with the first constructor
        FoodOrder fo = new FoodOrder(item);

        // Create one order with the second constructor
        FoodOrder fo1 = new FoodOrder(item, quantity);

        // Display both orders
        fo.display();
        fo1.display();
    }
}
