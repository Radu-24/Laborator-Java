import java.util.HashSet;
public class CommonElementsInArrays {
    public static void main(String[] args){
        int[] array1 = {12, 54, 2, 78, 36, 22, 92};
        int[] array2 = {33, 6, 19, 86, 54, 44, 20, 78};
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : array1) {
            set1.add(num);
        }

        HashSet<Integer> set2 = new HashSet<>();
        for (int num : array2){
            set2.add(num);
        }

        set1.retainAll(set2);

        int countCommonElements = set1.size();

        System.out.println("Common elements: " + set1);
        System.out.println("Number of common elements: " + countCommonElements);
    }
}
