package collections.practice.collections;
// Priorities class to handle the events and maintain the priority queue

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class priorities {

        private PriorityQueue<students> studentsQueue = new PriorityQueue<>();

        public List<students> getStudents(List<String> events) {
            for (String event : events) {
                String[] details = event.split(" ");

                if (details[0].equals("ENTER")) {
                    String name = details[1];
                    double cgpa = Double.parseDouble(details[2]);
                    int id = Integer.parseInt(details[3]);

                    // Create a new student and add to the priority queue
                    students students = new students(id, name, cgpa);
                    studentsQueue.add(students);

                } else if (details[0].equals("SERVED")) {
                    // Remove the student with the highest priority
                    studentsQueue.poll();
                }
            }

            // Collect all the remaining students in the priority order
            List<students> students = new ArrayList<>();
            while (!studentsQueue.isEmpty()) {
                students.add(studentsQueue.poll());
            }
            return students;
        }
    }
