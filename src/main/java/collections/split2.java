package collections;

import java.util.ArrayList;

public class split2 {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(-3);
        al.add(-5);
        al.add(6);

        //getting SplIterator object to al
      //  splitIterator<Integer> si= al.spliterator();

        ArrayList<Integer> tempList = new ArrayList<>();

      //  while( si.tryAdvance(n) > tempList.add(Math.abs(n));
       // si.tryAdvance(n)--;
     //   System.out.println(si);

        System.out.println(tempList);

    }
}
