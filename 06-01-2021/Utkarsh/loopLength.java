package jan_06_2021;

import sagePack.node;

public class loopLength {
    static int loopLength(node head){
        head = cycleStartNode.cycleStartNode(head);
        if(head== null)
            return 0;
        int count = 0;
        node ptr = head;
        while(ptr!=null){
            ptr = ptr.next;
            count++;
            if(ptr==head)
                return count+1;
        }
        return 0;
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
        System.out.println(loopLength(head));
    }
}
