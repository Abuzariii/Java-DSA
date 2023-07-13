public class Factorial {
    public static void main(String[] args) {
        int number = 4;
        // System.out.print(factorial(number));
        System.out.print(sumNto1(number));
    }

    static int factorial(int number) {

        // Base condition
        if (number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }

    static int sumNto1(int number) {

        // Base condition
        if (number == 1) {
            return 1;
        }

        return number + sumNto1(number - 1);
    }
}
