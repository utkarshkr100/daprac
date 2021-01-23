import singlelinkedlist.*;
public class ReverseSinglyLinkedList extends SingleLinkedList
{
	public void reverseLinkedList(SingleLinkedList list)
	{
		ListNode curr_node=list.head;
		ListNode prev_node=null,next_node=null;
		while(curr_node!=null)
		{
			next_node=curr_node.next;
			curr_node.next=prev_node;
			prev_node=curr_node;
			curr_node=next_node; 
		}
		list.head=prev_node;
	}
	public static void main(String[] args) 
	{
		ReverseSinglyLinkedList list=new ReverseSinglyLinkedList();
		
		list.insert(list, 0);
		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 3);
		list.insert(list, 4);
		list.insert(list, 5);
		list.reverseLinkedList(list);
		list.printList(list);
	}

}
