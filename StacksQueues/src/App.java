import java.util.ArrayDeque;
import java.util.Deque;

public class App {
    public static void main(String[] args) throws Exception {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.add(5);
        stack.add(6);
        stack.add(7);
        stack.add(8);
        stack.add(9);

        System.out.println(stack.peek());
    }
}
