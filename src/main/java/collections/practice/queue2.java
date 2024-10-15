package collections.practice;

import java.util.PriorityQueue;

public class queue2
{
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add("A");
        pq.add("B");
        pq.add("C");
        pq.offer("C");

        System.out.println("PQ Values are: "+pq);
        /*


         */
        System.out.println("PQ Values are: "+pq);
        //get Head element
      // System.out.println(pq.element()); //When Blank gives Exception "main" java.util.NoSuchElementException

     //   System.out.println(pq.peek()); //returns null when queue is empty
//Return and Remove Elements remove() poll()
        //System.out.println(pq.remove()); //A -If queue is null it will return exception
        //System.out.println(pq); //[B, C, C]

        System.out.println(pq.poll());//A-If queue is null it will return Null
        System.out.println(pq);//[B, C, C]
    }
}
