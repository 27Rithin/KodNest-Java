class NumberUtility {
    int getNumber() {
        // Return 10
        return 10;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create object
        NumberUtility nu = new NumberUtility();
        // Call getNumber()
        int num = nu.getNumber();
        // Print returned value
        System.out.println(num);
    }
}
