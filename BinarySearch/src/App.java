public class App {
    public static void main(String[] args) throws Exception {
        // (a+b)/2 = a+(b-a)/2 = (a/2)+(b/2), use the later two formulas to avoid going
        // out of the int range as directly adding a and b might push your value outside
        // int range, preferably use the second formula as it is the standard, 3rd one
        // causes problems
        int a = 10;
        int b = 20;

        System.out.println((a + b) / 2);
        System.out.println(a + (b - a) / 2);
        System.out.println((a / 2) + (b / 2));
    }
}
