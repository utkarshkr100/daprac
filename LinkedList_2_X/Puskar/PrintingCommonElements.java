import singlelinkedlist.*;

public class PrintingCommonElements extends SingleLinkedList
{
	static void removeDuplicatesFromSortedLinkedList(ListNode head1,ListNode head2)
	{
		ListNode temp_node=head1,curr_node=head2;
		while(temp_node!=null&&curr_node!=null)
		{
			if(temp_node.data==curr_node.data)
			{
				System.out.println(curr_node.data);
				curr_node=curr_node.next;
				temp_node=temp_node.next;
			}
			else if(temp_node.data>curr_node.data)
			{
				curr_node=curr_node.next;
			}
			else
			{
				temp_node=temp_node.next;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		SingleLinkedList list1=new SingleLinkedList();
		SingleLinkedList list2=new SingleLinkedList();
		list1.insert(list1, 1);
		list2.insert(list2, 2);
		list1.insert(list1, 2);
		list2.insert(list2, 4);
		list1.insert(list1, 3);
		list2.insert(list2, 5);
		list1.insert(list1, 4);
		list2.insert(list2, 6);
		list2.insert(list2, 8);
		PrintingCommonElements list =new PrintingCommonElements();
		list.removeDuplicatesFromSortedLinkedList(list1.head, list2.head);
	}
}
