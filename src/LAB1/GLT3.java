package LAB1;

public class GLT3 {
    public static void main(String[] args) {
        Car mehran = new Car("Mehran", 800, "White", 2010);
        mehran.horn();
        mehran.park();
        mehran.crash();
        mehran.display();
        mehran.setColor("black");
        mehran.display();
    }
}

/**
 * Car
 */
class Car {
    String name;
    int cc;
    String color;
    int manufactureYear;

    public Car(String name, int cc, String color, int manufactureYear) {
        this.name = name;
        this.cc = cc;
        this.color = color;
        this.manufactureYear = manufactureYear;
    }

    void display() {
        System.out
                .println("name=" + name + ", cc=" + cc + ", color=" + color + ", manufactureYear= " + manufactureYear);
    }

    void setColor(String clr) {
        this.color = clr;
    }

    void horn() {
        System.out.println("TUT TUT!! Give me the way.");
    }

    void park() {
        System.out.println("TUT TUT!! Car is Parked");
    }

    void crash() {
        System.out.println("Shushhhhhh!!!!! You crashed it! Man!!! ");
    }

}