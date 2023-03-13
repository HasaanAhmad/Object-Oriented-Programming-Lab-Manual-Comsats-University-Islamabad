package Lab2;

public class GLT4 {
    public static void main(String[] args) {
        Marks m1 = new Marks();
        Marks m2 = new Marks(80, 60, 90);
        System.out.println(m1.calulateSum());
        System.out.println(m2.calulateSum());
    }

}

class Marks {
    int EngMarks;
    int CompMarks;
    int BioMarks;

    Marks() {
        // Default constructor
        EngMarks = 50;
        CompMarks = 50;
        BioMarks = 50;
    }

    Marks(int eng, int comp, int bio) {
        EngMarks = eng;
        CompMarks = comp;
        BioMarks = bio;
    }

    int calulateSum() {
        int sum = EngMarks + CompMarks + BioMarks;
        return sum;
    }
}
