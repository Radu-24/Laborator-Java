import java.util.Arrays;
public class StringArraySorting {
    public static void main(String[] args){
        String arr[] = {"Now", "is", "the", "time", "for", "all", "good", "men", "to", "come",
                "to", "the", "aid", "of", "their", "country"};

                String sortedArr[] = sortArray(arr);

            System.out.println("Sorted Array:");
            for (String str : sortedArr) {
                System.out.print(str + " ");
            }
            System.out.println();

            String concatenatedStr = concatenateStrings(arr);
            System.out.println("Concatenated String using + operator: " + concatenatedStr);

            String joinedStr = joinStrings(arr);
            System.out.println("Concatenated String using join() method: " + joinedStr);

            String[] reconstructedArr = splitString (concatenatedStr);
            System.out.println("Reconstructed Array from concatenated String:");
            for (String str : reconstructedArr) {
                System.out.print(str + " ");
            }
    }

    private static String[] sortArray(String[] arr){
            Arrays.sort(arr);
            return arr;
        }

    private static String concatenateStrings(String[] arr){
            StringBuilder rezult = new StringBuilder();
            for (String str : arr) {
                rezult.append(str).append(",");
            }
            return rezult.substring(0,rezult.length() - 1);
        }

    private static String joinStrings(String[] arr){
            return String.join(",", arr);
        }

    private static String[] splitString(String concatenatedStr) {
            return concatenatedStr.split(",");
        }
}
