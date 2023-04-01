package LAB2;

public class GLT1 {
    public static void main(String[] args) {
        Circle c1 = new Circle(); // Create a Circle object with radius 0.0
        Circle c2 = new Circle(2.5); // Create a Circle object with radius 2.5

        double cir1 = c1.calculateCircumference();
        double cir2 = c2.calculateCircumference();
        System.out.println(cir1);
        System.out.println(cir2);
    }

}

class Circle {

    private double radius;

    public Circle() {
        radius = 0.0;
    }

    public Circle(double r) {
        radius = r;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
