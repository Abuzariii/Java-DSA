import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 1 };

        int[] ans = shuffle(nums, 3);
        System.out.println(Arrays.toString(ans));
    }

    // https://leetcode.com/problems/shuffle-the-array/
    public static int[] shuffle(int[] nums, int n) {
        int[] array1 = new int[n];
        int[] array2 = new int[n];

        for (int i = 0; i < n; i++) {
            array1[i] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            array2[i] = nums[n + i];
        }

        int[] ans = new int[array1.length * 2];

        for (int i = 0; i < array1.length; i++) {
            ans[i * 2] = array1[i];
            ans[i * 2 + 1] = array2[i];
        }

        return ans;
    }

    // https://leetcode.com/problems/richest-customer-wealth
    public static int maximumWealth(int[][] accounts) {
        int ans = accounts[0][0];

        for (int i = 0; i < accounts.length; i++) {
            int flag = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                flag += accounts[i][j];
            }
            if (flag > ans) {
                ans = flag;
            }
        }
        return ans;
    }

    // https://leetcode.com/problems/running-sum-of-1d-array
    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[i] + sumPrev(nums, i);
        }

        return ans;

        // Another clever, in-place approach, no new array, no extra method
        // for (int i = 1; i < nums.length; i++) {
        // nums[i] = nums[i - 1] + nums[i];
        // }
        // return nums;
    }

    private static int sumPrev(int[] nums, int j) {
        int ans = 0;
        for (int i = 0; i < j; i++) {
            ans += nums[i];
        }
        return ans;
    }

    // https://leetcode.com/problems/concatenation-of-array
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];

        for (int i = 0; i <= nums.length - 1; i++) {
            ans[i] = nums[i];
        }

        int flag = 0;
        for (int i = nums.length; i <= ans.length - 1; i++) {
            ans[i] = nums[flag];
            flag++;
        }

        return ans;

        // Someone else's solution
        // int n = nums.length;
        // int[] ans = new int[2 * n];
        // for (int i = 0; i < n; i++) {
        // ans[i] = nums[i];
        // ans[i + n] = nums[i];
        // }
        // return ans;
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
