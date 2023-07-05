import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] array = { 3, 8, 5, 7, 2, 1, 6, 4 };
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    static void sort(int[] array) {
        // Using while loop
        int i = 0;
        while (i < array.length) {
            int correctIndex = array[i] - 1;
            if (array[i] != array[correctIndex]) {
                swap(array, i, correctIndex);
            } else {
                i++;
            }
        }

        // If zero is included in the array and there is a missing number too
        // int i = 0;
        // while (i < array.length) {
        // int correctIndex = array[i];
        // if (array[i] < array.length && array[i] != array[correctIndex]) {
        // swap(array, i, correctIndex);
        // } else {
        // i++;
        // }
        // }

        // Using for loop
        // for (int i = 0; i < array.length; i++) {
        // int correctIndex = array[i] - 1;
        // if (array[i] != array[correctIndex]) {
        // int temp = array[i];
        // array[i] = array[correctIndex];
        // array[correctIndex] = temp;
        // }
        // }

    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
