package collections.practice;

import java.util.Collections;
import java.util.LinkedList;

public class linkList2 {

    public static void main(String[] args) {

        LinkedList lL1 = new LinkedList();

        lL1.add("Q");
        lL1.add("R");
        lL1.add("N");
        lL1.add("P");
        lL1.add("Y");
        lL1.add("Z");
        lL1.add("V");


        System.out.println("Linked List before Sorting"+lL1);
         Collections.sort(lL1);
        System.out.println("Linked List after Sorting"+lL1);

        LinkedList lL2 = new LinkedList<>();
        lL2.addAll(lL1);

        System.out.println("Print new linkedList after adding: "+lL2);

//For Reverse Order
        Collections.sort(lL2, Collections.reverseOrder());
        System.out.println("In Reverse Order: "+lL2);

        LinkedList lL4 = new LinkedList();
        lL4.add("Hello");
        lL4.add("Hence");
        lL4.add("Intake");
        lL4.add("hence");

       // lL4.sort(String.CASE_INSENSITIVE_ORDER);
Collections.sort(lL4);
        System.out.println(lL4);
    }
}
