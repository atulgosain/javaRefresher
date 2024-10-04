package collections.JavaBasicsKA;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesSortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of elements in sorted Array: ");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter  "+n+" elements of the sorted Array(non decreasing array");

        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

if (n==0 || n==1){
    System.out.println("Array after removing duplicated: "+ Arrays.toString(arr));
    return;
        }

// Step 3: Use index to keep track of the unique elements
        int index = 1; // Start at 1 because the first element is always unique
// Traverse the array and compare each element with the previous one
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[index] = arr[i]; // Place the unique element at the index position
                index++; // Move the index forward
            }
        }
// Step 4: Create a result array with the unique elements
        int[] resultArray = Arrays.copyOfRange(arr, 0, index);
// Step 5: Output the result
        System.out.println("Array after removing duplicates: " +
                Arrays.toString(resultArray));
// Closing scanner to avoid memory leaks

        sc.close();


 }
}
