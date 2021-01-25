import singlelinkedlist.*;

public class OddEvenList extends SingleLinkedList
{
	static ListNode oddEven(ListNode head)
	{
		ListNode curr_node=head;
		ListNode even_head=new ListNode(0);
		ListNode even=even_head;
		ListNode odd_head=new ListNode(0);
		ListNode odd=odd_head;
		while(curr_node!=null)
		{
			if(curr_node.data%2==0)
			{
				
				
				even.next=curr_node;
				even=even.next;
				curr_node=curr_node.next;
			}
			else
			{
				odd.next=curr_node;
				odd=odd.next;
				curr_node=curr_node.next;
			}
		}
		
		even.next=null;
	
		odd.next=even_head.next;
		
		return head;
	}
	public static void main(String[] args) 
	{
		OddEvenList list =new OddEvenList();
		list.insert(list,1);
		list.insert(list,4);
		list.insert(list,3);
		list.insert(list,2);
		list.insert(list,5);
		list.insert(list,2);
		list.oddEven(list.head);
		list.printList(list);
	}
}
