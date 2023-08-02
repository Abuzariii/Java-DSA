public class LinkedListPractise {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        // list.addFirst(5);
        // list.addFirst(10);

        list.addLast(5);
        list.addLast(10);
        list.addLast(15);
        list.addLast(20);
        list.addLast(25);

        list.display();

        list.addAfter(22, 4);
        list.display();

        // list.replace(23, 5);
        // list.display();
    }
}

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;
    int size;

    public LinkedList() {
        this.size = 0;
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void addLast(int value) {
        if (tail == null) {
            addFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
        size--;
    }

    public Node get(int index) {
        if (index > size) {
            return head;
        }
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void deleteLast() {
        if (size <= 1) {
            deleteFirst();
        }

        Node secLast = get(size - 2);
        tail = secLast;
        tail.next = null;
        size--;
    }

    public void delete(int index) {
        if (index < size) {
            Node prev = get(index - 1);
            Node frwrd = get(index + 1);
            prev.next = frwrd;
            size--;
        } else {
            System.out.println("Index exceeds the size");
        }

    }

    public Node findNode(int value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                return current;
            }
            current = current.next;
        }
        return current;
    }

    public void addAfter(int value, int index) {
        // Create new node with given value
        // Find the element at given index
        // Point new node's next to the next of that element
        // Point that element's next to the new Node
        if (index < size) {
            Node node = new Node(value);
            Node current = get(index);
            node.next = current.next;
            current.next = node;
            size++;
        } else {
            System.out.println("Index exceeds the size");
        }

    }

    public void replace(int value, int index) {
        // Create new node with given value
        // Find the element at given index - 1
        // Find the element at given index + 1
        // Point the next of prev element to the new node
        // Point the next of new node to the frwrd
        if (index < size) {
            Node node = new Node(value);
            Node prev = get(index - 1);
            Node frwd = get(index + 1);
            prev.next = node;
            node.next = frwd;
        } else {
            System.out.println("Index exceeds the size");
        }

    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " --> ");
            current = current.next;
        }
        System.out.print("NULL");
        System.out.println();
        System.out.println("Size : " + size);
    }
}