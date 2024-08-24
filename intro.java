// import java.util.LinkedList;

public class intro {
    public static void main(String[] args) {

        // single link list
        // it is just one side love but present node dont know about previous last node
        // LinkedList<Integer>list=new LinkedList<>();// its is given by jdk for us.
        // but i will make for my self new.

        /*
         * singlell list= new singlell();
         * // CASE 1:insertation at first index
         * list.insertfirst(22);
         * list.insertfirst(34);
         * list.insertfirst(62);
         * list.insertfirst(80);
         * // list.display();
         * // CASE 2: insertain at last index
         * list.insertlast(11);
         * list.insertlast(13);
         * list.insertlast(16);
         * list.insertlast(199);
         * list.insertlast(100);
         * // list.display();
         * // CASE 3: insertaion at particular index
         * list.insertpart(1000, 4);
         * list.display();
         * list.deletefirst();
         * list.display();
         * list.deletelast();
         * list.display();
         * list.deletepart(3);
         * list.display();
         * 
         * 
         */

        // doullyy linked list
        // doublyyLL ls = new doublyyLL();
    //    ls.insertFirst(22);
    //    ls.insertFirst(21);
    //    ls.insertFirst(24);
    //    ls.insertFirst(28);
    //    ls.display();
    //    ls.insertLast(334);
    //    ls.insertLast(754);
    //    ls.display();

    // circularll ll=new circularll();
    //     ll.insert(23);
    //     ll.insert(13);
    //     ll.insert(53);
    //     ll.insert(53);
    // ll.display();

    singlell ll=new singlell();
    ll.insertlast(2);
    ll.insertlast(2);
    ll.insertlast(3);
    ll.insertlast(5);
    ll.insertlast(5);
    ll.insertlast(9);
    ll.display();
    ll.dublicate();
    ll.display();
    }
}