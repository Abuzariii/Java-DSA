import java.util.ArrayList;

public class FindAllIndex {
    public static void main(String[] args) {
        int[] array = { 4, 1, 2, 3, 4, 4, 5, 6 };
        // ArrayList<Integer> emptyList = new ArrayList<>();

        // ArrayList<Integer> ans = findAll(array, 4, 0, emptyList);
        ArrayList<Integer> ans = findAll2(array, 4, 0);
        System.out.println(ans);
    }

    static ArrayList<Integer> findAll(int[] array, int target, int startIndex, ArrayList<Integer> emptyList) {
        // Base condition, if the index reaches array.length, return the empty list
        // If array[index] is equal to target then add it to empty list
        // Finally return the function for index + 1
        if (startIndex == array.length) {
            return emptyList;
        }

        if (array[startIndex] == target) {
            emptyList.add(startIndex);
        }

        return findAll(array, target, startIndex + 1, emptyList);
    }

    // Method number 2 without taking empty list
    static ArrayList<Integer> findAll2(int[] array, int target, int startIndex) {
        // First create an empty array list inside every function call
        // If array[index] is not equal to target just return the empty arraylist
        // Add the answer from below to each array list
        // Return that list
        ArrayList<Integer> emptyList = new ArrayList<>();

        if (startIndex == array.length) {
            return emptyList;
        }

        if (array[startIndex] == target) {
            emptyList.add(startIndex);
        }

        ArrayList<Integer> ansFromBelowCalls = findAll2(array, target, startIndex + 1);

        emptyList.addAll(ansFromBelowCalls);

        return emptyList;
    }
}
