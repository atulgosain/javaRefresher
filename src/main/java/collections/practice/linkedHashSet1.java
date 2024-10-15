package collections.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class linkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lHSet = new LinkedHashSet<Integer>();
        lHSet.add(100);
        lHSet.add(100);
        lHSet.add(200);
        lHSet.add(300);
        lHSet.add(400);
        lHSet.add(500);

        //Insertion order is reserved in LinkedHastSet
        //If printed in HashSet insertion order is not preserved

        System.out.println(lHSet);


    }
}
