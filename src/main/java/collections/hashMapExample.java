package collections;
import java.util.Map;
import java.util.HashMap;

import static java.lang.System.*;

public class hashMapExample {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple",10);
        hashMap.put("Banana", 20);
        hashMap.put("Orange",30);
        hashMap.put("Banana",40);

       System.out.println(hashMap);

        System.out.println("Value Of Apple: "+hashMap.get("Apple"));
        //Remove Key Value Pair

        hashMap.remove("Orange");
        out.println("After removing Orange: "+hashMap);



    }
}
