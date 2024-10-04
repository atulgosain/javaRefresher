package collections;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(07);
        treeSet.add(18);
        treeSet.add(9);
        System.out.println("Tree Set in Starting"+ treeSet);
        System.out.println("first Element: "+treeSet.first());
        System.out.println("last Element:"+treeSet.last());
        System.out.println("Size "+treeSet.size());
       //Exception:  treeSet.remove(7);

        System.out.println("After removing 1 number: "+treeSet);
treeSet.addLast(20);
        System.out.println(treeSet);

    }
}
