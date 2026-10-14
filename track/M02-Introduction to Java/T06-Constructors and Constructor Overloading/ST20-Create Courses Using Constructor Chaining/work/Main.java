import java.util.Scanner;

class Course {
    String course_name;
    int duration;

    Course() {
        this("Java", 30);
    }

    Course(String course_name, int duration) {
        this.course_name = course_name;
        this.duration = duration;
    }

    void display() {
        System.out.print(course_name + " ");
        System.out.println(duration);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String course_name = sc.nextLine();
        int duration = sc.nextInt();

        Course dc = new Course();
        Course c = new Course(course_name, duration);

        dc.display();
        c.display();
    }
}
