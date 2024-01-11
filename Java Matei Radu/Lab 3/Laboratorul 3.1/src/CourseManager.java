import java.util.ArrayList;
import java.util.List;

public class CourseManager implements ManagerCourseOperations {
    private List<Course> courses;

    public CourseManager() {
        this.courses = new ArrayList<>();
    }

    public void AddCourse(Course course) {
        courses.add(course);
        System.out.println("Course added: " + course.getCourseName());
    }

    public void UpdateCourse(Course course) {
        System.out.println("Course updated: " + course.getCourseName());
    }

    public void DeleteCourse(Course course) {
        courses.remove(course);
        System.out.println("Course deleted: " + course.getCourseName());
    }

}