public interface CourseOperations {
    void UpdateProfessor(Professor p);
    void AddStudent(Student student);
    void RemoveStudent(Student student);
    void UpdateStudent(Student student);
    void UpdateCourse(String name, String description);
}