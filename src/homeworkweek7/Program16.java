package homeworkweek7;
// A java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        Program16 obj = new Program16();
        obj.positive();

    }

    void positive() {
        Scanner pos = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int value = pos.nextInt();
        if (value > 0) {
            System.out.println(value + " " + "is a positive number");
        } else if (value < 0) {
            System.out.println(value + " " + "is a negative number");
        } else {
            System.out.println("It is zero");
        }
        pos.close();

    }
}

