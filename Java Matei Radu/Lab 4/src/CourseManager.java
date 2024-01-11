import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class CourseManager implements ISourceManager {
    private List<Course> courses;
    private List<Student> students;

    @Override
    public List<Course> getCursuri() {
        return courses;
    }

    @Override
    public List<Student> getStudenti() {
        return students;
    }

    // Group students by their group numbers
    public Map<Integer, List<Student>> grupareStudentiDupaGrup() {
        Map<Integer, List<Student>> grupuri = new HashMap<>();
        for (Course curs : courses) {
            for (Student student : curs.getStudenti()) {
                int numarGrup = student.getGrup();
                if (grupuri.containsKey(numarGrup)) {
                    grupuri.get(numarGrup).add(student);
                } else {
                    List<Student> listaStudenti = new ArrayList<>();
                    listaStudenti.add(student);
                    grupuri.put(numarGrup, listaStudenti);
                }
            }
        }
        return grupuri;
    }

    // Sort courses based on the specified criteria
    public void sortCourses(String criteriu) {
        switch (criteriu.toLowerCase()) {
            case "nume":
                // Sort courses by name
                Collections.sort(courses, Comparator.comparing(Course::getNume));
                break;
            case "profesor":
                // Sort courses by professor name
                Collections.sort(courses, Comparator.comparing(course -> course.getProfesor().getNume()));
                break;
            case "numar_studenti":
                // Sort courses by the number of students
                Collections.sort(courses, Comparator.comparingInt(course -> course.getStudenti().size()));
                break;
            default:
                // Display a message for unknown sorting criteria
                System.out.println("Criteriu de sortare necunoscut.");
        }
    }

    // Search for a course by name
    public Course cautaCursDupaNume(String numeCurs) {
        for (Course curs : courses) {
            if (curs.getNume().equalsIgnoreCase(numeCurs)) {
                return curs;
            }
        }
        return null; // Return null if the course is not found
    }
}
