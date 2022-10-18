package homeworkweek7;
// A Java program to test if an array contains a specific value

import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {
specificValue();
    }
    static void specificValue(){
        Scanner value = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int sValue = value.nextInt();
        int specificV [] = new int[sValue];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i<specificV.length; i++) {
            specificV[i] = value.nextInt();
        }
        System.out.println("Enter the value to find: ");
        int find = value.nextInt();
        for(int a =0; a<specificV.length; a++){
            if(specificV[a] ==find) {
                System.out.println("value is not present");
                break;
            } else {
                System.out.println("value is not present");
                break;
            }

        }
            value.close();

    }

}
