public class doublyyLL {
    private Node head;
    // private Node tail;
    // private Node size;
// 
    // public doublyyLL() {
    // this.size = 0;

    // insertaion at first
    public void insertFirst(int value) {
        Node node = new Node(value);

        node.next = head;
        node.pre = null;
        if (head != null) {
            head.pre = node;
        }
        head = node;
        // size++;
    }

    // insert at last
    public void insertLast(int value) {
        Node node = new Node(value);
        Node temp = head;
        node.next = null;
        if (head == null) {
            node.pre = null;
            head = node;
            return;
        }

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.pre = temp;
    }
  

    // insert at particular index
    public void insertpart(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        // if (index == size) {
        // insertLast(val);
        // return;
        // }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        node.pre = temp;
        if (node.next != null) {
            node.next.pre = node;
        }

    }

    // display
    public void display() {
        Node node = head;
        Node last = null;
        System.out.println("PRINT IN FORWARD");
        while (node != null) {
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");
        System.out.println("PRINT IN REVERSE");
        while (last != null) {
            System.out.print(last.value + " <-");
            last = last.pre;
        }
        System.out.println("START");
    }

    private class Node {
        private int value;
        private Node next;
        private Node pre;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node pre) {
            this.value = value;
            this.next = next;
            this.pre = pre;
        }
    }
}
