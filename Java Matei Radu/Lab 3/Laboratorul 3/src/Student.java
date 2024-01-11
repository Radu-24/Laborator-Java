public class Student extends Person {
    private int group;

    public Student() {
        this.name = "";
        this.surname = "";
        this.group = 0;
    }

    public Student(String name, String surname, int group) {
        this.name = name;
        this.surname = surname;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student { " + "name=" + name + ", surname=" + surname + ", group=" + group + " } ";
    }
}
