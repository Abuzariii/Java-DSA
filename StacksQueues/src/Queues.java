import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // queue.offer(1);
        // queue.offer(2);
        // queue.offer(3);
        queue.add(5);
        queue.add(6);
        queue.add(7);

        // System.out.println(queue.poll());
        System.out.println(queue.remove());
    }
}
