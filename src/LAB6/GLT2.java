package LAB6;
/*
 Imagine a publishing company that markets both book and audio-cassette versions of its works. Create a 
class publication that stores the title and price of a publication. From this class derive two classes:
i. book, which adds a page count and
ii. tape, which adds a playing time in minutes.
Each of these three classes should have set() and get() functions and a display() function to display its 
data. Write a main() program to test the book and tape class by creating instances of them, asking the 
user to fill in their data and then displaying the data with display().
 */

class Publication {
    private String title;
    private double price;

    public Publication(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price + " Rs.");
    }
}

class Book extends Publication {
    private int pageCount;

    public Book(String title, double price, int pageCount) {
        super(title, price);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Page Count: " + pageCount + " pages");
    }
}

class Tape extends Publication {
    private int playTime;

    // Default constructor
    public Tape() {
        super("", 0);
        this.playTime = 0;
    }

    Tape(String title, double price, int playTime) {
        super(title, price);
        this.playTime = playTime;
    }

    public int getPlayTime() {
        return playTime;
    }

    public void setPlayTime(int playTime) {
        this.playTime = playTime;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Play Time: " + playTime + " minutes");
    }
}

public class GLT2 {
    public static void main(String[] args) {
        // Taking inputs from user to fill in data
        System.out.println("Enter the title of the book:");
        String title = System.console().readLine();
        System.out.println("Enter the price of the book:");
        double price = Double.parseDouble(System.console().readLine());
        System.out.println("Enter the page count of the book:");
        int pageCount = Integer.parseInt(System.console().readLine());
        Book book = new Book(title, price, pageCount);
        System.out.println("Enter the details of the tape:");
        title = System.console().readLine();
        System.out.println("Enter the price of the tape:");
        price = Double.parseDouble(System.console().readLine());
        System.out.println("Enter the play time of the tape:");
        int playTime = Integer.parseInt(System.console().readLine());
        Tape tape = new Tape(title, price, playTime);
        // Displaying the data
        System.out.println("The details of the book are:");
        book.display();
        System.out.println("The details of the tape are:");
        tape.display();

    }

}
