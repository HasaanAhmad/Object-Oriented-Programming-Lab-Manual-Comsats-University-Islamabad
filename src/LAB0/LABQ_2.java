package LAB0;

// HASAAN AHMAD SP22-BSE-017
import java.util.Scanner;

public class LABQ_2 {
    public static void main(String[] args) {
        // TAKING USER INPUT
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int size = in.nextInt();
        String[] StudentArr = new String[size];
        int[] marksArr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Student Name " + (i + 1));
            StudentArr[i] = in.next();
            System.out.println("Student Makrs " + (i + 1));
            marksArr[i] = in.nextInt();
        }
        int leadMarks = highestMarks(marksArr);
        for (int i = 0; i < size; i++) {
            if (marksArr[i] == leadMarks)
                System.out.println(StudentArr[i] + " Has highest marks " + leadMarks);
        }
    }

    // GLOBAL VARIABLE TO MAINTAIN STUDENT WITH HIGHEST MARKS
    public static int highestMarks(int[] array) {
        int highest = 0;
        for (int j : array) {
            if (highest < j)
                highest = j;
        }
        return highest;
    }
}
