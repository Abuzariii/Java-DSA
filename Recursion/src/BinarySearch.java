public class BinarySearch {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13 };
        int target = 13;
        System.out.println(bnSearch(array, target));
        System.out.println(bnSearchRecc(array, target, 0, array.length - 1));

    }

    static int bnSearchRecc(int[] array, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int mid = (s + e) / 2;

        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            return bnSearchRecc(array, target, s, mid - 1);
        } else {
            return bnSearchRecc(array, target, mid + 1, e);
        }
    }

    static int bnSearch(int[] array, int target) {
        // Put start pointer at 0 index
        // Put end pointer at last index
        // Find the middle index and check if the element at that index is equal to
        // target
        // If yes then return the element at middle index
        // If target is greater than mid index element, put the start pointer at mid + 1
        // If target is lesser than mid index element, put the end pointer at mid -1
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                start = mid + 1;
            } else if (array[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
