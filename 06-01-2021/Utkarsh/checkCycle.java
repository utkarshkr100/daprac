package jan_06_2021;

import sagePack.node;
import sagePack.singleLinkedList;


public class checkCycle {
    public static node checkCycle(node head){
        if(head == null || head.next == null)
            return null;
        node f = head.next.next;
        node s = head.next;
        while(f!=null && f.next!=null){
            if(f==s)
                return f;
            f=f.next.next;
            s=s.next;
        }
        return null;
    }

    public static void main(String[] args) {
        node ptr = new node(11);
        node head = ptr;
        node temp = null;


        ptr.next = new node(22);
        ptr = ptr.next;

        ptr.next = new node(33);
        ptr = ptr.next;

        ptr.next = new node(44);
        ptr = ptr.next;
        temp = ptr;

        ptr.next = new node(55);
        ptr = ptr.next;

        ptr.next = new node(66);
        ptr = ptr.next;

        ptr.next = new node(77);
        ptr = ptr.next;

        ptr.next = new node(88);
        ptr = ptr.next;

        ptr.next = new node(99);
        ptr = ptr.next;

        ptr.next = temp;

        singleLinkedList list = new singleLinkedList();
        list.head = head;
        //list.display();

        node check = checkCycle(list.head);
        if(check == null)
            System.out.println("No Cycle exist");
        else {
            System.out.println("value = "+check.val);
            System.out.println("Cycle exist");
        }
    }
}
