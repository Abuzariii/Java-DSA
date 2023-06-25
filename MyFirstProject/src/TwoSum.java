// Leetcode url https://leetcode.com/problems/two-sum/

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 7 };
        int target = 5;

        int[] index = twoSum(arr, target);
        System.out.println(Arrays.toString(index));
    }

    static int[] twoSum(int[] array, int target) {
        // My own solution

        // int iIndex = 0;
        // for (int i : array) {
        // int jIndex = 0;
        // for (int j : array) {
        // if (iIndex != jIndex && i + j == target) {
        // return new int[] { iIndex, jIndex };
        // }
        // jIndex++;
        // }
        // iIndex++;
        // }
        // return new int[] { -1, -1 };
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };

        // Solution from a leetcode suggestion
        // int i = 0;
        // int j = 1;
        // while (array[i] + array[j] != target && i < array.length && j < array.length)
        // {
        // j++;
        // if (j > array.length - 1) {
        // i++;
        // j = i + 1;
        // }
        // }
        // return new int[] { i, j };
    }
}
