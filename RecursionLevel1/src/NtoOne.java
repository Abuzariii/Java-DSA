public class NtoOne {
    public static void main(String[] args) {
        int n = 5;

        // nTo1(n);
        // oneToN(n);
        both(n);
    }

    static void both(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        both(n - 1);
        System.out.println(n);
    }

    static void nTo1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        nTo1(n - 1);
    }

    static void oneToN(int n) {
        if (n == 0) {
            return;
        }

        oneToN(n - 1);
        System.out.println(n);
    }
}
