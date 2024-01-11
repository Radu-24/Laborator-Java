import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MockClassesManager implements ISourceManager {
    @Override
    public List<Course> getCursuri() {
        // Create mock data for students in the first course
        List<Student> studenti1 = new ArrayList<>();
        studenti1.add(new Student("Nume1", "Prenume1", 1));
        studenti1.add(new Student("Nume2", "Prenume2", 2));

        // Create mock data for students in the second course
        List<Student> studenti2 = new ArrayList<>();
        studenti2.add(new Student("Nume3", "Prenume3", 1));
        studenti2.add(new Student("Nume4", "Prenume4", 2));

        // Create mock courses with professors and student sets
        List<Course> cursuri = new ArrayList<>();
        cursuri.add(new Course("Curs1", new Professor("Profesor1"), new HashSet<>(studenti1)));
        cursuri.add(new Course("Curs2", new Professor("Profesor2"), new HashSet<>(studenti2)));

        return cursuri;
    }

    @Override
    public List<Student> getStudenti() {
        // Create mock data for students
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Nume1", "Prenume1", 1));
        studenti.add(new Student("Nume2", "Prenume2", 2));
        studenti.add(new Student("Nume3", "Prenume3", 1));
        studenti.add(new Student("Nume4", "Prenume4", 2));

        return studenti;
    }
}
