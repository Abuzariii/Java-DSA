public class Ceiling {
    public static void main(String[] args) {
        int[] array = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };
        int target = 13;
        int index = findCeiling(array, target);
        System.out.println(index + " index, number " + array[index] + " for target " + target);
    }

    static int findCeiling(int[] array, int target) {
        if (target > array[array.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (target > array[mid]) {
                start = mid + 1;
            } else if (target < array[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
