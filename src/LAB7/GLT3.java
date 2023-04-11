package LAB7;

/*
Create an abstract class that stores data about the shapes e.g. Number of Lines in a Shape, Pen Color, 
Fill Color and an abstract method draw. Implement the method draw for Circle, Square and Triangle 
subclasses, the better approach is to draw these figures on screen, if you can’t then just use a display 
message in the draw function.

*/

abstract class Shape {
    int numLines;
    String penColor;
    String fillColor;

    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }
}

public class GLT3 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        Square s = new Square();
        s.draw();
        Triangle t = new Triangle();
        t.draw();
    }
}
