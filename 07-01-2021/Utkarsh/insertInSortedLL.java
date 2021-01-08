package jan_07_2021.Utkarsh;
import sagePack.*;

public class insertInSortedLL {
    public node insert(int a, node head){
        if(head==null){
            head = new node(a);
            return head;
        }
        else if(head.val>=a){
            node temp = new node(a);
            temp.next = head;
            return temp;
        }
        else{
            node ptr = head;
            while (ptr.next!=null && ptr.next.val < a)
                ptr = ptr.next;

            node temp = new node(a);
            temp.next = ptr.next;
            ptr.next = temp;
            return head;
        }
    }
}
class demo{
    public static void main(String[] args) {
        insertInSortedLL obj = new insertInSortedLL();
        singleLinkedList list = new singleLinkedList(new int[]{10,20,30,40,50});
        list.display();
        list.head = obj.insert(55, list.head);
        list.head = obj.insert(45, list.head);
        list.head = obj.insert(5, list.head);
        //System.out.println(list.head);
        list.display();
    }
}
