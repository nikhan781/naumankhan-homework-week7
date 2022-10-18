package homeworkweek7;
// A java program to input any number and find out if it’s odd or even

import java.util.Scanner;
public class Program6 {

    public static void main(String[] args){
        oddEven();
    }

    static void oddEven(){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = obj.nextInt();
        if(number % 2 == 0){
            System.out.print(number + " " + "is an even number");

        } else {
            System.out.print(number + " " +"is an odd number");
        }
        obj.close();
    }
}