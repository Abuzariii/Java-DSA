public class Pattern {
    public static void main(String[] args) {
        pattern4(9);
    }

    static void pattern4(int n) {
        int half = n / 2;

        // Incrementing part
        for (int row = 1; row <= half; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Decrementing part
        // for (int row = 1; row <= half; row++) {
        // for (int col = 1; col <= half - row + 1; col++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        for (int row = half - 1; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
