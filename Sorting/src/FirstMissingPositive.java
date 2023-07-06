// Leetcode url : https://leetcode.com/problems/first-missing-positive/

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        // int[] array = { 1, 2, 0, 3, 5, -1, -3 };

        // System.out.println(firstPositiveMissing(array));

        int[] nums = { 1, 2, 0, 3, 5, -1, -3 };
        int n = nums.length;
        // Move each positive number to its correct position using Cyclic sort
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int correctIndex = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    static int firstPositiveMissing(int[] nums) {
        int n = nums.length;

        // Cyclic sort : Move each positive number to its correct position using
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
}
