public class firstAndLastDigits {
    public static void main(String[] args) {
        int number = 3456;
        System.out.println("Original number : " + number);
        int length = String.valueOf(number).length();

        // Divide a 2 digit number by 10, int of that is the first digit of that number
        int firstDigit = number / (int) Math.pow(10, length - 1);
        System.out.println(firstDigit);

        // Modulo of a 2 digit number by 10 ----------- 12%10 = 2 ----- 1 removed
        int remainingDigitsAfterRemovingFirst = number % (int) Math.pow(10, length - 1);
        System.out.println(remainingDigitsAfterRemovingFirst);

        // Module with 10 of any number is last digit
        int lastDigit = number % 10;
        System.out.println(lastDigit);

        // Divide any number by 10, int of that is the number after removing the last
        // digit
        int remainingDigitsAfterRemovingLast = number / 10;
        System.out.println(remainingDigitsAfterRemovingLast);
    }
}
