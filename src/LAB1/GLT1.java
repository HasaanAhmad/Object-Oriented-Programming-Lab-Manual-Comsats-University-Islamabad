package LAB1;

import java.util.Scanner;

public class GLT1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student Hasaan = new Student();
        System.out.println("Enter your name: ");
        String x = input.nextLine();
        System.out.println("Enter your Roll: ");
        int y = input.nextInt();
        System.out.println("Enter your Marks: ");
        int z = input.nextInt();
        Hasaan.setParams(x, y, z);
        Hasaan.display();
        System.out.println(Hasaan.getGrade());
    }
}

/**
 * Student
 */
class Student {
    String name;
    int roll;
    int marks;
    char grade;

    void setParams(String x, int y, int z) {
        name = x;
        roll = y;
        marks = z;
    }

    void display() {
        System.out.println("Name of Student is " + name + "\n" + "Roll number is " + roll + "\n" + "Total Marks are "
                + marks + "\n" + "Use getGrade Method to calculate the grade.");
    }

    char getGrade() {
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80 && marks < 90) {
            grade = 'B';
        } else if (marks >= 70 && marks < 80) {
            grade = 'C';
        } else if (marks >= 60 && marks < 70) {
            grade = 'D';
        } else if (marks >= 50 && marks < 60) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        return grade;
    }
}