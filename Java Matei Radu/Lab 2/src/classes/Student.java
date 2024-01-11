package classes;

public class Student {
    String firstName;
    String lastName;
    int groupNumber;
    int grade;

    public Student(String firstName, String lastName, int groupNumber, int grade) { // Lines 9-13: Initializing
                                                                                    // student's details.
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupNumber = groupNumber;
        this.grade = grade;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getGrade() {
        return grade;
    }

    public String toString() {
        return " Student { " + "firstName=" + firstName + " , lastName=" +
                lastName + " , groupNumber=" + groupNumber + " } ";

    }

    public static void main(String[] args) {
        Student student = new Student("Damian", "Ion", 1111, 90); // Provide a grade value
        String fullName = student.getFullName();
        System.out.println(fullName);
    }

}
