package collections.JavaBasicsKA;

public class Student {
    private String name;
    private int age;
    private double grade;

    //constructor
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Public method to get the name
    public String getName() {
        return name;
    }

    // Public method to get the age
    public int getAge() {
        return age;
    }

    // Public method to get the grade
    public double getGrade() {
        return grade;
    }

    // Public method to set the grade
    public void setGrade(double grade) {
        this.grade = grade;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);

    }
}
