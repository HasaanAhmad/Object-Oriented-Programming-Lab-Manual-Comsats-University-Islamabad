package LAB4;

class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void display() {
        System.out.println(numerator + "/" + denominator);
    }

    public boolean equals(Fraction other) {
        return numerator * other.denominator == other.numerator * denominator;
    }
}

/**
 * FractionRunner
 */
public class FractionRunner {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(4, 5);
        f1.display();
        Fraction f2 = new Fraction(5, 6);
        f2.display();
        System.out.println(f1.equals(f2));
        Fraction f3 = new Fraction(4, 5);
        System.out.println(f1.equals(f3));
    }
}