package question;
// step1 find length of cycle
// step2 move slow pointer start from head to  length of cycle times
// step 3 move fast poninter start from head and slow pointer one by one untill they  will meet at start of cycle.

public class leetcode142 {
    public static void main(String[] args) {
        
    }
    public ListNode detectCycle(ListNode head){
        if(head==null){
            return head;

        }

        ListNode f=head;
        ListNode s=head;
        int count=0;
        while(f!=null && s!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                count=legthOfCycle(s);// finding the length of cycle .
                break;
            }
        }
        if(count==0){
            return null;
        }
        // find the start node
        ListNode first=head;
        ListNode second=head;
        // move s ahead of length of cycle time
        while(count>0){
            second=second.next;
            count--;
        }
        // moving first and second one by one they will meet at start of cycle
        while(first!=second){
            first=first.next;
            second=second.next;
        }
        return first;
    }
    public int legthOfCycle(ListNode head){
        ListNode f=head;
        ListNode s=head;
        
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                ListNode temp=s;
                int count=0;
                do{
                    temp=temp.next;
                count++;
            }while(temp!=s);
            return count;
        }
        }
        return 0;

    }
}
