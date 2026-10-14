import java.util.Scanner;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        // Store the title and author
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the book title and author
        String title = sc.nextLine();
        String author = sc.nextLine();
        // Create one Book object
        Book b = new Book(title, author);
        // Call display()
        b.display();
    }
}
