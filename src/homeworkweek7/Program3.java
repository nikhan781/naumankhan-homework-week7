package homeworkweek7;

import java.util.Scanner;

/* A java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in format as in brief
 */
public class Program3 {
    public static void main(String[] args) {
        Scanner markSheet = new Scanner(System.in);
        System.out.print("Enter Student Name : ");
        String name = markSheet.next();
        System.out.print("Enter Roll Number : ");
        int roll = markSheet.nextInt();
        System.out.print("Enter Maths Mark : ");
        int mathNo = markSheet.nextInt();
        System.out.print("Enter Science Mark : ");
        int scienceNo = markSheet.nextInt();
        System.out.print("Enter English Mark : ");
        int englishNo = markSheet.nextInt();
        System.out.println(" ___________________________");
        System.out.println("|         Mark Sheet        |");
        System.out.println("|___________________________|");
        markSheet(name, roll);
        System.out.println("|  Subject   :       Marks  |");
        System.out.println("|___________________________|");
        marks(mathNo, scienceNo, englishNo);
        System.out.println("|___________________________|");
        markSheet.close();

    }

    static void markSheet(String N, int R) {
        System.out.println("|  Name     : " + N + "\t\t\t|");
        System.out.println("|  Roll    : " + R + "\t\t\t\t|");
        System.out.println("|___________________________|");


    }

    static void marks(int a, int b, int c) {
        if (a >= 0 && a <= 100 && b >= 0 && b <= 100 && c >= 0 && c <= 100) {
            System.out.println("|  Math    : " + a + "\t\t\t\t|");
            System.out.println("|  Science : " + b + "\t\t\t\t|");
            System.out.println("|  English : " + c + "\t\t\t\t|");
        } else {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        float totalM = a + b + c;
        System.out.println("|___________________________|");
        System.out.println("|   total   :   " + totalM + "\t\t|");
        System.out.println("|___________________________|");
        float percentage = (totalM / 300) * 100f;
        System.out.println("|   Percentage   :  " + Math.round(percentage) + "\t\t|");
        String result = (a >= 35 && b >= 35 && c >= 35) ? "Pass" : "Fail";
        System.out.println("|   Result       :  " + result + "\t|");

        if (percentage >= 80 && result == "Pass") {
            System.out.println("|   Grade   \t :  A+" + "\t\t|");
        } else if (percentage < 80 && percentage >= 60 && result == "Pass") {
            System.out.println("|   Grade   \t :  A" + "\t\t|");
        } else if (percentage < 60 && percentage >= 50 && result == "Pass") {
            System.out.println("|   Grade   \t :  B" + "\t\t|");
        } else if (percentage < 50 && percentage >= 35 && result == "Pass") {
            System.out.println("|   Grade   \t :  C" + "\t\t|");
        } else {
            System.out.println("|   Garde   \t :  F" + "\t\t|");
        }
    }

}

