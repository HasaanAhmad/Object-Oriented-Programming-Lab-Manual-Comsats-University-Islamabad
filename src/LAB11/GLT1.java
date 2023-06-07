package LAB11;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/*
Create a class Book that has name(String), publisher (String) and an author (Person). Write five objects 
of Book Class in a file named “BookStore”.*/
class Person implements Serializable {
    String Name;
    int age;

    public Person(String name, int age) {
        Name = name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

class Book implements Serializable {
    String name;
    String publisher;
    Person author;

    public Book(String name, String publisher, Person author) {
        this.name = name;
        this.publisher = publisher;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getPublisher() {
        return publisher;
    }

    public Person getAuthor() {
        return author;
    }
}

public class GLT1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(new Book("Book1", "Publisher1", new Person("Author1", 20)));
        al.add(new Book("Book2", "Publisher2", new Person("Author2", 21)));
        al.add(new Book("Book3", "Publisher3", new Person("Author3", 22)));
        al.add(new Book("Book4", "Publisher4", new Person("Author4", 23)));
        al.add(new Book("Book5", "Publisher5", new Person("Author5", 24)));
        try {
            FileOutputStream fos = new FileOutputStream("BookStore.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(al);
            oos.close();
            fos.close();
            System.out.println("Saved Successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
