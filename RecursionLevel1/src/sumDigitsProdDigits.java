public class sumDigitsProdDigits {
    public static void main(String[] args) {
        int n = 3202;
        System.out.println(prodDigits(n));
    }

    static int prodDigits(int n) {
        if (n < 10) {
            return n;
        }

        return (n % 10) * prodDigits(n / 10);
    }

    static int sumDigits(int n) {
        if (n < 10) {
            return n;
        }

        return (n % 10) + sumDigits(n / 10);
    }
}
