package LAB5;

class point {
    private double xCord;
    private double yCord;

    public double getxCord() {
        return xCord;
    }

    public void setxCord(double xCord) {
        this.xCord = xCord;
    }

    public double getyCord() {
        return yCord;
    }

    public void setyCord(double yCord) {
        this.yCord = yCord;
    }

    public point(double xCord, double yCord) {
        this.xCord = xCord;
        this.yCord = yCord;
    }

}

class Line {
    private point p1;
    private point p2;

    public point getP1() {
        return p1;
    }

    public void setP1(point p1) {
        this.p1 = p1;
    }

    public point getP2() {
        return p2;
    }

    public void setP2(point p2) {
        this.p2 = p2;
    }

    public Line(point p1, point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getLength() {
        return Math.sqrt(Math.pow((p2.getxCord() - p1.getxCord()), 2) + Math.pow((p2.getyCord() - p1.getyCord()), 2));
    }

    void display() {
        System.out.println("Length of line is: " + getLength());
    }
}

public class PointRuner {
    public static void main(String[] args) {
        point p1 = new point(23.5, 12.4);
        point p2 = new point(45.4, 53.32);
        Line l1 = new Line(p1, p2);
        l1.display();
    }
}
