package collections.practice;

import java.util.Iterator;
import java.util.LinkedList;

public class linkList1 {
    public static void main(String[] args) {
        //Link list has queue interface also
//Declare Linked list for hetrogenous data
        LinkedList lL = new LinkedList();

        //Declare LinkedList for Homogeneous Data
        LinkedList<Integer> lNumber = new LinkedList<Integer>();
        LinkedList<String> lString = new LinkedList<String>();

        //add elements
        lL.add("Cake");
        lL.add(10);
        lL.add(1.5);
        lL.add(true);
        lL.add('A');
        lL.add(null);
        System.out.println(lL);
        System.out.println(lL.size());

        //remove
        lL.remove(4);
        System.out.println("After removing new list: "+lL);

        //remove element by value--not allowed

        //insert a new element
        lL.add("Karan");
        lL.add(15);

        System.out.println("After adding a new elements: "+lL);
        System.out.println("Size of LinkedList: "+lL.size());

        //insert a value in middle of the linked list
        lL.add(4,"Smile");
        System.out.println("After adding new element by Index: "+lL);
        System.out.println("Size of LinkedList: "+lL);

        //remove a value by Object Value
        lL.remove(null);
        System.out.println("After removing 'Null' from LinkedList "+lL);

        //remove by Index
        lL.remove(2);
        System.out.println("After removing value by Index: "+lL);

        //Retrieving value /Object
        lL.get(4);

        // Change the value
        System.out.println(lL);
        lL.set(3,"LotOfSmile");
        System.out.println(lL);




        //contains
        System.out.println("contains LotOfSmile:"+lL.contains("LotOfSmile"));

        System.out.println(lL.contains(true));

        System.out.println(lL.contains(false));

        System.out.println(lL.isEmpty());
        System.out.println("");

        //Reading elements from lL using for loop
      /*  for (int i =0; i<lL.size(); i++){
            System.out.println(lL.get(i));
        }

       */
        //Reading elements from lL by for each
        for(Object e :lL){
            System.out.print(e+" ");
        }
//Iterator method
        Iterator it = lL.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }




    }
}
