// Leetcode url : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// This is my own solution, Kunal used a different one

import java.util.Arrays;

public class FirstLastOptimized {
    public static void main(String[] args) {
        int[] array = { 1, 2, 4, 4, 4, 6, 6, 7, 8, 8, 9 };
        int target = 4;

        int[] indexes = firstLast(array, target);
        System.out.println(Arrays.toString(indexes));
    }

    static int[] firstLast(int[] nums, int target) {
        int[] ans = { -1, -1 };
        int start = 0;
        int end = nums.length - 1;

        // Find the first occurrence
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                ans[0] = mid;
                end = mid - 1; // Update 'end' to continue searching for the last occurrence
            }
        }

        // Find the last occurrence
        start = 0;
        end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                ans[1] = mid;
                start = mid + 1; // Update 'start' to continue searching for the last occurrence
            }
        }

        return ans;
    }
}
