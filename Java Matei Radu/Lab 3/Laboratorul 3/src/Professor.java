public class Professor extends Person {
    private String title;

    public Professor() {
        this.name = "";
        this.surname = "";
        this.title = "";
    }

    public Professor(String name, String surname, String title) {
        this.name = name;
        this.surname = surname;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Professor { " + "name=" + name + ", surname=" + surname + ", title=" + title + " }";
    }
}