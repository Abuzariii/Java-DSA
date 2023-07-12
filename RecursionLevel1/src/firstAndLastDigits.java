public class firstAndLastDigits {
    public static void main(String[] args) {
        int number = 3456;
        System.out.println("Original number : " + number);
        int length = String.valueOf(number).length();
        int firstDigit = number / (int) Math.pow(10, length - 1);
        System.out.println(firstDigit);

        int remainingDigitsAfterRemovingFirst = number % (int) Math.pow(10, length - 1);
        System.out.println(remainingDigitsAfterRemovingFirst);

        int lastDigit = number % 10;
        System.out.println(lastDigit);

        int remainingDigitsAfterRemovingLast = number / 10;
        System.out.println(remainingDigitsAfterRemovingLast);
    }
}
