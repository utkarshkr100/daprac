import singlelinkedlist.*;

public class LLfromEnd extends SingleLinkedList
{
	public void printReverse(ListNode head)
	{
		if(head==null)
		{
			return;
		}
		else
		{
			printReverse(head.next);
			System.out.print( head.data+" ");
		}
	}
	
	public static void main(String[] args)
	{
		LLfromEnd list=new LLfromEnd();
		list.insert(list, 0);
		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 3);
		list.insert(list, 4);
		list.insert(list, 5);
		list.insert(list, 6);
		list.insert(list, 7);
		list.printReverse(list.head);
	}
}
