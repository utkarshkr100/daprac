package jan_06_2021;

import sagePack.node;
//import sagePack.singleLinkedList;

public class cycleStartNode {
    public static node cycleStartNode(node head){
        node meet = checkCycle.checkCycle(head);
        if(meet == null) {
            System.out.println("No Cycle exist");
            return null;
        }
        //System.out.println(meet.val);
        node s = head;
        while (s!=meet){
            //System.out.println(meet.val);
            s = s.next;
            meet = meet.next;
        }
        return meet;
    }

    public static void main(String[] args) {
        node ptr = new node(1);
        node head = ptr;
        node temp = null;


        ptr.next = new node(2);
        ptr = ptr.next;

        ptr.next = new node(3);
        ptr = ptr.next;

        ptr.next = new node(4);
        ptr = ptr.next;
        temp = ptr;

        ptr.next = new node(5);
        ptr = ptr.next;

        ptr.next = new node(6);
        ptr = ptr.next;

        ptr.next = new node(7);
        ptr = ptr.next;

        ptr.next = new node(8);
        ptr = ptr.next;

        ptr.next = new node(9);
        ptr = ptr.next;

        ptr.next = temp;

        //singleLinkedList list = new singleLinkedList(head);
        //list.display();

        node point = cycleStartNode(head);
        if(point!= null)
            System.out.println(point.val);
        else System.out.println("null h bhai");
    }
}
