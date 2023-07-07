// Leetcode url : https://leetcode.com/problems/valid-palindrome/

public class Palindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";

        System.out.println(palindromeCheck(str));
    }

    static boolean palindromeCheck(String s) {

        // str = str.toLowerCase();
        // str = str.replaceAll("[^a-zA-Z0-9]", "");

        // for (int i = 0; i <= str.length() / 2; i++) {
        // char start = str.charAt(i);
        // char end = str.charAt(str.length() - 1 - i);

        // if (start != end) {
        // return false;
        // }
        // }
        // return true;
        if (s.isEmpty()) {
            return true;
        }

        String str = s.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", "");

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            char start = str.charAt(left);
            char end = str.charAt(right);

            if (start != end) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
