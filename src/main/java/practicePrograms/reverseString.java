package practicePrograms;

import java.util.Scanner;

public class reverseString
{

    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to get it reversed: ");
        String strtoReverse = sc.nextLine();

        StringBuilder reversedStr = new StringBuilder(strtoReverse).reverse() ;

        System.out.println(reversedStr);

    }
}
