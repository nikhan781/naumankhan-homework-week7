package homeworkweek7;
/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Program8 iCity = new Program8();
        iCity.myCity();
    }

    void myCity() {
        Scanner city = new Scanner(System.in);
        System.out.print("Enter an Alphabet from A to F : ");
        char aCity = city.next().charAt(0);
        if (aCity == 'A' || aCity == 'a') {
            System.out.println("City is Amsterdam  ");
        } else if (aCity == 'B' || aCity == 'b') {
            System.out.println("City is Barcelona");
        } else if (aCity == 'C' || aCity == 'c') {
            System.out.println("City is Colombo");
        } else if (aCity == 'D' || aCity == 'd') {
            System.out.println("City is Delhi");
        } else if (aCity == 'E' || aCity == 'e') {
            System.out.println("City is Edinburgh");
        } else if (aCity == 'F' || aCity == 'f') {
            System.out.println("City is Frankfurt");
        } else {
            System.out.println("Invalid Entry");
        }
        city.close();
    }
}
