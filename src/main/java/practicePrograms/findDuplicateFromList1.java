package practicePrograms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class findDuplicateFromList1 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Melon");
        fruits.add("Mango");
        fruits.add("Malta");
        fruits.add("Mango");

        for (String fruit: fruits){
            System.out.println(fruit);
        }

        Set<String> hs1= new LinkedHashSet<>(fruits);
        List<String> uniqueFruits = new ArrayList<>(hs1);
        System.out.println("Unique Fruits name are: "+ uniqueFruits);


    }

}
