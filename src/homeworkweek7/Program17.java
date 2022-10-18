package homeworkweek7;
// A Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class Program17 {

    public static void main(String[] args) {
        stringArray();
        numberArray();

    }

    static void stringArray(){
        String stg[] = {"Nauman", "Hiren", "Krupa", "Manisha", "Siddhi", "Harshid", "Kishan"  };
        Arrays.sort(stg);
        System.out.println(Arrays.toString(stg));
    }
    static void numberArray(){
        int num[] = {6,4,9,23,57,19,76,15,30};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
    }
}
