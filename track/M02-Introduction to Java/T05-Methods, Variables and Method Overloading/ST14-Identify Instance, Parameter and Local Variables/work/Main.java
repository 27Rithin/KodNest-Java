class Result {
    // 1. Instance Variable (Declared inside the class, outside any method)
    int total;

    void update(int score) {
        // 2. Parameter Variable (Declared in the method signature)
        // 3. Local Variable (Declared directly inside the method body)
        int bonus = 5;

        // Example logic updating the instance variable
        total = score + bonus;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object to access the variables
        Result res = new Result();
        res.update(85);

        System.out.println("Total updated score: " + res.total);
    }
}
