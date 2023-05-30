package LAB11;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class GLT3 {
    public static void main(String[] args) {
        // Consider the Book class of Activity 1 and write a function that asks the user
        // for the name of a Book and
        // searches the record against that book in the file “BookStore”.
        Book book = searchBook("Book1");
        if (book != null) {
            System.out.println("Book Details: ");
            System.out.println(book.getName());
            System.out.println(book.getPublisher());
            System.out.println(book.getAuthor().getName());
        } else {
            System.out.println("Book not found");
        }
        // Not found
        book = searchBook("Book 10");
        if (book != null) {
            System.out.println("Book Details: ");
            System.out.println(book.getName());
            System.out.println(book.getPublisher());
            System.out.println(book.getAuthor().getName());
        } else {
            System.out.println("Book not found");
        }

    }

    static Book searchBook(String name) {
        try {
            FileInputStream fis = new FileInputStream("BookStore.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Book> books = (ArrayList<Book>) ois.readObject();
            for (Book book : books) {
                if (book.getName().equals(name)) {
                    return book;
                }
            }
            ois.close();
            fis.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
