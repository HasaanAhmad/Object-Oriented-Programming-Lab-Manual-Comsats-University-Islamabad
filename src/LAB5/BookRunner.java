package LAB5;

class Book {
    private Person author;
    private String bookName;
    private String publisher;

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Book(Person author, String bookName, String publisher) {
        this.author = author;
        this.bookName = bookName;
        this.publisher = publisher;
    }

    void display() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Publisher: " + publisher);
        System.out.println("----------------Author's Information------------------");
        System.out.println("Author Name: " + author.getName());
        System.out.println("Author Father Name: " + author.getFname());
        System.out.println("Author Address: " + author.getAdrress().getStreet());
        System.out.println("Author Address: " + author.getAdrress().getCity());
        System.out.println("Author Address: " + author.getAdrress().getHouse());
        System.out.println("Author Address: " + author.getAdrress().getCode());
    }

}

public class BookRunner {
    public static void main(String[] args) {
        Adrress adrress = new Adrress("Street 1", "Islamabad", "B202", "40400");
        Person author = new Person("Hasaan Ahmad", "Mazhar Hussain", adrress);
        Book book = new Book(author, "How to win People around you!", "Genius Publishers");
        book.display();
    }
}
