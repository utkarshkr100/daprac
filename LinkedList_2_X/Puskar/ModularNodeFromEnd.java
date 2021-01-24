import singlelinkedlist.*;

public class ModularNodeFromEnd extends SingleLinkedList
{		
	static void modularNode(ListNode head,int k)
	{
		ListNode curr_node=head;
		int length=1;
		while(curr_node.next!=null)
		{
			curr_node=curr_node.next;
			length++;
		}
		System.out.println(length);
		int count=length-k;
		curr_node=head;
		System.out.println(count);
		int i=1;
		while(curr_node.next!=null&&i<count)
		{
			curr_node=curr_node.next;
			i++;
		}
		System.out.println(curr_node.data);
	}
	public static void main(String[] args) 
	{
		ModularNodeFromEnd list =new ModularNodeFromEnd();
		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 3);
		list.insert(list, 4);
		list.insert(list, 5);
		list.insert(list, 6);
		list.insert(list, 7);
		list.insert(list, 8);
		list.insert(list, 9);
		list.insert(list, 10);
		list.insert(list, 11);
		list.insert(list, 12);
		list.insert(list, 13);
		list.insert(list, 14);
		list.insert(list, 15);
		list.insert(list, 16);
		list.insert(list, 17);
		list.insert(list, 18);
		list.insert(list, 19);
		
		list.modularNode(list.head,3);
	}
}
