public class singlell {

    private Node head;
    private Node tail;// benefit of this is to insertation or deletion in constant time
    private int size;

    public singlell() {
        this.size = 0;// this single link list size is zero.
    }

    // insertation at first index
    public void insertfirst(int val) {
        Node node = new Node(val);// create node
        node.next = head;// node next =head
        head = node;// head at first
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // insert at last
    public void insertlast(int val) {
        if (tail == null) {// if linkedlist is empty
            insertfirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // insert using recursion
    public void insertrec(int value, int index) {
        head = insertrec(value, index, head);
    }

    private Node insertrec(int value, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(value, node);
            size++;
            return temp;
        }
        node.next = insertrec(value, index - 1, node.next);
        return node;
    }

    // insert at particular index
    public void insertpart(int val, int index) {
        if (index == 0) {
            insertfirst(val);
            return;
        }
        if (index == size) {
            insertlast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    // iteration
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // find the node
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // DELETATION OF ITEMS
    // deletation from start
    public int deletefirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    // deletation from end
    public int deletelast() {
        if (size <= 1) {
            return deletefirst();
        }
        Node secondlast = get(size - 2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        size--;
        return val;
    }
//  leetcode 83
    public void dublicate() {
        Node node = head;
        while (node.next!= null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null; 
    }
    // leetcode 21
    public static singlell merge(singlell first,singlell second){

        Node f=first.head;
        Node s=second.head;
        singlell ans=new singlell();
        while(f!=null &&  s!=null){
            if(f.value< s.value){
                ans.insertlast(f.value);
                f=f.next;
            }
            else {
                ans.insertlast(s.value);
                s=s.next;
            }

        } 
        while(f!=null){
            ans.insertlast((f.value));
            f=f.next;
        }  
        while(s!=null){
            ans.insertlast(s.value);
            s=s.next;
        }
        return ans;
    }

    // deletation form particular position
    public int deletepart(int index) {
        if (index == 0) {
            return deletefirst();
        }
        if (index == size - 1) {
            return deletelast();
        }
        Node pre = get(index - 1);
        int val = pre.next.value;
        pre.next = pre.next.next;
        size--;
        return val;
    }

    // Displaying the items
    public void display() {
        Node temp = head;// reassigning head to temp so head will not change
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");

    }

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
