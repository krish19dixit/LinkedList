//  reversal in linklist
// 5->4->-3->2->1 to 1->2->3->4->5
import org.w3c.dom.Node;

public class reverslinklist {

    public static void main(String[] args) {

    }

    // reverse a linklist using recuresion
    private void reverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);// first reach to the actual tail and mark it as head.
        // after every recursive call do these theree things.
        // connect next assigning new  node to tail and mark it as new tail and new tail .next is null;

        tail.next = node;// 
        tail = node;// marking it as new tail
        tail.next = null;// next of tail is null
    }

    // second method for reverse link list;
   // using three pointer 
   private ListNode reverseLL(ListNode head){
    if(size<2){
        return;
    }
    ListNode pre=null;
    ListNode present=head;
    ListNode next=present.next;
    while(present!=null){
        present.next=pre;
        pre=present;
        present=next;
        if(next!=null){
            next=next.next;
        }
    }
    head=pre;
    return head;
   }
}
