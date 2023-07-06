public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] array = { 1, 2, 0, 3, 5 };

        System.out.println(firstPositiveMissing(array));
    }

    static int firstPositiveMissing(int[] nums) {
        int n = nums.length;

        // Move each positive number to its correct position
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int correctIndex = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }
        // Find the first index where the number is incorrect, indicating the missing
        // number
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        // If all numbers are correct, return n + 1 as the missing number
        return n + 1;
    }

    // static void bubbleSort(int[] array) {
    // boolean isSorted = false;
    // while (!isSorted) {
    // isSorted = true;
    // for (int i = 0; i < array.length - 1; i++) {
    // if (array[i] > array[i + 1]) {
    // int temp = array[i];
    // array[i] = array[i + 1];
    // array[i + 1] = temp;
    // isSorted = false;
    // }
    // }
    // }
    // }
}
