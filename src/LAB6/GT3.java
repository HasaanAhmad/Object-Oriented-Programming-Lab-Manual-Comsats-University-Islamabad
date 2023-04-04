package LAB6;

public class GT3 {
    public static void main(String[] args) {
        Computer c = new Computer(64, 8, 256, 2);
        Laptop l = new Laptop(64, 8, 256, 2, 30, 20, 2, 2);
        c.display();
        l.display();
    }
}
