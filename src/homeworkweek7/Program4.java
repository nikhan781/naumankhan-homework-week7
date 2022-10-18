package homeworkweek7;
/* Number of Days In Month
method getDaysInMonth
 */

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int y = obj.nextInt();
        System.out.print("Enter a month: ");
        int m = obj.nextInt();
        isLeapYear(y);
        getDaysInMonth(m, y);
        obj.close();
    }

    public static void isLeapYear(int year) {
        String a = (year >= 1 && year <= 9999) ? "true" : "false";
        if (a == "true" && year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
            System.out.println("isLeapYear(" + year + ");" + " true");
        } else {
            System.out.println("isLeapYear(" + year + ");" + " false");
        }
    }

    public static void getDaysInMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (year >= 1 && year <= 9999) {
                    System.out.println("getDaysInMonth(" + month + "," + year + "); 31");
                } else {
                    System.out.println("getDaysInMonth(" + month + "," + year + "); -1");
                }
                break;
            case 2:
                if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0 || year >= 1 && year <= 9999) {
                    System.out.println("getDaysInMonth(" + month + "," + year + "); 29");
                } else if (year >= 1 && year <= 9999) {
                    System.out.println("getDaysInMonth(" + month + "," + year + "); 28");
                } else {
                    System.out.println("getDaysInMonth(" + month + "," + year + "); -1");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (year >= 1 && year <= 9999) {
                    System.out.println("getDaysInMonth(" + month + "," + year + "); 30");
                } else {
                    System.out.println("getDaysInMonth(" + month + "," + year + "); -1");
                }
                break;
            default:
                System.out.println("getDaysInMonth(" + month + "," + year + "); -1");

        }

    }

}