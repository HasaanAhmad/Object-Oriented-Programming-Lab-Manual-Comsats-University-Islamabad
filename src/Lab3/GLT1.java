package LAB3;

/**
 * GLT1
 */
public class GLT1 {
    public static void main(String[] args) {
        Marks m1 = new Marks(90, 30, 50);
        System.out.println(m1);
        // m1.sciMarks cannot be accessed as it is declared privately
        m1.setMathMarks(90);
        System.out.println(m1.toString());
    }

}

class Marks {
    private int sciMarks;
    private int mathMarks;
    private int engMarks;

    public Marks() {
        sciMarks = 50;
        mathMarks = 50;
        engMarks = 50;
    }

    public Marks(int sciMarks, int mathMarks, int engMarks) {
        this.sciMarks = sciMarks;
        this.mathMarks = mathMarks;
        this.engMarks = engMarks;
    }

    public int getSciMarks() {
        return sciMarks;
    }

    public int getMathMarks() {
        return mathMarks;
    }

    public int getEngMarks() {
        return engMarks;
    }

    public void setSciMarks(int sciMarks) {
        this.sciMarks = sciMarks;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    public void setEngMarks(int engMarks) {
        this.engMarks = engMarks;
    }

    @Override
    public String toString() {
        return "Marks [sciMarks=" + sciMarks + ", mathMarks=" + mathMarks + ", engMarks=" + engMarks + "]";
    }

}