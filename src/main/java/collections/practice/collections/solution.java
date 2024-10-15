package collections.practice.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        //input reading setup
        System.out.println("Enter number of events: ");
        Scanner sc = new Scanner(System.in);
        int totalEvents = Integer.parseInt(sc.nextLine());
        System.out.println("totalEvents: "+totalEvents);

        List<String> events = new ArrayList<>();
        for(int i = 0; i<totalEvents;i++){
            System.out.println(i);
            events.add(sc.nextLine());
        }
        //create instance of priority class
        priorities priorTies = new priorities();
        System.out.println("Events:"+events);
        List<students> student = priorTies.getStudents(events);

        //If no Student remains, print "Empty"
        if(student.isEmpty()){
            System.out.println("EMPTY");
                    }
        else{
            for(students stdnt: student){
                System.out.println(stdnt.getName());

            }
        }

    }
}
