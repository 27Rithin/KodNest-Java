import java.util.Scanner;

class Rectangle {
    int calculateArea(int length, int breadth) {
        // Return area
        int area = length * breadth;
        return area;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int breadth = scanner.nextInt();

        // Create object
        Rectangle r = new Rectangle();
        // Call calculateArea()
        int Area = r.calculateArea(length, breadth);
        // Print area
        System.out.println("Area: " + Area);
    }
}
