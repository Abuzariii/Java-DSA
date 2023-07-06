import java.util.Arrays;

public class CycleSortSimplified {
    public static void main(String[] args) {
        // int[] nums = { 1, 2, 0, 3, 5, -1, -3 };
        int[] nums = { 3, 4, -1, 1, -2 };

        // For every element in the array, Check if :
        // If element is greater than zero i.e positive
        // If element is smaller than the length of the array
        // If element is not equal to 1 less than its index then swap that number with
        // that number on its true index
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]) {
                int correctIndex = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
