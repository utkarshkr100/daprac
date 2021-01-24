import singlelinkedlist.*;

public class RemovingDuplicates extends SingleLinkedList
{
	static void removingDuplicates(ListNode head)
	{
		ListNode temp_node=head,curr_node=head,prev_node=null;
		while(temp_node!=null)
		{
			curr_node=head;
			while(curr_node!=null)
			{
				
				if(temp_node!=curr_node&&temp_node.data==curr_node.data)
				{
					prev_node.next=curr_node.next;
					System.out.println("Node with Data "+curr_node.data+" Deleted");
				}
				prev_node=curr_node;
				curr_node=curr_node.next;
			}
			temp_node=temp_node.next;
		}
		
	}
	public static void main(String[] args)
	{
		RemovingDuplicates list=new RemovingDuplicates();
		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 3);
		list.insert(list, 4);
		list.insert(list, 5);
		list.insert(list, 1);
		list.insert(list, 3);
		list.insert(list, 5);
		list.removingDuplicates(list.head);
		list.printList(list);
	}
}
