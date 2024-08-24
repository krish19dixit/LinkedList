class question{
    public static void main(String[] args) {
        
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        // NodeList first=list1.head;
        // NodeList second=list2.head;

        // ListNode merg=new ListNode();
        // while(list1!=null && list2!=null){
        //     if(first.val<second.val){
        //         merg.insertlast(first.val);
        //         first=first.next;
        //     }else{
        //         merg.insertlast(second.val);
        //         second=second.next;
        //     }
        // }
        // while(first!=null){
        //     merg.insertlast(f.value);
        //     first=first.next;
        // }
        // while(second!=null){
        //     merg.insertlast(second.value);
        //     second=second.next;
        // }
        // return merg;
        ListNode dummyhead=new ListNode();
        ListNode tail=dummyhead;
        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                tail.next=list1;//insert list1 in new demmy head
                list1=list1.next;
                tail=tail.next;
            }else{
                tail.next=list2;
                list2=list2.next;
                tail=tail.next;
            }
        }
        tail.next=(list1!=null)? list1: list2;
        return dummyhead.next;
    }
}