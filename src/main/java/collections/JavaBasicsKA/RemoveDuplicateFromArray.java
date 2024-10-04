package collections.JavaBasicsKA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        //Step1: Accept input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in a Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements of Array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //Step 2: Use HashSet to remove duplicates
        Set<Integer> uniqueElements = new HashSet();//Set to hold unique elements

        for (int num : arr){
            uniqueElements.add(num); //HashSet automatically handles duplicates
        }
//Step 3: convert Set back to Array
        int[] resultArray = new int[uniqueElements.size()];

        int index = 0;

        for(int num: uniqueElements){
            resultArray[index++] = num;
        }

        //Step 4 output result

        System.out.println("Array after removing duplicates: "+ Arrays.toString((resultArray)));

        //Closing Scanner to avoid memory loss

        sc.close();


    }
}
