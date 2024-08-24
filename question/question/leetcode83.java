package question;

// remove duplicate and return in sorted order
public class leetcode83 {
    
public static void main(String[] args) {
    

}
public ListNode deleteDuplicate(ListNode node){
    if(node==null){
        return node;
    }
    ListNode temp=node;
    while(temp.next!=null){
        if(temp.value==temp.next.value){// if values are equal then skipp it 
            temp.next=temp.next.next;
        }else{
            temp=temp.next;
        }

    }
    return head;   
}

}
