package Lab3;

/**
 * Runner1
 */
public class Runner1 {

    public static void main(String[] args) {

        Rectangle1 rect = new Rectangle1();
        rect.setLength(5);
        rect.setWidth(10);
        System.out.println("Area of Rectangle is: " + rect.area());
        System.out.println("Width of Rectangle is: " + rect.getWidth());

    }
}

class Rectangle1 {
    private int length, width;

    public Rectangle1() {
        length = 5;
        width = 2;
    }

    public Rectangle1(int l, int w) {
        length = l;
        width = w;
    }

    public void setLength(int l) // sets the value of length
    {
        length = l;
    }

    public void setWidth(int w) // sets the value of width
    {
        width = w;
    }

    public int getLength() // gets the value of length
    {
        return length;
    }

    public int getWidth() // gets the value of width
    {
        return width;
    }

    public int area() {
        return (length * width);
    }
}
