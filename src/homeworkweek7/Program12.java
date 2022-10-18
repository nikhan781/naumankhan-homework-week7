package homeworkweek7;
// A program that tells us input value is number or an alphabet or symbol

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        number();
    }

    static void number() {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter an input : ");
        char a = num.next().charAt(0);

        if (a >= 'a' && a <= 'z' || a >= 'A' && a <= 'Z') {
            System.out.println(a + " " + "is an alphabet.");
        } else {
            System.out.println(a + " " + "is a symbol");
        }

        if (a >= '0' && a <= '9') {
            System.out.println(a + " " + "is a number");
        } else {
            System.out.println(a + " " + "is a symbol");
        }
        num.close();
    }

}
