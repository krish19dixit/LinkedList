public class leetcode234 {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {

        ListNode middle = getmid(head);
        ListNode secondHead = reverse(middle);
        ListNode rereverse = secondHead;
        // compare both the halfs
        while (head != null && secondHead != null) {
            if (head.val != secondHead.val) {
                break;
            } else {
                head = head.next;
                secondHead = secondHead.next;
            }
        }

        reverse(rereverse); 
        
        if(head==null && secondHead==null){// we reach at end of list by coparing first head with second head 
            // if elements are palindrome
            return true;
        }
        return false;
    }

    public ListNode reverse(ListNode list) {
        if (list == null) {
            return head;
        }
        ListNode pre = null;
        ListNode current = head;
        ListNode next = current.next;
        while (current != null) {
            current.next = pre;
            pre = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = pre;
        return head;

    }

    public ListNode getMid(ListNode List1) {
        ListNode s = head;
        ListNode f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
}
