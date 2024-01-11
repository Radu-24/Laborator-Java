public class PalindromicArrayCheck {
    public static void main(String[] args) {
        int[] array1={23, 56, 79, 61, 34, 61, 79, 56,23};
        int[] array2={21, 44, 37, 90, 21, 44, 37};

        if (isPalindrome(array1)){
            System.out.println("Array 1 - yes, it's a palindrome.");

        } else{
            System.out.println("Array 1 - no, it's not a palindrome.");
        }

        if(isPalindrome(array2)) {
            System.out.println("Array 2 - yes, it's a palindrome.");
        } else {
            System.out.println("Array 2 - no, it's not a palindrome.");
        }
    }

    public static boolean isPalindrome(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left<right) {
            if (array[left] != array[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
