package collections.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class arrayList1
{
    public static void main(String[] args) {
        //Declare ArrayList
//To declare with Arraylist which can only have numbers
        //ArrayList<Integer> aL4 = new ArrayList<Integer>();
       // ArrayList<String> aL4 = new ArrayList<String>();

        //From Parent Interface
       // List aL5 = new ArrayList<>();

        ArrayList aL1 = new ArrayList();
        aL1.add("Atul");
        aL1.add(100);
        aL1.add("Akool");
        aL1.add(15.5);
        aL1.add('A');
        aL1.add(true);
       // aL1.add(4,"Anand");
        //aL1.remove(4);
        //aL1.remove("Arjan");
        System.out.println(aL1);
        System.out.println(aL1.get(1));
        System.out.println("Size:"+aL1.size());
       // aL1.remove("Akool");

        //to replace a value we use .set(index,"Object")

        aL1.set(2,"Raja");

       // System.out.println("Size after Remove:"+aL1.size());
        System.out.println(aL1.contains("Raja"));

        System.out.println("All values of ArrayList: "+aL1);

        aL1.set(2,"Karteek");

        System.out.println("Values after replacement: "+aL1);

        //Read the Data
        //for Loop
        System.out.println("Reading element by for loop");
        for (int i=0; i< aL1.size(); i++)
        {
            System.out.print(aL1.get(i)+" ");
        }
        System.out.println("");

        //for Each
        System.out.println("Reading elements using for ..each loop");
        for (Object e:aL1)
             {
                 System.out.print(e+" ");
        }
        System.out.println("");
        //iterator
        System.out.println("Reading elements using Iterator ");

        Iterator it = aL1.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }


/*
        ArrayList<String> aL2 = new ArrayList<String>();
        System.out.println("Is aL2 is Empty: "+ aL2.isEmpty());

        aL2.addAll(0,aL1);

        System.out.println("aL2 value: "+aL2);

        aL2.addAll(2,aL1);
        System.out.println("aL2 value: "+aL2);

       // aL2.removeAll(4);
        //System.out.println("aL2 value: "+aL2);

       // Collections.sort(aL2);
       // System.out.println(aL2);

       */

    }

}
