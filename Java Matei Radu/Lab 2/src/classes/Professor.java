package classes;

public class Professor {
    String firstName;
    String lastName;

    public Professor(String firstName, String lastName) { // Lines 7-9: Initializing professor's first and last name.
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String toString() {
        return "Professor { " + "firstName=" + firstName + " , lastName="
                + lastName + " } ";
    }

    public static void main(String[] args) {
        Professor professor = new Professor("Sandu", "Mihai");
        String fullName = professor.getFullName();
        System.out.println(fullName);
    }
}
