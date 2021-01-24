import singlelinkedlist.*;

public class AddingLLInSingleDigit extends SingleLinkedList
{
	static ListNode addLL(ListNode head1,ListNode head2)
	{
		ListNode temp_node=head1,curr_node=head2;
		if(head1==null)
			return head2;
		if(head2==null)
			return head1;
		ListNode head=new ListNode(0);
		temp_node=head;
		int carry=0;
		while(head1!=null&&head2!=null)
		{
			int sum=((head1.data+head2.data)+carry)%10;
			 carry=(head1.data+head2.data+carry)/10;
			 ListNode new_node =new ListNode(sum);
			 temp_node.next=new_node;
			 temp_node=temp_node.next;
			 head1=head1.next;
			 head2=head2.next;
		}
		//one case remaining.
		
		return head.next ;
	}
	public static void main(String[] args)
	{
		SingleLinkedList list1 =new SingleLinkedList();
		SingleLinkedList list2 =new SingleLinkedList();
		list1.insert(list1, 3);
		list1.insert(list1, 4);
		list1.insert(list1, 3);
		list2.insert(list2, 5);
		list2.insert(list2, 6);
		list2.insert(list2, 4);
		ListNode temp=addLL(list1.head,list2.head);
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

}
