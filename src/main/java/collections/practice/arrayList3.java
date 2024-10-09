package collections.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayList3 {
    public static void main(String[] args) {
        String arr[]= {"What", "How", "Why"};

        for (String s: arr){
            System.out.println(s);
        }

        ArrayList aL = new ArrayList(Arrays.asList(arr));

        for (Object o: aL) {
            System.out.print(o+" ");
        }

    }
}
