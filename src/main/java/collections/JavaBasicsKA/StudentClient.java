package collections.JavaBasicsKA;

public class StudentClient {
    public static void main(String[] args) {
        // Allocating objects with "new" - calling constructor
        Student student1 = new Student("Alice", 20, 88.5);
        Student student2 = new Student("Bob", 22, 90.0);

        // Sending messages to the receiver object
        student1.displayInfo(); // Displaying student1's info
        student2.displayInfo(); // Displaying student2's info

        // Accessing public elements (methods)
        System.out.println("Grade of " + student1.getName() + ": " + student1.getGrade());

        // Modifying a student's grade
        student1.setGrade(91.0);
        System.out.println("Updated Grade of " + student1.getName() + ": " + student1.getGrade());
    }
}

