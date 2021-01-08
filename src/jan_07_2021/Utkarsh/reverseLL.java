package jan_07_2021.Utkarsh;
import sagePack.node;
import sagePack.singleLinkedList;

public class reverseLL {
    public node reverse(node head){
        if(head == null || head.next == null)
            return head;
        node ptr = null;
        node ptr1 = head;
        node ptr2 = head.next;
        while(ptr2!=null){
            ptr1.next = ptr;
            ptr = ptr1;
            ptr1 = ptr2;
            ptr2 = ptr2.next;

        }
        ptr1.next = ptr;
        return ptr1;
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
