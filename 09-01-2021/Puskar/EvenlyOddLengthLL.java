import singlelinkedlist.*;

public class EvenlyOddLengthLL extends SingleLinkedList
{
	public void checkLength(SingleLinkedList list) 
	{
		ListNode curr_node=list.head;
		while(curr_node!=null&&curr_node.next!=null)
		{
			curr_node=curr_node.next.next;
		}
		if(curr_node==null)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("odd");
		}
	}
	
	public static void main(String[] args)
	{
		EvenlyOddLengthLL list=new EvenlyOddLengthLL();
		list.insert(list, 0);
		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 3);
		list.insert(list, 4);
		list.insert(list, 5);
		list.insert(list, 6);
		
		list.checkLength(list);
	}

}
