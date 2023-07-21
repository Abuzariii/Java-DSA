// Leetcode url : https://leetcode.com/problems/letter-combinations-of-a-phone-number/

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        String up = "23"; // Example input
        ArrayList<String> combinations = padRet("", up);
        System.out.println(combinations);
    }

    static ArrayList<String> padRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char digitChar = up.charAt(0);
        int digit = digitChar - '0'; // Convert the first character to an integer

        ArrayList<String> list = new ArrayList<>();

        // Define the character set for each digit starting from 2
        char[] charSet = getCharSet(digit);

        for (char ch : charSet) {
            list.addAll(padRet(p + ch, up.substring(1)));
        }
        return list;
    }

    // Helper method to define the character set for each digit
    static char[] getCharSet(int digit) {
        switch (digit) {
            case 2:
                return new char[] { 'a', 'b', 'c' };
            case 3:
                return new char[] { 'd', 'e', 'f' };
            case 4:
                return new char[] { 'g', 'h', 'i' };
            case 5:
                return new char[] { 'j', 'k', 'l' };
            case 6:
                return new char[] { 'm', 'n', 'o' };
            case 7:
                return new char[] { 'p', 'q', 'r', 's' };
            case 8:
                return new char[] { 't', 'u', 'v' };
            case 9:
                return new char[] { 'w', 'x', 'y', 'z' };
            default:
                return new char[] {};
        }
    }
}