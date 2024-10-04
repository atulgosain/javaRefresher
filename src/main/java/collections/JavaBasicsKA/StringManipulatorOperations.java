package collections.JavaBasicsKA;

import java.time.LocalDate;
import java.util.Arrays;

public class StringManipulatorOperations {
    public static void main(String[] args) {
        //Using + Operator: Commonly used for simple concatenation.
        String s1 = "Hello";
        String s2 = "World";
        String result = s1 + " " + s2;
        System.out.println(result);

        System.out.println("Concat Operation : "+s1.concat(s2));

        String s = "HellO World";
        String sub = s.substring(0, 7);  // Output: "Hello"

        System.out.println("Substring: "+sub);

        //charAt
        System.out.println("charAt: "+s.charAt(4));

        //length
        System.out.println("Length: "+s.length());

      //  Using equals(): Compares two strings for content equality.

        String s4 = "Hello";
        String s5 = "Hello";
        boolean isEqual = s4.equals(s5);  // Output: true

        System.out.println(isEqual);

        //Using equalsIgnoreCase(): Compares two strings ignoring case.

        boolean isEqualIgnoreCase = s4.equalsIgnoreCase("hello");  // Output: true

        System.out.println(isEqualIgnoreCase);

       // Using compareTo(): Compares two strings lexicographically.

        int results = s4.compareTo(s5);  // Output: 0 (since they are equal), -1 if not equals
        System.out.println(results);

        int[] arr = {1, 2, 3};
        String arrStr = Arrays.toString(arr);  // Output: "[1, 2, 3]"
        System.out.println(arrStr);
        String formatted = String.format("Hello %s, your score is %d", "John", 95);  // Output: "Hello John, your score is 95"

        System.out.println(formatted);
        LocalDate birthdate = LocalDate.now();
        String formats = String.format("Duke's Birthday: %1$tm %1$te,%1$tY", birthdate);

        System.out.println(formats);


    }
}
