public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }
    // public void insert(int val, int index) {
    // if (index == 0) {
    // insertFirst(val);
    // return;
    // }
    // if (index == size) {
    // insertLast(val);
    // return;
    // }

    // Node temp = head;
    // for (int i = 1; i < index; i++) {
    // temp = temp.next;
    // }

    // Node node = new Node(val, temp.next);
    // temp.next = node;

    // size++;
    // }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        // public Node(int value, Node next) {
        // this.value = value;
        // this.next = next;
        // }
    }

    public static void main(String[] args) {
        LL first = new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);
        first.insertFirst(13);
        // first.insert(5, 3);

        first.display();
    }
}
