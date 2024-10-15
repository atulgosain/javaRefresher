package collections.practice;

import java.util.HashSet;

public class hashset3 {

    public static void main(String[] args) {
//Union, Intersection, difference

        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        System.out.println("Set 1: "+set1);

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Set 2: "+set2);
        //union
        //set1.addAll(set2);
        //System.out.println("Union: "+set1);// [1, 2, 3, 4, 5]

        //intersection
     //   set1.retainAll(set2);
      //  System.out.println("intersection: "+set1); // [3, 4]

        //Difference
        set1.removeAll(set2);
        System.out.println("difference: "+set1);









    }
}
