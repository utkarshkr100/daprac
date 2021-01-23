package jan_09_2021;

import sagePack.node;
import sagePack.singleLinkedList;

public class evenOddLL {
    static boolean isEven(node head){
        node ptr = head;
        if(head == null)
            return true;
        while(true){
            if(ptr.next==null)
                return false;
            else if(ptr.next.next==null)
                return true;
            else
                ptr = ptr.next.next;
        }
    }
    public static void main(String[] args) {
        singleLinkedList list = new singleLinkedList(new int[]{10,20,30,40});
        if(isEven(list.head))
            System.out.println("list is even");
        else 
            System.out.println("list is odd");

    }
}
