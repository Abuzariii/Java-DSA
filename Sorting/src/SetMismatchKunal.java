// Leetcode url : https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;

public class SetMismatchKunal {
    public static void main(String[] args) {
        int[] numsay = { 2, 1, 3, 3, 5 };
        int[] numsayy = sort(numsay);
        System.out.println(Arrays.toString(numsayy));
    }

    static int[] sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        // search for first missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[] { nums[index], index + 1 };
            }
        }
        return new int[] { -1, -1 };
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
