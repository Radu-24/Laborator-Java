import java.util.Arrays;

public class TypeConversion {
    public static void main(String[] args){
       double doubled = 102939939.939E+20;
       boolean booleanValue = true;
       long longValue = 1232874;
       char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

       String doubledStr = String.valueOf(doubled);
       String booleanStr = String.valueOf(booleanValue);
       String longStr = String.valueOf(longValue);
       String charArrayStr = String.valueOf(charArray);

       System.out.println("1. convert to String:");
       System.out.println("doubled: " + doubledStr);
       System.out.println("booleanValue: " + booleanStr);
       System.out.println("longValue: " + longStr);
       System.out.println("cahrArray: " + charArrayStr);

       try {
           double convertedDouble = Double.parseDouble(doubledStr);
           boolean convertedBoolean = Boolean.parseBoolean(booleanStr);
           long convertedLong = Long.parseLong(longStr);

           char[] convertedCharArray = charArrayStr.toCharArray();

           System.out.println("\n2. Converted back to original data types:");
           System.out.println("doubled: " + convertedDouble);
           System.out.println("booleanValue: " + convertedBoolean);
           System.out.println("longValue: " + convertedLong);
           System.out.println("char Array: " + Arrays.toString(convertedCharArray));

       }
       catch (NumberFormatException e) {
           System.out.println("Error: Unable to convert back to original data types. ");
           e.printStackTrace();
       }
    }
}
