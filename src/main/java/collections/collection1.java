package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class collection1 {

    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("Atul");
        l.add("Gosain");

        Iterator i = l.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
        i.remove();
      //It will remove the last element of iterator
        /*for(String s: l ){
            System.out.println(s);
        }

         */
        System.out.println(l);
        ListIterator listIterator = l.listIterator();


    }
}
