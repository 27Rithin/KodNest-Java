class Book {
    String title;

    Book() {
        title = "Java Basics";
    }
}

class Main {
    public static void main(String[] args) {
        Book b = new Book();
        System.out.println(b.title);
    }
}
