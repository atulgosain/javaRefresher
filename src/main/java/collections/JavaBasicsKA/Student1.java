package collections.JavaBasicsKA;

public class Student1 {

    // Attributes (fields)
    private int units;
    private int stressLevel;

    // Constructor to initialize the Student object
    public Student1(int units, int stressLevel) {
        this.units = units;
        this.stressLevel = stressLevel;
    }

    // Method to get the number of units
    public int getUnits() {
        return units;
    }

    // Method to get the student's stress level
    public int getStress() {
        return stressLevel;
    }
}
