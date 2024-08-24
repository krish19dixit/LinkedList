public class bubblesort {

    public class Node{
        int value;
        Node node;
    }
    public Node(int value, Node node){
        this.value=value;
        this.node=node;
    }
    public Node(int value){
        this.value=value;
    }
    public static void main(String[] args) {

    }

    // after evey iteration largest item comes in end
    public void bubblesort() {
        bubblesort(size - 1, 0);// here col represent the current node.
    }

    private void bubblesort(int row , int col){
        if(row==0){
            return ;
        }
        if(col < row){
            Node first=get(col);
            Node second=get(col+1);
            if(first.value > second.value){
                // swap 
                if(first==head){
                head=second;
                first.next=second.next;
                second.next=first;
                
            }else if(second == tail){
                Node prev=get(col-1);
                prev.next=second;
                tail=first;
                first.next=null;
                second.next=tail;
            }else{
                Node prev=get(col-1);
                prev.next=second;
                first.next=second.next;
                second.next=first;
            }
        }
        }
        bubblesort(row,col+1);
    }else

    {
        bubblesort(row - 1, 0);
    }
}

    public ListNode get(int index) {
        if (head == null && head.next == null) {
            return head;
        }
        ListNode temp=head;
        while(index>0){
            temp=temp.next;
            index--;
        }
        return temp;
    }

}
