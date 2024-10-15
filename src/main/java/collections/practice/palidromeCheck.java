package collections.practice;

import java.util.Locale;
import java.util.Scanner;

public class palidromeCheck
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to check if it is Palidrome: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        System.out.println(str);

        if (isPalindrome(str)) {
            System.out.println("its a Palindrome");
        }
        else
            System.out.println("Not a Palindrome");
    }
    public static boolean isPalindrome(String str){
        for (int i = 0; i<=str.length()/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start!=end){
                return false;
            }
        }

return true;

    }
}
