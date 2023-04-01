package LAB4;

public class DistanceCheck {
    public static void main(String[] args) {
        Distance d1 = new Distance(5.3, 2.3);
        Distance d2 = new Distance(2.3, 5.5);
        Distance d3 = d1.addTwoDistance(d1, d2);
        d1.display();
        d2.display();
        d3.display();
    }
}

class Distance {
    private double feet;
    private double inches;

    public Distance() {
        // Default Values for no arguments
        feet = 10;
        inches = 10;
    }

    public Distance(double feet, double inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public double getFeet() {
        return feet;
    }

    public void setFeet(double feet) {
        this.feet = feet;
    }

    public double getInches() {
        return inches;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

    public Distance addTwoDistance(Distance d1, Distance d2) {
        double NewFeets = d1.feet + d2.feet;
        double newInches = d1.inches + d2.inches;
        Distance newDis = new Distance(NewFeets, newInches);
        return newDis;

    }

    void display() {
        System.out.println("Feets: " + this.feet);
        System.out.println("inches: " + this.inches);
    }
}
