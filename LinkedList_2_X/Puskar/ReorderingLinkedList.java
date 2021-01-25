import singlelinkedlist.*;

public class ReorderingLinkedList extends SingleLinkedList
{
	static ListNode reorderingLL(ListNode head)
	{
		ListNode curr_node=head,f=head,s=head,temp_node=head;
		while(f.next!=null&&f.next.next!=null)
		{
			f=f.next.next;
			s=s.next;
		}
		curr_node=s.next;
		s.next=null;
		s=head;
		ListNode prev_node=null,next_node=null;
		while(curr_node!=null)
		{
			next_node=curr_node.next;
			curr_node.next=prev_node;
			prev_node=curr_node;
			curr_node=next_node;
		}
		curr_node=prev_node;
		System.out.print("Rveersing the half :");
		while(curr_node!=null)
		{
			System.out.print(curr_node.data+" ");
			curr_node=curr_node.next;
		}
		curr_node=prev_node;
		
		ListNode next_1=null,next_2=null;
		while(curr_node!=null)
		{
			
			next_1=temp_node.next;
			temp_node.next=curr_node;
			System.out.println("Reordered next :" +temp_node.next.data);
			next_2=curr_node.next;
			curr_node.next=next_1;
			curr_node=next_2;
			temp_node=next_1;
			
		}
		return s;
		
	}
	public static void main(String[] args) 
	{
		ReorderingLinkedList list=new ReorderingLinkedList();
		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 3);
		list.insert(list, 4);
		list.insert(list, 5);
		
		list.printList(list);
		list.reorderingLL(list.head);
		list.printList(list);
		
		
	}

}
