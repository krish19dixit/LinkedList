public class mergesortedlist {
    public static void main(String[] args) {
        
    }
    public ListNode sortedList(ListNode head){
        if(head==null || head.next==null){
            return head;

        }
        ListNode mid=middle(head);
        ListNode left=sortedList(head);
        ListNode right=sortedList(mid);
        ListNode result=merger(left,right);
        return result;
    } 
    public ListNode middle(ListNode head){
        if(head==null || head.next==null){
            return null;
        }
        ListNode f=head;
        ListNode s=head;
        while(f!=null || f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    public ListNode merger(ListNode list1, ListNode list2){
        // create a new empty link list
        ListNode dummy=new ListNode();
        ListNode tail=dummy;
        while(list1!=null || list2!=null){
            if(list1.val<list2.val){
                tail.next=list1;
                list1=list1.next;
                tail=tail.next;
            }else{
                tail.next=list2;
                list2=list2.next;
                tail=tail.next;
            }
        }
        if(list1!=null){
            tail.next=list1;
        }else{
            tail.next=list2;
        }
        return dummy.next;

    }
}
