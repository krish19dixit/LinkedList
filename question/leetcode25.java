//  leetcode problem 25 reverese every k number of items in linklist
public class leetcode25 {
    public static void main(String[] args) {

    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (K <= 1 || head == null) {
            return head;
        }
        // collect sub string
        ListNode current = head;
        ListNode prev = null;
        while (true) {
            ListNode lastNodeofpreviousSubList = prev;
            ListNode endNode = current;
            // reverse the desired sub set of left and right
            ListNode helper = current.next;
            for (int i = 0; i < k && current != null; i++) {
                current.next = prev;
                prev = current;
                current = helper;
                if (helper != null) {
                    helper = helper.next;
                }
            }
            if (lastNodeofpreviousSubList != null) {
                lastNodeofpreviousSubList.next = prev;
            } else {
                head = prev;
            }
            endNode.next = current;
            if (current == null) {
                break;
            }
            prev = endNode;
        }
        return head;
    }
}
