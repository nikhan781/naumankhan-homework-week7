package homeworkweek7;
/* A java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
 */

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Program7 comm = new Program7();
        comm.data();
    }

    void data() {
        Scanner sData = new Scanner(System.in);
        System.out.print("Enter sales id : ");
        int sellerId = sData.nextInt();
        System.out.print("Enter seller's name : ");
        String sellerName = sData.next();
        System.out.print("Enter sales amount : $");
        int salesAmount = sData.nextInt();
        System.out.print("Enter salary basic : $");
        int salaryBasic = sData.nextInt();
        if (salesAmount >= 50000) {
            float sBasic = salaryBasic;
            float comm1 = .35f * sBasic;
            System.out.println("Sales Commission is" + " " + "$" + comm1);
        } else if (salesAmount >= 30000 && salesAmount < 50000) {
            float sBasic2 = salaryBasic;
            float comm2 = .2f * sBasic2;
            System.out.println("Sales Commission is" + " " + "$" + comm2);
        } else if (salesAmount >= 20000 && salesAmount < 30000) {
            float sBasic3 = salaryBasic;
            float comm3 = .1f * sBasic3;
            System.out.println("Sales Commission is" + " " + "$" + comm3);
        } else if (salesAmount >= 10000 && salesAmount < 20000) {
            float sBasic4 = salaryBasic;
            float comm4 = .05f * sBasic4;
            System.out.println("Sales Commission is" + " " + "$" + comm4);
        } else {
            float sBasic5 = salaryBasic;
            float comm5 = .02f * sBasic5;
            System.out.println("Sales Commission is" + " " + "$" + comm5);
        }
        sData.close();
    }
}
