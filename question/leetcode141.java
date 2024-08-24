package question;

public class leetcode141 {
  
    public static void main(String[] args) {
        // here we are using slow and fast pointer method.it is used to check the cyclic present or not.
        // slow pointer with run one by one and fast pointter will run 2 by two.

    }
    //case first to check the cycle is present or not
   /*  public boolean hasCycle(ListNode head) {
        Listnode fast=head;
        Listnode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;

    }
    */
    //case 2  checkingn the length of cycle
    public int lengthhasCycle(ListNode head) {
        Listnode fast=head;
        Listnode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                ListNode temp=slow;
                int count=0;
                do{
                    temp=temp.next;
                    count++;
                }while(temp!=slow);
                
                 return count;
            }
        }
        return 0;

    }
    public ListNode detectCycle(ListNode head) {
        int len=0;
         ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                len=lengthhasCycle(slow);
                break;
            }
        }
        if(len==0){
            return null;

        }
        ListNode f=head;
        ListNode s=head;
        while(len>0){
            s=s.next;
            len--;
        }

        while(f!=s){
            f=f.next;
            s=s.next;
        }


    }

    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
            slow=findsquare(slow);
            fast=findsquare(findsquare(fast));

        }while(fast!=slow);
        if(slow==1){
            return true;
        }
        return false;

    }
    public int findsquare(int number){
        int ans=0;
        while(number>0){
            int rem=number%10;
            ans+=rem*rem;
            number/=10;
        }
        return ans;
    }

}



