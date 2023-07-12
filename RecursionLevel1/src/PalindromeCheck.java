public class PalindromeCheck {
    public static void main(String[] args) {
        int number = 1;
        System.out.println("Number: " + number);
        System.out.println("Is Palindrome: " + isPalindrome(number));
    }

    public static boolean isPalindrome(int number) {
        int length = String.valueOf(number).length();
        return checkPalindrome(number, length);
    }

    private static boolean checkPalindrome(int number, int length) {
        if (length <= 1) {
            return true;
        }
        int firstDigit = number / (int) Math.pow(10, length - 1);
        int lastDigit = number % 10;

        if (firstDigit != lastDigit) {
            return false;
        }
        // number % (int) Math.pow(10, length - 1) this part removes the left digit
        int remainingNumber = (number % (int) Math.pow(10, length - 1)) / 10;
        return checkPalindrome(remainingNumber, length - 2);
    }
}
