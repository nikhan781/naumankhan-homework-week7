package homeworkweek7;
/* A java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        Program1 obj = new Program1();
        obj.myNumber();
    }

    void myNumber() {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int input = number.nextInt();
        String evenOrOdd = (input % 2 == 0) ? "even" : "odd";
        System.out.println(input + " is an " + evenOrOdd + " number");
        number.close();
    }
}
