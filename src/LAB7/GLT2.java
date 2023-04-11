package LAB7;

/*
Write a program that declares two classes. The parent class is called Simple that has two data members 
num1 and num2 to store two numbers. It also has four member functions.
The add() function adds two numbers and displays the result. The sub() function subtracts two numbers 
and displays the result.
The mul() function multiplies two numbers and displays the result. The div() function divides two numbers 
and displays the result.
The child class is called VerifiedSimple that overrides all four functions. Each function in the child class 
checks the value of data members. It calls the corresponding member function in the parent class if the 
values are greater than 0. Otherwise it displays error message.
*/
class Simple {
    int num1;
    int num2;

    public Simple(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void add() {
        System.out.println("Addition: " + (num1 + num2));
    }

    void sub() {
        System.out.println("Subtraction: " + (num1 - num2));
    }

    void mul() {
        System.out.println("Multiplication: " + (num1 * num2));
    }

    void div() {
        System.out.println("Division: " + (num1 / num2));
    }
}

class VerifiedSimple extends Simple {
    public VerifiedSimple(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    void add() {
        if (num1 > 0 && num2 > 0) {
            super.add();
        } else {
            System.out.println("Error: Invalid Input");
        }
    }

    @Override
    void sub() {
        if (num1 > 0 && num2 > 0) {
            super.sub();
        } else {
            System.out.println("Error: Invalid Input");
        }
    }

    @Override
    void mul() {
        if (num1 > 0 && num2 > 0) {
            super.mul();
        } else {
            System.out.println("Error: Invalid Input");
        }
    }

    @Override
    void div() {
        if (num1 > 0 && num2 > 0) {
            super.div();
        } else {
            System.out.println("Error: Invalid Input");
        }
    }
}

public class GLT2 {
    public static void main(String[] args) {
        VerifiedSimple vs = new VerifiedSimple(10, 5);
        vs.add();
        vs.sub();
        vs.mul();
        vs.div();
        // error Test
        VerifiedSimple vs2 = new VerifiedSimple(-10, 5);
        vs2.add();
        vs2.sub();
        vs2.mul();
        vs2.div();

    }

}
