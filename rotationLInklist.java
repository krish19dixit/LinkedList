/**
 * rotationLInklist
 */
public class rotationLInklist {

 public static void main(String[] args) {
    
 }

 public ListNode rotation(ListNode head int k){
    if(k<=0 || head==null || head.next==null){
        return head;
    }
    ListNode temp=head;
    int length=1;
    while(temp.next!=null){
        length++;
        temp=temp.next;
    }
    int rotate=k%length;
    ListNode end=head;
    for(int i=1;i<length-rotate;i++){// reach just behind the roatated node
        end=end.next;
    }
    head=end.next;// assigning head to next of end node
    end.next=null;// disconnecting that node and assign to null
    return head;

 }
}