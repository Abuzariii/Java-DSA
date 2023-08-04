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

    public Node(int value, Node next) {
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

    public void insertAt(int index, int value) {
        // Create a new node with given value
        // Get the node at given index and index - 1
        // Point the next of index-1 to new node and next of new node to index
        // Edge case is if the index is smaller than size
        if (index < size) {
            Node node = new Node(value);
            Node indexNode = get(index);
            Node prevNode = get(index - 1);
            prevNode.next = node;
            node.next = indexNode;
            size++;
        } else {
            System.out.println("Index exceeds the size");
        }
    }

    // Insert recursion, my own implementation
    public void insertRec(int index, int value, Node current, int count, Node prev) {
        // End of the list case
        if (current == null) {
            if (index == count) {
                Node node = new Node(value);
                prev.next = node;
                node.next = null;
                size++;
            }
            return;
        }
        // Start of the list case
        if (index == 0) {
            Node node = new Node(value);
            node.next = current;
            size++;
            if (prev == null) {
                head = node;
            } else {
                prev.next = node;
            }
            return;
        }
        // Between the list case
        if (index == count) {
            Node node = new Node(value);
            prev.next = node;
            node.next = current;
            size++;
            return;
        }
        count++;
        insertRec(index, value, current.next, count, current);
    }

    // Insert using recursion, Kunal Kushwaha
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index - 1, node.next);
        return node;
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

    public void displayRec(Node node) {
        if (node == null) {
            System.out.println("NULL");
            return;
        }
        System.out.print(node.value + " --> ");
        displayRec(node.next);
    }

    // in place reversal of linked list
    // google, microsoft, apple, amazon:
    // https://leetcode.com/problems/reverse-linked-list/
    public void reverse() {
        if (size < 2) {
            return;
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev;
    }

    // Point the node in the arguement to the head of the list
    public void reverseRec(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        // Go to the end of the list
        // At the end you will be at the tail, point next poitner of tail to current
        // node
        // Now move tail pointer to the node and the next of the tail to null
        reverseRec(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // Leetcode url :
    // https://leetcode.com/problems/remove-duplicates-from-sorted-list/
    public void removeDuplicatesSortedLL() {
        // At every particular node, point the next of the node to the first node which
        // is not equal to the curent node
        Node current = head;
        while (current != null && current.next != null) {
            if (current.value == current.next.value) {
                current.next = current.next.next;
                size--;
            } else {
                current = current.next;
            }
        }
    }

    public LinkedList mergeTwoSortedLists(LinkedList list1, LinkedList list2) {
        Node a = list1.head;
        Node b = list2.head;

        LinkedList ans = new LinkedList();
        while (a != null && b != null) {
            if (a.value < b.value) {
                ans.addLast(b.value);
            } else {
                ans.addLast(a.value);
            }
        }

        while (a != null) {
            ans.addLast(a.value);
            a = a.next;
        }
        while (b != null) {
            ans.addLast(b.value);
            b = b.next;
        }
        return ans;
    }

    public void findMiddle() {
        Node slow = head;
        Node fast = head;
        int index = 0;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            index++;
        }
        System.out.println("Middle Index : " + index);
    }
}