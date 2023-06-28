// Leetcode url : https://leetcode.com/problems/peak-index-in-a-mountain-array/
// This is an optimized solution using Binary Search

public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9, 4, 3, 2, 1 };

        int index = searchPeak(arr);
        System.out.println(index);
    }

    static int searchPeak(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return -1;
    }
}
