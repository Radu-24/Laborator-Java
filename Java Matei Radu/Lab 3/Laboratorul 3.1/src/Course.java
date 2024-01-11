import java.util.ArrayList;
import java.util.List;

public class Course implements CourseOperations, ManagerCourseOperations {
    private String courseName;
    private Professor professor;
    private List<Student> students;

    public Course() {
        this.courseName = "";
        this.professor = new Professor();
        this.students = new ArrayList<>();
    }

    public Course(String courseName, Professor professor, List<Student> students) {
        this.courseName = courseName;
        this.professor = professor;
        this.students = students;
    }

    public String getCourseName() {
        return courseName;
    }

    public void UpdateProfessor(Professor p) {
        this.professor = p;
    }

    public void AddStudent(Student student) {
        this.students.add(student);
    }

    public void RemoveStudent(Student student) {
        this.students.remove(student);
    }

    public void UpdateStudent(Student student) {
     }

    public void UpdateCourse(String name, String description) {
        this.courseName = name;
    }

    public void AddCourse(Course course) {

    }

    public void UpdateCourse(Course course) {
    }

    @Override
    public void DeleteCourse(Course course) {
    }
}