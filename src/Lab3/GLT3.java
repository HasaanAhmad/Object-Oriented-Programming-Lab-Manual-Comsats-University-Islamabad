package Lab3;

public class GLT3 {
    public static void main(String[] args) {
        Student Hasaan = new Student("Hasaan Ahmad", new int[] { 10, 6, 7, 8, 9 });
        Hasaan.display();
        Student Mujtaba = new Student("Mujtaba", new int[] { 1, 2, 10, 10, 9 });
        Mujtaba.display();

        double avg1 = Hasaan.average();
        double avg2 = Mujtaba.average();
        if (avg1 > avg2) {
            System.out.println("Student 1 has greater average than student 2");
        } else if (avg2 > avg1) {
            System.out.println("Student 2 has greater average than student 1");
        } else {
            System.out.println("Both Students have same average");
        }

        Student hybrid = new Student(Hasaan.getName(), Mujtaba.getResult_array());
        hybrid.display();
    }
}

class Student {
    private String name;
    private int[] Result_array;

    public Student(String name, int[] result_array) {
        this.name = name;
        Result_array = result_array;
    }

    public double average() {
        int sum = 0;
        for (int i = 0; i < Result_array.length; i++) {
            sum += Result_array[i];
        }
        double average = sum / Result_array.length;
        return average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getResult_array() {
        return Result_array;
    }

    public void setResult_array(int[] result_array) {
        Result_array = result_array;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Average: " + this.average());
    }
}