package collections;

import java.util.ArrayList;
import java.util.Spliterator;

public class splitIterator {

    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(2);
        a1.add(4);
        a1.add(-6);
        a1.add(8);
        a1.add(-10);
        Spliterator<Integer> splitr1 =a1.spliterator() ;

        Spliterator<Integer> splitr1_split = splitr1.trySplit();

        if (!(splitr1_split != null)){
            System.out.println("Output of Splitr1: ");
    //   splitr1_split.forEachRemaining((n)->);
        }


//estimateSize method
        else {
            System.out.println("Estimate Size: "+splitr1.estimateSize());
        }

// getExactSizeIfKnown method

        System.out.println("Exact size: "+splitr1.getExactSizeIfKnown());





    }

}
