package homeworkweek7;
//Same as above program-8 using switch statement

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Program9 myCity = new Program9();
        myCity.sCity();
    }

    void sCity() {
        Scanner nCity = new Scanner(System.in);
        System.out.print("Enter a capital alphabet from A to F : ");
        char aCity = nCity.next().charAt(0);
        switch (aCity) {
            case 'A':
                System.out.println("City is Amsterdam  ");
                break;
            case 'B':
                System.out.println("City is Barcelona");
                break;
            case 'C':
                System.out.println("City is Colombo");
                break;
            case 'D':
                System.out.println("City is Delhi");
                break;
            case 'E':
                System.out.println("City is Edinburgh");
                break;
            case 'F':
                System.out.println("City is Frankfurt");
            default:
                System.out.println("Invalid Entry");
        }
        nCity.close();
    }
}
