// 1->2->3->4->5
// rotate1= 5->1->2->3->4 rotate ontime right
// rotate2= 4->5->1->2->3 rotate one more time right
public class leetcode61 {
    public static void main(String[] args) {

    }

    public ListNode rotateRight(ListNode head, int k) {
        if (K < 0 || head == null || head.next == null) {
            return head;
        }
        ListNode last = head;
        int length=1;
        // calculating length;
        while (last.next!=null) {
            last=last.next;
            length++;
        }
        
        last.next=head;
        int roataion=k%length;// how many times roataion really needed
        int skip=length-k;// skipt those elements
        ListNode newLast=head;
        for(int i=0;i<skip-1;i++){
            newLast=newLast.next;
        }
        head=newLast.next;
        newLast.next=null;
        return head;
}
