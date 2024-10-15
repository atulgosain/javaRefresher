package collections.practice.collections;

public class students implements Comparable<students> {
    private int id;
    private String name;
    private double cgpa;

    public students(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    //Getters
    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }

    //Implement the compare method to define priority Ordering
    @Override
    public int compareTo(students other) {
        if (Double.compare(this.cgpa, other.cgpa) != 0) {
            return Double.compare(other.cgpa, this.cgpa);
        }
        // If CGPA is the same, compare by name (lexicographically)
        if (!this.name.equals(other.name)) {
            return this.name.compareTo(other.name);
        }
        // If CGPA and name are the same, compare by ID (lower first)
        return Integer.compare(this.id, other.id);

    }

}