public class leetcode92repeat {
    public static void main(String[] args) {
        
    }
    public ListNode reverseBetween(ListNode head,  int left int right){
      if(left==right){
        return head;

      }
      // step 1 skip the left linklist
      ListNode pre=null;
      ListNode current=head;
      for(int i=0;i<left-1&& current!=null;i++){
        pre=current;
        current=current.next;

      }
      ListNode last=pre;
      ListNode newEnd=current;
    //   step 2 reverse the link list
    ListNode next=current.next;
    for (int i=0;i<right-left+1 && current!=null;i++){
        current.next=pre;
        pre=current;
        current=next;
        if(next!=null){
            next=next.next;
        }
    }
    // step 3 coneect all dots
    if(last!=null){
        last.next=pre;
    }else{
        pre=head;
    }
    newEnd.next=current;
    return head;

}
