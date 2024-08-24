// to check cycle  is present or not by slow and fast pointer where slow pointer will move by one point and fast pointer will move by two pointer.
// when they meet at point then it is cyclic in nature.
// case 2 for finding length of cycle
// when slow and fast pointer meet then  means that cycle is present and mark a new temp pointer to slow and create a count start froom 0 and apply do while loop until they meet again.increase the count by one by every iteration.
package question;

public class leetcode141 {
    public static void main(String[] args) {
        
    }
    public boolean hasCycle(ListNode head){
        ListNode f=head;
        ListNode s=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                return true;
            }
        }
        return false;
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
