package LAB9;

/**
 * 
 */
interface Shape {
    double getArea();
}

/**
 * GLT1
 */
class Circle implements Shape {
    private double radius;

    public Circle() {
        radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

/**
 * GLT1
 */
public class GLT1 {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(5, 10);
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].getArea());
        }
    }
}