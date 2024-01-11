public class EX_4 {
    public static void main(String[] args) {
    int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String [] months = {"Ianuarie", "Februarie", "Martie", "Aprilie", "Mai", "Iunie",
            "Iulie", "August", "Septembrie", "Octombrie", "Noiembrie", "Decembrie"};
    int totalDays = 0;
    for (int i = 0; i < months.length; i++) {
        if (month_days[i] < 31) {
          System.out.println("Luna " + months[i] + " are " + month_days[i] + " de zile");
          totalDays += month_days[i];
        }
    }System.out.println( "Totalul zilelelor pentru lunile cu mai putin de 31 de zile este: " + totalDays);
}
}
