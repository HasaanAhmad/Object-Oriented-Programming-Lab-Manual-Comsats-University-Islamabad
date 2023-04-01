package LAB4;

/**
 * BookRunner
 */

class Book {
    String author;
    String[] chapterName = new String[10];

    public Book(String author, String[] chapterName) {
        this.author = author;
        this.chapterName = chapterName;
    }

    // For default constructor
    public Book() {
        this.author = "Unknown";
        this.chapterName[0] = "Unknown";
    }

    boolean compareBooks(Book b) {
        if (this.author == b.author) {
            return true;
        } else {
            return false;
        }
    }

    boolean compareChapterNames(Book b) {
        if (this.chapterName[0] == b.chapterName[0]) {
            return true;
        } else {
            return false;
        }
    }

    void display() {
        System.out.println("Author: " + this.author);
        System.out.println("Chapters: ");
        for (int i = 0; i < this.chapterName.length; i++) {
            System.out.println(this.chapterName[i]);
        }
    }

}

public class BookRunner {
    public static void main(String[] args) {
        Book b1 = new Book("Hasaan", new String[] { "Beginning", "Pilot", "Scene3" });
        b1.display();
        System.out.println();
        Book b2 = new Book("Mujtaba", new String[] { "Intro To Java", "CPP", "Hello World" });
        b2.display();
        System.out.println();
        // Declaring same book as 1 to check compare method
        Book b3 = new Book("Hasaan", new String[] { "Beginning", "Pilot", "Scene3" });
        System.out.println(b1.compareBooks(b3));
        System.out.println(b1.compareChapterNames(b3));
        // testing false results
        System.out.println(b1.compareChapterNames(b2));

    }
}