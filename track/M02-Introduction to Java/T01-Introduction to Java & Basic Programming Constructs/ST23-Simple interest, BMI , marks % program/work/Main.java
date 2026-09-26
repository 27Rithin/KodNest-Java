public class Main {
    public static void main(String[] args) {
        double principal = 10000.0;
        double rate = 6.5;
        double time = 2.0;
        double weight = 72.0;
        double height = 1.8;
        int sub1 = 78;
        int sub2 = 84;
        int sub3 = 69;
        int sub4 = 91;
        int sub5 = 88;
        int totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;
        double simpleInterest = principal * rate * time / 100.0;
        System.out.println("Simple Interest: " + simpleInterest);
        double totalAmount = principal + simpleInterest;
        System.out.println("Total Amount: " + totalAmount);
        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);
        System.out.println("Total Marks: " + totalMarks);
        double percentage = totalMarks * 100.0 / 500;
        System.out.println("Percentage: " + percentage);
    }
}
