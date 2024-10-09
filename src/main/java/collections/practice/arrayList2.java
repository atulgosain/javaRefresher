package collections.practice;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList2 {

    public static void main(String[] args) {
        ArrayList aL    = new ArrayList();
        aL.add("X");
        aL.add("Y");
        aL.add("Z");
        aL.add("A");
        aL.add("B");
        aL.add("C");

        ArrayList aL2 = new ArrayList();
        aL2.addAll(aL);

        System.out.println(aL);

        aL2.removeAll(aL);

        System.out.println(aL2);

        //Sort a Array List
        System.out.println("Element in the ArrayList: "+aL);
        Collections.sort(aL);
        System.out.println("Element in sorted ArrayList: "+aL);
        //Reverse Sort
        Collections.sort(aL,Collections.reverseOrder());
        System.out.println(aL);
        //Shuffle the Array List
        Collections.shuffle(aL);
        System.out.println("Element after Suffle: "+aL);

    }
}
