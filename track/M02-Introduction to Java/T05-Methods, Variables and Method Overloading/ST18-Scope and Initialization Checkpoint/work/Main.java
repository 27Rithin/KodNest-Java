public class Main {

    // This method demonstrates the exact compilation error from the quiz
    public static void methodWithCompileError() {
        int value; // Local variable declared inside a method

        // UNCOMMENTING THE LINE BELOW WILL CAUSE A COMPILE-TIME ERROR:
        // "Variable 'value' might not have been initialized"
        // System.out.println(value);
    }

    // This method shows how to fix the error by initializing the local variable
    public static void workingMethod() {
        int value = 0; // Local variable explicitly initialized

        System.out.println("Initialized Local Variable Value: " + value); // Prints: 0
    }

    public static void main(String[] args) {
        // Execute the valid method
        workingMethod();
    }
}
