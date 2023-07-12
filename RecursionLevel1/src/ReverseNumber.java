public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12023;
        int reversedNumber = getReverseNumber(number);
        System.out.println("Reversed number: " + reversedNumber);
    }

    public static int getReverseNumber(int number) {
        if (number < 10) {
            return number;
        }
        int lastDigit = number % 10;
        int remainingDigits = number / 10;
        int reversedNumber = getReverseNumber(remainingDigits);
        int orderOfMagnitude = (int) Math.pow(10, String.valueOf(remainingDigits).length());
        return lastDigit * orderOfMagnitude + reversedNumber;
    }

    // private static int reverseNumberRecursive(int number, int reversedNumber) {
    // if (number == 0) {
    // return reversedNumber;
    // }
    // reversedNumber = reversedNumber * 10 + number % 10;
    // return reverseNumberRecursive(number / 10, reversedNumber);
    // }

}
