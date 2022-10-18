package homeworkweek7;
/* a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)
 */

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Program10 calculator = new Program10();
        Scanner add = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a = add.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = add.nextInt();
        System.out.print("Enter an operator (+, - , / , *) : ");
        char ops = add.next().charAt(0);
        if (ops == '+') {
            calculator.addition(a, b);
        } else if (ops == '-') {
            calculator.subtraction(a, b);
        } else if (ops == '/') {
            calculator.division(a, b);
        } else if (ops == '*') {
            calculator.multiplication(a, b);
        } else {
            System.out.println("Invalid Entry");
        }
        add.close();

    }

    void addition(int a, int b) {
        System.out.println("Result :" + (a + b));
    }

    void subtraction(int a, int b) {
        System.out.println("Result :" + (a - b));
    }

    void division(int a, int b) {
        float a1 = a;
        float b1 = b;
        System.out.println("Result :" + (a1 / b1));
    }

    void multiplication(int a, int b) {
        System.out.println("Result :" + (a * b));
    }
}
