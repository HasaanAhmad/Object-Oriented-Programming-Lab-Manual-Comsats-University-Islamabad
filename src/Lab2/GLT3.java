package LAB2;

public class GLT3 {
    public static void main(String[] args) {
        Distance d1 = new Distance();
        Distance d2 = new Distance(5, 8);
        d1.displayDistance();
        d2.displayDistance();
    }
}

class Distance {
    double feet;
    double inches;

    public Distance() {
        // Default constructor for distance
        feet = 10.0;
        inches = 10.0;

    }

    public Distance(double feetIn, double inchesIn) {
        feet = feetIn;
        inches = inchesIn;
    }

    void displayDistance() {
        System.out.println("Distance: " + feet + " inches : " + inches);
    }

}
