package collections.practice;

import java.util.ArrayList;
import java.util.List;

//From a list of fruits find the repeated items
public class findRepeatedItems
{
    public static void main(String[] args) {
        ArrayList aL = new ArrayList();
        aL.add("Apple");
        aL.add("Grapes");
        aL.add("WaterMelon");
        aL.add("Apple");
        aL.add("Grapes");
        aL.add("Orange");
        aL.add("Lichi");

        List<Object> fruits = List.of("apple", "grapes", "melon", "apple", "orange","pomegranate", "lichi","grapes", "almond", "papaya", "lichi");
        List<Object> repeatedFruits = new ArrayList<Object>();

        for(int x = 0;x<fruits.size();x++){
            for (int y = x+1; y<fruits.size();y++){
                if (fruits.get(x).equals(fruits.get(y))){
                    repeatedFruits.add(fruits.get(x));
                    break;
                }
            }
        }

        System.out.println("Repeated fruits List: "+repeatedFruits);


      /*  for(Object o: aL){
            if ()
        }
*/

    }
}
