// here we have to deal with reverse a link list sub part of left to right portion
// here we are taking two pointer initially pointer to head and null;
// they will start flip and reach to end point
public class reverselist11 {

    public static void main(String[] args) {

    }

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (left == right) {
            return head;
        }
        // collect sub string
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; i < left - 1 && current != null; i++) {
            prev = current;
            current = current.next;
        }// after this we get first closed element to portion where we need to start operation of reversing linklist.

        // marking the elements so that after reversing the element can be linked to reverse link list.
        
        ListNode lastNodeofpreviousSubList=prev;
        ListNode endNode=current;
        // reverse the desired sub set of left and right
        ListNode helper = current.next;
        for (int i = 0; i < right - left + 1 && current != null; i++) {
            current.next=prev;
            prev=current;
            current=helper;
            if(helper!=null){
                helper=helper.next;
            }
        }
        if(lastNodeofpreviousSubList!=null){
            lastNodeofpreviousSubList.next=prev;
        }else{
            head=prev;
        }
        endNode.next=current;
        return head;
    }
}
