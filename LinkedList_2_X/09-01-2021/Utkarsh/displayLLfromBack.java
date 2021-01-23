package jan_09_2021;

import sagePack.node;
import sagePack.singleLinkedList;

public class displayLLfromBack {
    static void displayFromBack(node head){
        if(head == null)
            return;
        else{
            displayFromBack(head.next);
            System.out.print(head.val+" <- ");
        }
    }
    public static void main(String[] args) {
        singleLinkedList list = new singleLinkedList(new int[]{10});
        displayFromBack(list.head);
        System.out.print("Null");
    }
}
