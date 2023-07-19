import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Abuzar");
        list.add("A");
        list.addAll(0, list2);

        System.out.println(list);

        // String s = "abuzar";

        // System.out.println(s.charAt(s.length() - 1));
    }
}
