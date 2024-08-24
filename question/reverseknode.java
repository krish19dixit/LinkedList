public class reverseknode {
    public static void main(String[] args) {
        
    }
    // step 1 calculate the length of linked list
    public int lengthOfList(ListNode head){
        ListNode temp=head;
        int length=0;
        while(temp!=null)[
            length++;
            temp=temp.next;
        ]
        return length;
    }
    // step 2; reverse the first k group nodes in linklist
    public ListNode reverseKGroupNode(ListNode head, int k, int length){
        if(length<k){
            return head;
        }
        ListNode pre=null;
        ListNode curr=head;
        ListNode nextOne=curr.next;
        int count =0;
        while(curr!=null && count<k){
            count++;
            pre=curr.next;
            pre=curr;
            curr=nextOne;
            if(nextOne.next!=null){
                nextOne=nextOne.next;
            }
        }
        // step 3 apply recursion and  connect it with next reversed linklist
        head.next=reverseKGroupNode(nextOne, k, length-k);
        return pre;
    }
    
    

}
