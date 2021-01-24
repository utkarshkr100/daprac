import singlelinkedlist.*;

public class RotationToRightByKInLL extends SingleLinkedList
{
	static ListNode rotateByK(ListNode head,int k)
	{
		ListNode curr_node=head,temp_node=null;
		int length=0;
		while(curr_node!=null)
		{
			length++;
			curr_node=curr_node.next;
		}
		
		int count=length-k-1;
	
		curr_node=head;
	
		while(count>0&&curr_node.next!=null)
		{
			
			curr_node=curr_node.next;
			count--;
		}
		temp_node=curr_node.next;
		
		while(temp_node.next!=null)
		{
			temp_node=temp_node.next;
		}
		temp_node.next=head;
		head=curr_node.next;
		curr_node.next=null;
		return head;
		
	}
	public static void main(String[] args) 
	{
		RotationToRightByKInLL list =new RotationToRightByKInLL();
		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 3);
		list.insert(list, 4);
		list.insert(list, 5);
		ListNode temp=list.rotateByK(list.head,2);
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
