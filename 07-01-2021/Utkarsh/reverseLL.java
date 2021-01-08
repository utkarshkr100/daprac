package jan_07_2021.Utkarsh;
import sagePack.node;
import sagePack.singleLinkedList;

public class reverseLL {
    public node reverse(node head){
        if(head == null || head.next == null)
            return head;
        node ptr1 = null;
        node ptr2 = head;
        node ptr3 = head.next;
        while(ptr3!=null){
            ptr2.next = ptr1;
            ptr1 = ptr2;
            ptr2 = ptr3;
            ptr3 = ptr3.next;

        }
        ptr2.next = ptr1;
        return ptr2;
    }
}
class demo1{
    public static void main(String[] args) {
        singleLinkedList list = new singleLinkedList(new int[]{10,20,30,40,50});
        reverseLL obj = new reverseLL();
        list.head = obj.reverse(list.head);
        list.display();
    }
}
