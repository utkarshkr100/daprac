import singlelinkedlist.*;

public class PallindromeOrNot extends SingleLinkedList 
{
	static void checkPallindrome(ListNode head)
	{
		ListNode f_ptr=head,s_ptr=head;
		while(f_ptr.next!=null&&f_ptr.next.next!=null)
		{
			f_ptr=f_ptr.next.next;
			s_ptr=s_ptr.next;
		}
		System.out.println(s_ptr.data);
		ListNode prev_node=null,curr_node=s_ptr.next,next_node=null;
		while(curr_node!=null)
		{
			next_node=curr_node.next;
			curr_node.next=prev_node;
			prev_node=curr_node;
			curr_node=next_node;
		}
		s_ptr.next=prev_node;
		f_ptr=s_ptr.next;
		s_ptr=head;
		while(f_ptr!=null)
		{
			if(f_ptr.data==s_ptr.data)
			{
				f_ptr=f_ptr.next;
				s_ptr=s_ptr.next;
			}
			else
			{
				System.out.println("Not A Pallindrome");
				return;
			}
		}
		System.out.println("Pallindrome");
		return;
	}

	public static void main(String[] args) 
	{
		PallindromeOrNot list =new PallindromeOrNot();
		list.insert(list, 0);
		list.insert(list, 1);
		list.insert(list, 1);
		list.insert(list, 0);
		PallindromeOrNot.checkPallindrome(list.head);
		list.printList(list);
	}
}
