import singlelinkedlist.*;

public class ReverseLLInPairs extends SingleLinkedList
{
	public void reversePairs(SingleLinkedList list)
	{
		ListNode curr_node=list.head,next_node=null,temp_node=null;
		
		while(curr_node!=null&&curr_node.next!=null)
		{
			
			temp_node=curr_node.next.next;
			next_node=curr_node.next;
			int temp=curr_node.data;
			curr_node.data=next_node.data;
			next_node.data=temp;
			curr_node=temp_node;
		}

	}
	public static void main(String[] args)
	{
		ReverseLLInPairs list=new ReverseLLInPairs();
		list.insert(list, 0);
		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 3);
		list.insert(list, 4);
		list.insert(list, 5);
		list.insert(list, 6);
		list.insert(list, 7);
		list.printList(list);
		list.reversePairs(list);
		list.printList(list);
	}
}
