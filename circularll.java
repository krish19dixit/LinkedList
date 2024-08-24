public class circularll {
    private Node head;
    private Node tail;

    public circularll() {
        this.head = null;
        this.tail = null;
    }

    // insertaion 
    public void insert(int value) {
        if (head == null) {
            // insertfirst(value);
            Node node = new Node(value);
            head = node;
            tail = node;

            return;
        }
        Node node = new Node(value);
        tail.next = node;
        node.next = head;
        tail = node;

    }
    // iteration
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    //delete at particular index
    public void delete(int value){
        Node temp=head;
        
    }


    }

    // display
    public void display() {
        Node temp = head;
        if (temp != null) {
            do {
                System.out.print(temp.value + " ->");
                temp = temp.next;
            } while (temp != head);
            System.out.println("END");
        }
    }

    // public void insertfirst(int value) {

    // }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
