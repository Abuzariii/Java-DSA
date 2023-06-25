// Leetcode problem url https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class FindEvenNums {
    public static void main(String[] args) {
        int[] arr = { 1112, 2, 3, 4, 5, 13, 234, 123564, 9834 };

        int count = 0;
        for (int i : arr) {
            String j = String.valueOf(i);
            if (j.length() % 2 == 0) {
                count++;
            }
        }
        System.out.println("Number of numbers with even values are " + count);
    }
}
