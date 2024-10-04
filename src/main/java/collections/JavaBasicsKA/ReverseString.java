package collections.JavaBasicsKA;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string you want to reverse: ");
        String st = sc.nextLine();
        System.out.println("String to reverse: "+st);

        int ln = st.length();
        System.out.println("Length of String is:"+ln);

        //With String Buffer
        String reversedbyStBuffer = new StringBuffer(st).reverse().toString();
        System.out.println("reversedbyStBuffer: "+reversedbyStBuffer);

        //With String Builder
        String revByStringBuilder = new StringBuilder(st).reverse().toString();
        System.out.println("revByStringBuilder: "+revByStringBuilder);

        //With Loop
        String reverseWithLoop ="";
        for(int i =ln-1; i>=0;i--){
            reverseWithLoop = reverseWithLoop+st.charAt(i);
        }
        System.out.println("Reverse With Loop: " +reverseWithLoop);

        System.out.println("Check String Builder reverse is equal to String Buffer: "+ revByStringBuilder.equals(reversedbyStBuffer));
        System.out.println("Check StringBuffer reverse is equal to Loop Reverse: "+reversedbyStBuffer.toString()==reverseWithLoop.toString());

    }
}
