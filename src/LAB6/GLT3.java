package LAB6;

/*
 Write a base class Computer that contains data members of wordsize(in bits), memorysize (in megabytes), 
storagesize (in megabytes) and speed (in megahertz). Derive a Laptop class that is a kind of computer but 
also specifies the object’s length, width, height, and weight. Member functions for both classes should 
include a default constructor, a constructor to inialize all components and a function to display data 
members.r.
*/

class Computer {
    private int wordSize;
    private int memorySize;
    private int storageSize;
    private int speed;

    public Computer() {
        this.wordSize = 0;
        this.memorySize = 0;
        this.storageSize = 0;
        this.speed = 0;
    }

    public Computer(int wordSize, int memorySize, int storageSize, int speed) {
        this.wordSize = wordSize;
        this.memorySize = memorySize;
        this.storageSize = storageSize;
        this.speed = speed;
    }

    public int getWordSize() {
        return wordSize;
    }

    public void setWordSize(int wordSize) {
        this.wordSize = wordSize;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void display() {
        System.out.println("Word Size: " + wordSize + " bits");
        System.out.println("Memory Size: " + memorySize + " MB");
        System.out.println("Storage Size: " + storageSize + " MB");
        System.out.println("Speed: " + speed + " MHz");
    }

}

class Laptop extends Computer {
    private int length;
    private int width;
    private int height;
    private int weight;

    public Laptop() {
        super();
        this.length = 0;
        this.width = 0;
        this.height = 0;
        this.weight = 0;
    }

    public Laptop(int wordSize, int memorySize, int storageSize, int speed, int length, int width, int height,
            int weight) {
        super(wordSize, memorySize, storageSize, speed);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Length: " + length + " cm");
        System.out.println("Width: " + width + " cm");
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
    }
}

public class GLT3 {
    public static void main(String[] args) {
        Computer c = new Computer(64, 8, 256, 2);
        Laptop l = new Laptop(64, 8, 256, 2, 30, 20, 2, 2);
        c.display();
        l.display();
    }

}
