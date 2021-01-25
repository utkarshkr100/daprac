import singlelinkedlist.*;

public class PartitionLinkedList extends SingleLinkedList
{	
	static ListNode partioning(ListNode head,int x)
	{
		ListNode before_head=new ListNode(0);
		ListNode before=before_head;
		ListNode after_head=new ListNode(0);
		ListNode after=after_head;
		while(head!=null)
		{
			if(head.data>=x)
			{
				System.out.println("After head"+head.data);
				
				after.next=head;
				after=after.next;
			}
			else
			{
				System.out.println("Before head"+head.data);
				before.next=head;
				before=before.next;
			}
			head=head.next;
		}
		after.next=null;
		before.next=after_head.next;
		return before_head.next;
		
	}
	public static void main(String[] args)
	{
		PartitionLinkedList list = new PartitionLinkedList();
		list.insert(list,1);
		list.insert(list,4);
		list.insert(list,3);
		list.insert(list,2);
		list.insert(list,5);
		list.insert(list,2);
		list.partioning(list.head,3);
		list.printList(list);
		
	}
}
