import singlelinkedlist.*;
public class MiddleElementWithTwoPointers extends SingleLinkedList
{
	public void middleElementLL(SingleLinkedList list)
	{
		ListNode fast_ptr=list.head,slow_ptr=list.head;
		while(fast_ptr!=null&&fast_ptr.next!=null)
		{
			slow_ptr=slow_ptr.next;
			fast_ptr=fast_ptr.next.next;
		}
		System.out.println(slow_ptr.data);
	}
	public static void main(String[] args) 
	{
		MiddleElementWithTwoPointers list=new MiddleElementWithTwoPointers();
		list.insert(list, 0);
		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 3);
		list.insert(list, 4);
		list.insert(list, 5);
		list.insert(list, 6);
		list.insert(list, 7);
		list.middleElementLL(list);
	}

}
