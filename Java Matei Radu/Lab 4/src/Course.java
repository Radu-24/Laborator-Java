import java.util.Set;

public class Course {
    // Fields to store course information
    private String nume; // Course name
    private Professor profesor; // Professor for the course
    private Set<Student> studenti; // Set of students enrolled in the course

    // Constructor to initialize course data
    public Course(String nume, Professor profesor, Set<Student> studenti) {
        this.nume = nume;
        this.profesor = profesor;
        this.studenti = studenti;
    }

    // Getter method for retrieving the set of students
    public Set<Student> getStudenti() {
        return studenti;
    }

    // Getter method for retrieving the professor
    public Professor getProfesor() {
        return profesor;
    }

    // Getter method for retrieving the course name
    public String getNume() {
        return nume;
    }
}
