package homeworkweek7;
/* WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF
 */

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner gSalary = new Scanner(System.in);
        System.out.print("Enter employee id: ");
        int eId = gSalary.nextInt();
        System.out.print("Enter employee name: ");
        String eName = gSalary.next();
        System.out.print("Enter basic salary: ");
        float bSalary = gSalary.nextFloat();
        empName(eId, eName);
        empFile(eId, eName, bSalary);
        gSalary.close();
    }

    static void empName(int id, String name) {
        System.out.println("_____________________________");
        System.out.println("|        Salary Slip         |");
        System.out.println("|____________________________|");
        System.out.println("| Employee Id      : " + id + " \t  |");
        System.out.println("| Employee Name    : " + name + "\t |");
        System.out.println("|____________________________|");
    }

    static void empFile(int i, String n, float s) {
        System.out.println("|Basic Salary  :" + s + "      |");
        float har = s * .1f;
        System.out.println("|HRA 10%       :" + har + "       |");
        float ta = s * .08f;
        System.out.println("|TA 8%         :" + ta + "       |");
        float da = s * .09f;
        System.out.println("|DA 9%         :" + da + "       |");
        float pf = s * .2f;
        System.out.println("|PF-20%        :" + pf + "       |");
        System.out.println("|____________________________|");
        float gross = s + har + ta + da + pf;
        System.out.println("|Gross Salary  :" + gross + "      |");
        System.out.println("|____________________________|");


    }


}
