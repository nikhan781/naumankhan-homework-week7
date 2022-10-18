package homeworkweek7;
// A Java program to sum values of an array.

import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        Program18 sumValue = new Program18();
        sumValue.sumArray();
    }

    void sumArray() {
        Scanner sArray = new Scanner(System.in);
        System.out.println("Enter number of array :");
        int add = sArray.nextInt();
        int a[] = new int[add];
        System.out.println("Enter array numbers: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sArray.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("Sum of array is:" + " " + sum);
        sArray.close();
    }
}
