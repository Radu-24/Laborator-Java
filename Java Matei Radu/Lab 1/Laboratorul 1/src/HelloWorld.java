public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
class Vars {
    public static void main(String[] args){
        int x = 150;
        Double y = 2.0;
        float z = 20f;
        byte b = 10;
        short c = 14;
        y = (double) x; //convertim int(x) in dublu(y)
        System.out.println(y);
        Double doubleValue = Double.valueOf((double) x); //convertim int x in double si apoi in double
        int intValue = doubleValue.intValue(); // convertim double in int
        byte byteValue = doubleValue.byteValue(); //convertim double in byte
        System.out.println("intValue:" + intValue);
        System.out.println("byteValue:" + byteValue);
        String doubleStr = "5.55";
        double parsedDouble = Double.parseDouble(doubleStr);
        System.out.println("parsedDouble:" + parsedDouble);
        Double nanValue = Double.NaN;
        System.out.println("NaN:" + nanValue.isNaN());

    }
}
