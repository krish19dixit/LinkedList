// find middle of linklist by using fast and slow pointer
public class leetcode876 {
    public static void main(String[] args) {
        
    }
    public ListNode middleNOde(ListNode head){
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
}
