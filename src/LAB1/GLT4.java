package LAB1;

class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void calculateArea() {
        System.out.println(length * width);
    }

    void calculatePerimeter() {
        System.out.println(2 * (length + width));
    }

    void display() {
        System.out.println("length=" + length + ", width=" + width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

}

public class GLT4 {
    public static void main(String[] args) {
        Rectangle Rec1 = new Rectangle(4.6, 8.6);
        Rectangle Rec2 = new Rectangle(2.6, 3.4);
        Rec1.calculateArea();
        Rec1.calculatePerimeter();
        Rec2.calculateArea();
        Rec2.calculatePerimeter();

    }

}
