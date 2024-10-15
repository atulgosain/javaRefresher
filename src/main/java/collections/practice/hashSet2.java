package collections.practice;

import java.util.HashSet;

public class hashSet2 {
    public static void main(String[] args) {
        HashSet<Integer> evenNum = new HashSet<Integer>();
        evenNum.add(2);
        evenNum.add(4);
        evenNum.add(14);

        System.out.println("HashSet: "+evenNum);

        HashSet<Integer> num = new HashSet<Integer>();
        num.addAll(evenNum);
        num.add(16);

        System.out.println("Num: "+num);

        //Remove All
        num.removeAll(evenNum);

        System.out.println("num after Remove All: "+num);
    }
}
