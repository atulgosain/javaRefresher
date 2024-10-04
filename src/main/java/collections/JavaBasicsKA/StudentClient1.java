package collections.JavaBasicsKA;

public class StudentClient1 {

        public static void main(String[] args) {
            // Creating Student objects (a and b)
            Student1 a = new Student1(15, 8);  // 15 units, stress level 8
            Student1 b = new Student1(12, 5);  // 12 units, stress level 5

            // Sending a message (calling a method) to object a
            System.out.println("Student A's units: " + a.getUnits());  // Output: 15
            System.out.println("Student A's stress level: " + a.getStress());  // Output: 8

            // Sending a message (calling a method) to object b
            System.out.println("Student B's units: " + b.getUnits());  // Output: 12
            System.out.println("Student B's stress level: " + b.getStress());  // Output: 5
        }
    }