import singlelinkedlist.*;
import singlelinkedlist.SingleLinkedList.ListNode;

public class KReverseLL extends SingleLinkedList
{	
	static ListNode kRverseLinkedList(ListNode head,int k)
	{
		  ListNode curr_node=head;
		  ListNode prev_node=null,next_node=null;
		  int count=0;
		  int length=0;
		  while(curr_node!=null) 
		  {
			  curr_node=curr_node.next;
			  length++;
		  }
		  curr_node=head;
		  if(length>=k)
		  {
		  while(curr_node!=null&&count<k)
		  {
			  next_node=curr_node.next;
			  curr_node.next=prev_node;
			  prev_node=curr_node;
			  curr_node=next_node;
			  count++;
		  }
		  head.next=next_node;
		  head=prev_node;
		  return head;
		  }
		  else
		  {
			  System.out.println("In corrrect k value");
			  return head;
		  }
	}
	
	public static void main(String[] args) 
	{
		KReverseLL list =new KReverseLL();
		list.insert(list, 0);
		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 3);
		list.insert(list, 4);
		list.insert(list, 5);
		ListNode curr_node=kRverseLinkedList(list.head,3);
		while(curr_node!=null)
		{
			System.out.print(curr_node.data+" ");
			curr_node=curr_node.next;
		}
	}
}
