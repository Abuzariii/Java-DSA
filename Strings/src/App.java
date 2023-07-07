public class App {
    public static void main(String[] args) throws Exception {
        String a = "Abuzar";
        String b = "Abuzar";

        String name1 = new String("Abuzar");
        String name2 = new String("Abuzar");
        System.out.println(name1 == name2);
        System.out.println(a == b);
    }
}
