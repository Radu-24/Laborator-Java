public class EX_3 {
    public static void main(String[] args) {
    int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String[] months = {"Ianuarie", "Februarie", "Martie", "Aprilie", "Mai", "Iunie",
            "Iulie", "August", "Septembrie", "Octombrie", "Noiembrie", "Decembrie"};
    for (int i = 0; i < months.length; i++) {
        if (month_days[i] < 31) {
            System.out.println("Luna " + months[i] + " are " + month_days[i] + " de zile");
        }
    }
}
}
