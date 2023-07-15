public class SearchInArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        int target = 1;
        System.out.println(search(array, target, 0));
    }

    static boolean search(int[] array, int target, int index) {
        // Search first index and check if its equal to target
        if (index == array.length) {
            return false;
        }

        return array[index] == target || search(array, target, index + 1);
    }
}
