import singlelinkedlist.*;

public class SplitLinkedList extends SingleLinkedList
{
	static void splitLL(ListNode head)
	{
		ListNode fast_ptr =head,slow_ptr=head;
		while(fast_ptr.next!=null&&fast_ptr.next.next!=null)
		{
			fast_ptr=fast_ptr.next.next;
			slow_ptr=slow_ptr.next;
		}
		System.out.println(slow_ptr.data);
		System.out.println(slow_ptr.next.data);
	}
	public static void main(String[] args) 
	{
		SplitLinkedList list=new SplitLinkedList();
		list.insert(list, 0);
		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 3);
		list.insert(list, 4);
		list.insert(list, 5);
		list.splitLL(list.head);
	}

}
