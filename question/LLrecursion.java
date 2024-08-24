public class LLrecursion {
    public static void main(String[] args) {

    }

    public void insertRec(int index, int value) {
        head = insertRec(value, index, head);
    }

    private Node insertRec(int val, int index, Node current) {
        if (index == 0) {
            Node temp = new Node(val, current);
            size++;
            return temp;
        }
        current.next = insertRec(val, index--, current.next);
        return current;
    }
}
