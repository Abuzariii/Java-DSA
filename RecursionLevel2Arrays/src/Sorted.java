public class Sorted {
    public static void main(String[] args) throws Exception {
        int[] array = { 1, 2, 3, 4, 5, 3 };
        System.out.println(isSorted(array, 0));
    }

    static boolean isSorted(int[] array, int index) {
        // Check the first index if its lesser than index + 1
        // If true return and move on to next index
        // If last index then return true
        if (index == array.length - 1) {
            return true;
        }

        return (array[index] < array[index + 1]) && isSorted(array, index + 1);
    }
}
