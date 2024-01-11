package classes;

public class Course {
    private final String name; // Line 3: Name of the course.
    private final String description; // Line 4: Description of the course.
    private final Professor teacher; // Line 5: Teacher of the course.
    private Student[] students; // Line 6: Array to hold enrolled students.

    public Course(String name, String description, Professor teacher, Student[] students) { // Lines 9-14: Initializing
                                                                                            // course details.
        this.name = name;
        this.description = description;
        this.teacher = teacher;
        this.students = students;
    }

    public void addStudent(Student student) { // Lines 16-20: Adding a student to the course.
        Student[] newStudents = new Student[students.length + 1];
        System.arraycopy(students, 0, newStudents, 0, students.length);
        newStudents[students.length] = student;
        students = newStudents;

    }

    public Professor getTeacher() {
        return teacher;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public String toString() {
        StringBuilder courseInfo = new StringBuilder();
        courseInfo.append("Couse: ").append(name).append("\n");
        courseInfo.append("Description: ").append(description).append("\n");
        courseInfo.append("Teacher: ").append(teacher.getFullName()).append("\n");
        courseInfo.append("Students:\n");

        for (Student student : students) {
            courseInfo.append("   ").append(student.getFullName()).append("\n");

        }
        return courseInfo.toString();
    }
}
