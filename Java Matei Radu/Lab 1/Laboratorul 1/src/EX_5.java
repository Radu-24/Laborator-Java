public class EX_5 {
    public static void main(String[] args) {
    int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String [] months = {"Ianuarie", "Februarie", "Martie", "Aprilie", "Mai", "Iunie",
            "Iulie", "August", "Septembrie", "Octombrie", "Noiembrie", "Decembrie"};
    for (int i = 0; i < months.length; i++) {
        String abbreviatedMonth = months[i].substring(0, 3);
        System.out.println("Luna " + abbreviatedMonth + " Ziua " + month_days[i] );
    }
}
}
