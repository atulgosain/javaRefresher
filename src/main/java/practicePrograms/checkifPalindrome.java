package practicePrograms;

import java.util.Scanner;

public class checkifPalindrome
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to check if a palindrome: ");

        String testValue = sc.nextLine();

        String sb = new StringBuilder(testValue).reverse().toString();
        System.out.println(testValue+ " "+sb);
        System.out.println(testValue.equals(sb));





    }

}

