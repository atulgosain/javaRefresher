package collections.practice;

import java.util.LinkedList;

public class linkList3 {

    public static void main(String[] args) {
        LinkedList<String> lL= new LinkedList();
        lL.add("Dog");
        lL.add("Cat");
        lL.add("Horse");
        lL.add("dog");

        System.out.println(lL);

        lL.addFirst("Tiger");
        lL.addLast("Elephant");

        System.out.println(lL);

        System.out.println(lL.getFirst());
        System.out.println(lL.getLast());

        lL.removeFirst();
        System.out.println(lL);
        lL.removeLast();
        System.out.println(lL);

    }
}
