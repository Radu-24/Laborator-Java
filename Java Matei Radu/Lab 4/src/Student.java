import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> {
    // Fields to store student information
    private String nume; // Last name
    private String prenume; // First name
    private int grup; // Group number

    // Constructor to initialize student data
    public Student(String nume, String prenume, int grup) {
        this.nume = nume;
        this.prenume = prenume;
        this.grup = grup;
    }

    // Getter method for retrieving the last name
    public String getNume() {
        return nume;
    }

    // Getter method for retrieving the first name
    public String getPrenume() {
        return prenume;
    }

    // Getter method for retrieving the group number
    public int getGrup() {
        return grup;
    }

    // Implementation of the Comparable interface for sorting students
    @Override
    public int compareTo(Student altStudent) {
        int rezultatComparare = this.nume.compareTo(altStudent.nume);
        if (rezultatComparare == 0) {
            rezultatComparare = this.prenume.compareTo(altStudent.prenume);
        }

        return rezultatComparare;
    }

    // Main method for testing sorting functionality
    public static void main(String[] args) {
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Mocanu", "Mihai", 1));
        studenti.add(new Student("Macanu", "Vasile", 2));
        studenti.add(new Student("Mocanu", "Gabriel", 1));

        // Sort the list of students
        Collections.sort(studenti);

        // Display the sorted list of students
        for (Student student : studenti) {
            System.out.println(student.getNume() + " " + student.getPrenume());
        }
    }
}
