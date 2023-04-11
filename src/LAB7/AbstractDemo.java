package LAB7;

abstract class One {
    abstract void callme();

    // concrete methods are still allowed in abstract classes
    void callmetoo() {
        System.out.println("This is a concrete method.");
    }
}

class Two extends One {
    void callme() {
        System.out.println("B's implementation of callme.");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Two b = new Two();
        b.callme();
        b.callmetoo();
    }
}
