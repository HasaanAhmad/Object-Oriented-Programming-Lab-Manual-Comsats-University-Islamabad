package LAB11;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class GLT2 implements Serializable {
    public static void main(String[] args) {
        // Consider the Book class of GLT1 and write a function that displays all
        // Books present in file “BookStore”.
        try {
            FileInputStream fis = new FileInputStream("BookStore.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Book> books = (ArrayList<Book>) ois.readObject();
            for (Book book : books) {
                System.out.println("Book Details: ");
                System.out.println(book.getName());
                System.out.println(book.getPublisher());
                System.out.println(book.getAuthor().getName());
            }
            ois.close();
            fis.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
