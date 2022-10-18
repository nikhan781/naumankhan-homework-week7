package homeworkweek7;
/* A java program to print the numbers between 1 to 100 which can be divided by 3
and 5 separately.
 */

public class Program11 {
    public static void main(String[] args) {
        divided3();
        divide5();


    }

    static void divided3() {
        System.out.println("Numbers divided by 3 are :");
        for (int d3 = 1; d3 <= 100; d3++) {
            if (d3 % 3 == 0) {
                System.out.println(d3);
            }
        }
    }

    static void divide5() {
        System.out.println("Number divided by 5 are: ");
        for (int d5 = 1; d5 <= 100; d5++) {
            if (d5 % 5 == 0) {
                System.out.println(d5);

            }
        }


    }

}

