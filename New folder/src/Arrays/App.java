package Arrays;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] nums = { 5, 0, 1, 2, 3, 4 };
        int[] ans = buildArray(nums);

        System.out.println(Arrays.toString(ans));
    }

    // https://leetcode.com/problems/build-array-from-permutation/
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i <= ans.length - 1; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
