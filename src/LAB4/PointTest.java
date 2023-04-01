package LAB4;

class Point {
    private int X;
    private int Y;

    public Point() {
        X = 5;
        Y = 6;
    }

    public Point(int a, int c) {
        X = a;
        Y = c;
    }

    public void setX(int a) {
        X = a;
    }

    public void setY(int c) {
        Y = c;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public Point Add(Point Pa, Point Pb) {
        Point p_new = new Point(X + Pa.X + Pb.X, Y + Pa.Y + Pb.Y);
        return p_new;
    }

    public void display() {
        System.out.println(X);
        System.out.println(Y);
    }
}

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(30, 40);
        Point p3 = new Point();
        Point p4 = p1.Add(p2, p3);
        System.out.println("Printing Point 1");
        p1.display();
        System.out.println("Printing Point 2");
        p2.display();
        System.out.println("Printing Point 3");
        p3.display();
        System.out.println("Printing Point 4 made by addition of point 2 and point 3 in point 1");
        p4.display();
    }
}
