package jan_09_2021;
import sagePack.node;
import sagePack.singleLinkedList;

public class middleOfLL{
    static node findMiddle(node head){
        if(head==null || head.next==null)
            return head;
        node fast = head;
        node slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        singleLinkedList list = new singleLinkedList(new int[]{10,20,30,40,50});
        System.out.println("Value of middle element is :"+findMiddle(list.head).val);
    }
}