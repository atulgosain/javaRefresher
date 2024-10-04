package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        // Adding elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple");  // Duplicate, will not be added

        // Displaying the HashSet
        System.out.println(hashSet);  // Output can be in any order

        // Checking if an element exists
        System.out.println("Contains Banana? " + hashSet.contains("Banana"));

        // Removing an element
        hashSet.remove("Orange");
        System.out.println("After removing Orange: " + hashSet);
    }
}
