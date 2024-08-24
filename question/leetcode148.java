// sort the linklist list
// by using bubble sort in linklist and mergesort in linklist
// step 1 find middle element
// stre 2 find sort list of left and right linklist 
// step 2 merge two strings
public class leetcode148 {
    public static void main(String[] args) {
        
    }
    public ListNode sortList(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=middle(head);// get middle element
        ListNode left=sortList(head);//sort left half of link list
        ListNdoe right=sortList(mid);// sort right half of linklist
        return merge(left,right);// merge both of them

    }
    public ListNode middle(ListNode head){
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!==null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    public ListNode merge(ListNode list1,ListNode list2){
        ListNode dummyHead=new ListNode();
        ListNode tail=dummyHead;
        while(list1!=null && list2!=null){
            if(list1.val< list2.val){
                tail.next=list1;
                list1=list1.next;
                tail=tail.next;
            }else{
                tail.next=list2;
                list2=list2.next;
                tail=tail.next;
            }
        }
        // tail.next= (list1!=null) ? list1:list2;
        if(list1!=null){
            tail.next=list1;
        }else{
            tail.next=list2;
        }
        return dummyHead.next;


    }
}
