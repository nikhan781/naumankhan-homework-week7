package homeworkweek7;
// A Java program to calculate the average value of array elements

import java.util.Scanner;

public class Program19 {

    public static void main(String[] args) {
        avgArray();

    }

    static void avgArray(){
        Scanner average = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int arrayLong = average.nextInt();
        int lenArray[] = new int[arrayLong];

        System.out.print("Enter elements of array: ");
        for ( int i=0; i<lenArray.length; i++)
        {
            lenArray[i] = average.nextInt();
        }

        float sum = 0f;

        for ( int i=0; i<lenArray.length; i++)
        {
            sum +=lenArray[i];
        }
        float avg = sum/arrayLong;
        System.out.println("Average of array is :"+ " " +avg);
        average.close();
    }


}
