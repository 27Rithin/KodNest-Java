public class Main {
    public static void main(String[] args) {
        int attempts = 3;
        String status;

        status = attempts < 3 ? "Ready" : "Revision";
        System.out.println(status);
    }
}