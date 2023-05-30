package LAB9;

/**
 * GLT4
 * Create constructor and abstract methods of interface in the class
 * NameCollection.
 * Then write a main method that creates a NamesCollection object with a sample
 * array of strings,
 * and then iterates through the enumeration outputting each name using the
 * getNext() method.
 */
interface Enumeration {
    public boolean hasNext(int index);

    public Object getNext(int index);

}

class NameCollection implements Enumeration {
    private String[] names; // Array of names
    private int index;

    public NameCollection() {
        names = null;
        index = 0;
    }

    public NameCollection(String[] names) {
        this.names = names;
        index = 0;
    }

    @Override
    public boolean hasNext(int index) {
        if (index < names.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object getNext(int index) {
        if (hasNext(index)) {
            return names[index++];
        }
        return null;
    }

    // Method to print names
    public void printNames() {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    @Override
    public String toString() {
        return "NameCollection [index=" + index + ", names=" + names + "]";
    }
}

public class GLT4 {
    public static void main(String[] args) {
        // Fill array with data
        String[] names = { "Hasaan", "Mujtaba", "Haider", "Ali", "Salman" };
        NameCollection nameCollection = new NameCollection(names);
        System.out.println(nameCollection.toString());
        // Print names
        nameCollection.printNames();
        nameCollection.toString();
    }
}
