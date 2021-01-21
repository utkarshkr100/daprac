import singlelinkedlist.*;

public class ReverseLLInPairsRecursive extends SingleLinkedList
{
	void reverseInPairsRecursive(ListNode head)
	{
		if(head==null||head.next==null)
			return;
		else
		{
			int temp=head.data;
			head.data=head.next.data;
			head.next.data=temp;
			reverseInPairsRecursive(head.next.next);
		}
		
	}
	public static void main(String[] args) 
	{
		ReverseLLInPairsRecursive list=new ReverseLLInPairsRecursive();
		list.insert(list, 0);
		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 3);
		list.insert(list, 4);
		list.insert(list, 5);
		list.insert(list, 6);
		list.insert(list, 7);
		list.printList(list);
		list.reverseInPairsRecursive(list.head);
		list.printList(list);
	}
}
