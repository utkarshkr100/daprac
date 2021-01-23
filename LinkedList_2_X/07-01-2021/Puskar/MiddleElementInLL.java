import singlelinkedlist.*;
public class MiddleElementInLL extends SingleLinkedList
{
	public ListNode MiddleElement(SingleLinkedList list)
	{
		ListNode curr_node=list.head;
		int count=0;
		while(curr_node!=null)
		{
			count++;
			curr_node=curr_node.next;
			
		}
		int middle=(count+1)/2;
		count=0;
		curr_node=list.head;
		while(curr_node!=null&&middle!=count)
		{
			curr_node=curr_node.next;
			count++;
			
		}
		return curr_node;
	}
	
	public static void main(String[] args)
	{
		MiddleElementInLL list=new MiddleElementInLL ();
		list.insert(list, 0);
		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 3);
		list.insert(list, 4);
		list.insert(list, 5);
		System.out.println((list.MiddleElement(list)).data);
	}
}
