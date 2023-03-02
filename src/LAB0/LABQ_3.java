package LAB0;
// HASAAN AHMAD SP22-BSE-017

import java.util.Arrays;
import java.util.Scanner;

public class LABQ_3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter The Size of arr");
        int size = myObj.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            // PROMPTING USER TO ENTER VALUE
            System.out.println("Enter value " + (i + 1));
            array[i] = myObj.nextInt();
        }
        // CALLING DEFINED SORT METHOD
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] arr) {
        // USING NESTED LOOP TO SORT IN ASCENDING ORDER
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] >= arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
