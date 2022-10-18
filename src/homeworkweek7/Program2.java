package homeworkweek7;

import java.util.Scanner;

/* A java program to input any year like (ex.2007) and find out if it is leap year or
not?
 */
public class Program2 {

    public static void main(String[] args) {
        Program2 program2 = new Program2();
        program2.isLeapYear();
    }

    void isLeapYear() {
        Scanner year = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int leapY = year.nextInt();
        if (leapY % 4 == 0 || leapY % 400 == 0 && leapY % 100 != 0) {
            System.out.println(leapY + " " + "is a leap year");
        } else {
            System.out.println(leapY + " " + "is not a leap year");
        }
        year.close();

    }
}
