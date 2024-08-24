public class reverseinbetween {
    public static void main(String[] args) {
        
    }
    public ListNode reverseInBetween(ListNode head, int left , int right){
        //  step1 collect left sublist and mark them
        ListNode pre=null;
        ListNode current=head;
        for(int i=0;i<left;i++){
            pre=current;
            current=current.next;
        }
        ListNode newEnd=current;
        ListNode preOfnewEnd=pre;
        // now reverse the link list
        ListNode helper=current.next;
        for(int i=0;i<right-left+1;i++){
            current.next=pre;
            pre=current;
            current=helper;
            if(helper!=null){
                helper=helper.next;
            }
        }
        // now connect the sublist to reverse list
        if(preOfnewEnd!=null){
            preOfnewEnd.next=pre;
        }else{
            preOfnewEnd=head;
        }
        newEnd.next=current;
        return head;
    }
}
