import Sagepack.*;
public class InsertInSortedLL {
    static void insert(node head, int n){
        while(head.val < n && head!= null){
            head = head.next;
        }
        node ptr = new node(n);
        ptr.next = head.next;
        head.next = ptr;
    }
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList(new int[]{10,20,30,40,50});
        insert(list.head, 35);
        list.display();
    }
}
