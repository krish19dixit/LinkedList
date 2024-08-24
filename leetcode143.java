// 1->2->3->4->5->6->7===1->7->2->6->3->5->4
//  step 1 get the middle element 
// step 2 reverese it 
//  step 3 merge it new  linklist head of both first and then second head then move one by one both head;
public class leetcode143 {
    
    public static void main(String[] args) {
        
    }
    public void reorder(ListNode head){
        ListNode middle=getMid(head);
        ListNode headsecond=reverse(middle);
        ListNode headfirst=head;
        // ListNode result=merge(head,secondhead);
        while(headfirst!=null && headsecond!=null){
            ListNode temp=headfirst.next;
            headfirst.next=headsecond;
            headfirst=temp;
            temp=headsecond.next;
            headsecond.next=headfirst;
            headsecond=temp;
        }
        if(headfirst!=null){
            headfirst.next =null;
        }

    }
    public ListNode getMid(ListNode node){
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    public ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode current=head;
        ListNode next=current.next;
        while(current!=null){
            current.next=pre;
            pre=current;
            current=next;
            if(next!=null){
                next=next.next;
            }
        }
        return head;
    }
   

}
