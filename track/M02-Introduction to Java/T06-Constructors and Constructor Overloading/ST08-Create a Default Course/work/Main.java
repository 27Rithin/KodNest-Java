class Course {
    String name;

    Course() {
        // assign java
        name = "Java";
    }
}

public class Main {
    public static void main(String[] args) {
        // create object
        Course c = new Course();
        // print name
        System.out.println(c.name);
    }
}
