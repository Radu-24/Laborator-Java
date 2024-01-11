import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create an instance of MockClassesManager to manage mock data
        MockClassesManager mockManager = new MockClassesManager();
        // Retrieve courses from the mock manager and store them in a list
        List<Course> cursuri = new ArrayList<>(mockManager.getCursuri());
        // Create an instance of CourseManager to manage courses
        CourseManager courseManager = new CourseManager();
        // Add all courses from the list to the course manager
        courseManager.getCursuri().addAll(cursuri);
        // Sort the courses by name using the 'sortCourses' method
        courseManager.sortCourses("nume");
        // Retrieve the sorted courses from the course manager
        List<Course> cursuriSortate = courseManager.getCursuri();
        // Display information about each course in the sorted list
        for (Course curs : cursuriSortate) {
            System.out.println("Curs: " + curs.getNume() + ", Profesor: " + curs.getProfesor().getNume());
        }
        // Specify the name of the course to be searched
        String numeCursCautat = "Java Programming";
        // Search for the course with the specified name using 'cautaCursDupaNume'
        // method
        Course cursGasit = courseManager.cautaCursDupaNume(numeCursCautat);

        // Display whether the course was found or not
        if (cursGasit != null) {
            System.out.println("Cursul a fost găsit: " + cursGasit.getNume());
        } else {
            System.out.println("Cursul nu a fost găsit.");
        }
    }
}