package collections.practice;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet1 {
    public static void main(String[] args) {

        /*//Concept of Load factor

        HashSet hs1 = new HashSet(100);//Declared with capacity 100
        HashSet hs2 = new HashSet(100, 0.90F);//declared with 0.90 loadfactor
        HashSet<Integer> hs3 = new HashSet<Integer>(100);

        //Hash Set doesn't have any specific methods
    */

        HashSet hs = new HashSet(); // default capacity is 16, with load factor 0.75
//HashSet<Interger> hs1 = new HashSet<Interger>();

        hs.add(100);
        hs.add("Welcome");
        hs.add(15.6);
        hs.add('A');
        hs.add(true);
        hs.add(null);
        hs.add("@#$%");

        System.out.println(hs); //[null, A, 100, @#$%, Welcome, 15.6, true] Insertion order not preserved.

        //remove
        hs.remove(15.6);
        System.out.println(hs);

        //contains
        System.out.println(hs.contains(15.6));//false as its removed at line 31
        System.out.println(hs.contains("welcome"));//false as its case sensetive

        System.out.println("HashSet is Empty: "+hs.isEmpty());//False

        //Read data from HashSet
        System.out.println("Reading Objects of HashSet:");
        //Using ForEach Loop
        System.out.println("Using ForEach Loop");
        for (Object ob: hs){
            System.out.println(ob);
        }

        System.out.println("Using Iterator");
        Iterator it = hs.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }











    }
}
