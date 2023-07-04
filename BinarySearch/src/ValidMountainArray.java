// Leetcode url : https://leetcode.com/problems/valid-mountain-array

public class ValidMountainArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 3, 3 };

        System.out.println(isValid(array));
    }

    static boolean isValid(int[] arr) {
        if (arr.length < 3)
            return false;
        int i = 0;

        for (; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                i++;
                break;
            } else if (arr[i] == arr[i + 1]) {
                return false;
            }
        }
        if (i < 2)
            return false;
        for (; i < arr.length; i++) {
            if (arr[i - 1] <= arr[i]) {
                return false;
            }
        }
        return true;
    }
}
