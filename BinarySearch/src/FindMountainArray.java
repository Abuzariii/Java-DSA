// Leetcode url : https://leetcode.com/problems/find-in-mountain-array/

import java.util.Arrays;

public class FindMountainArray {
    public static void main(String[] args) {
        // int[] array = { 1, 2, 4, 5, 6, 3, 2, 1 };

        int[] array = createMountainArray.createMountain(20);
        System.out.println(Arrays.toString(array));

        System.out.println(searchMountain(array, 3));

    }

    public static int searchMountain(int[] array, int target) {
        int peakIndex = findPeakIndex(array);
        int ascendingResult = binarySearchAscending(array, target, 0, peakIndex);
        if (ascendingResult != -1) {
            return ascendingResult;
        }
        return binarySearchDescending(array, target, peakIndex + 1, array.length - 1);
    }

    private static int findPeakIndex(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (array[mid] < array[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    private static int binarySearchAscending(int[] array, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    private static int binarySearchDescending(int[] array, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
