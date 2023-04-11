package LAB7;

class A {
    int i, j;

    A(int num1, int num2) {
        i = num1;
        j = num2;
    }// display i and j

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    @Override
    void show() {
        super.show();
        System.out.println("k: " + k);
    }
}

public class OverrideRunner {
    public static void main(String args[]) {
        B subOb = new B(1, 2, 3);
        subOb.show(); // this calls show() in B
    }
}
