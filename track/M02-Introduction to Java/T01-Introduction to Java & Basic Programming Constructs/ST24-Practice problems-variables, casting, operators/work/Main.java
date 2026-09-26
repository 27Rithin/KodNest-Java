public class Main {
    public static void main(String[] args) {
        // write your code here
        int completedTopics = 17;
        int totalTopics = 20;
        int learningHours = 3;
        int learningDays = 5;
        int remainingTopics = totalTopics - completedTopics;
        int weeklyHours = learningHours * learningDays;
        double progressPercentage = completedTopics * 100 / totalTopics;
        System.out.println("Completed Topics: " + completedTopics);
        System.out.println("Remaining Topics: " + remainingTopics);
        System.out.println("Weekly Learning Hours: " + weeklyHours);
        System.out.println("Progress Percentage: " + progressPercentage);
    }
}
