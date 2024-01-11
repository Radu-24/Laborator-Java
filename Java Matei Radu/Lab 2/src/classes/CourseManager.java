package classes;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    Course[] courses; // Array to hold courses.

    public CourseManager() {
        courses = new Course[0]; // Initializing courses as an empty array.

        // List<Course> courses;
    }

    public void addCourse(Course course) { // Lines 15-22: Copying courses to a new array and adding a new course.
        int newLength = courses.length + 1;
        Course[] aux = new Course[newLength];
        for (int i = 0; i < courses.length; i++) {
            aux[i] = courses[i];
        }
        aux[newLength - 1] = course;
        courses = aux;
    }

    public List<String> listStudentsInCourse(String courseName) {
        List<String> enrolledStudents = new ArrayList<>();

        for (Course course : courses) {
            if (course.getName().equals(courseName)) {
                Student[] students = course.getStudents();
                for (Student student : students) {
                    enrolledStudents.add(student.getFullName());
                }
                break;
            }
        }
        return enrolledStudents;
    }

    public double calculateProfessorGradingAverage(Professor professor) {
        double totalGrades = 0;
        int totalStudents = 0;

        for (Course course : courses) {
            if (course.getTeacher().equals(professor)) {
                Student[] students = course.getStudents();
                for (Student student : students) {
                    totalGrades += student.getGrade();
                    totalStudents++;
                }
            }
        }

        if (totalStudents == 0) {
            System.out.println("Profesorul " + professor.getFullName() + " nu a dat note în niciun curs.");
            return 0.0;
        }

        return totalGrades / totalStudents;
    }

    public double calculateCourseAverage(String courseName) {
        double totalGrades = 0;
        int totalStudents = 0;

        for (Course course : courses) {
            if (course.getName().equals(courseName)) {
                Student[] students = course.getStudents();
                for (Student student : students) {
                    totalGrades += student.getGrade();
                    totalStudents++;
                }
                break;
            }
        }

        if (totalStudents == 0) {
            System.out.println("Nu există studenți în cursul cu numele: " + courseName);
            return 0.0;
        }

        return totalGrades / totalStudents;
    }

    public void enrollStudentInCourse(String courseName, Student student) {
        for (Course course : courses) {
            if (course.getName().equals(courseName)) {
                course.addStudent(student);
                break;
            }
        }
    }

    public void displayCoursesToConsole() {
        for (Course course : courses) {
            System.out.println(course);
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Matei", "Radu", 1111, 99);
        Student student2 = new Student("Alex", "Doltu", 1111, 12);

        Professor prof = new Professor("Sandu", "Mihai");

        Course course = new Course("Fizica 1", "Fizica Cuantica ", prof, new Student[] { student1, student2 });
        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course);

        Student student3 = new Student("Mihnea", "Marcel", 1111, 58);
        courseManager.enrollStudentInCourse("Fizica 2", student3);

        courseManager.displayCoursesToConsole();
        String courseNameToCalculate = "Fizica 1";
        double courseAverage = courseManager.calculateCourseAverage(courseNameToCalculate);
        System.out.println("Media pentru cursul '" + courseNameToCalculate + "': " + courseAverage);
    }
}