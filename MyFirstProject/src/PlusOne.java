// Leetcode problem url : https://leetcode.com/problems/plus-one/

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = { 1, 2, 3, 4, 5, 7, 12, 14, 9 };
        // int[] digits = { 9, 32 };

        boolean allEqual = true;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 9) {
                allEqual = false;
                break;
            }
        }
        if (allEqual) {
            int[] newArray = new int[digits.length + 1];
            newArray[0] = 1;
            for (int j = 1; j < newArray.length; j++) {
                newArray[j] = 0;
                digits = newArray;
            }
        } else if (!allEqual) {
            for (int i = digits.length - 1; i >= 0; i--) {

                if (digits[i] != 9) {
                    digits[i]++;
                    break;
                }
                if (digits[i] == 9) {
                    digits[i] = 0;
                    // break;
                }
            }
        }
        System.out.println(Arrays.toString(digits));
    }
}
