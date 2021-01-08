package jan_06;

import jan_06.MixedLinkedList.ListNode;


class MixedLinkedList
	{
		class ListNode
		{
			int data;
			ListNode next; 
			ListNode(int data)
			{
				this.data=data;
				this.next=null;
			}
		}
		ListNode head;
		public void push(MixedLinkedList list,int data)
		{
			ListNode new_node= new ListNode(data);
			new_node.next=null;
			
			if(list.head==null)
			{
				list.head=new_node;
			}
			else
			{
				ListNode curr_node;
				curr_node=list.head;
				while(curr_node.next!=null)
				{
					curr_node=curr_node.next;
				}
				curr_node.next=new_node;
			}
			
		}
		//this method makes cylcle in linked list
		public void MakeCycle(MixedLinkedList list)
		{
			ListNode curr_node=list.head;
			while(curr_node.next!=null)
			{
				curr_node=curr_node.next;
			}
			curr_node.next=list.head.next.next.next;
		}
		
	}

public class NullTerminatedOrCyclic 
{	
	public static void nullTerminatedOrCyclic(MixedLinkedList list)
	{
		ListNode fast_ptr=list.head;//moves Alternate
		ListNode slow_ptr=list.head;//move One After Another
		while(fast_ptr!=null&&fast_ptr.next!=null)
		{
			fast_ptr=fast_ptr.next.next;
			slow_ptr=slow_ptr.next;
			if(fast_ptr==slow_ptr)
			{
				System.out.println("Cycle Exits");
				return;
			}
		}
		System.out.println("Cycle Doestn't Exits");
		return;
		
	}
	
	
	public static void main(String[] args)
	{
		MixedLinkedList list =new MixedLinkedList();
		list.push(list, 0);
		list.push(list, 1);
		list.push(list, 2);
		list.push(list, 3);
		list.push(list, 4);
		list.push(list, 5);
		
		list.MakeCycle(list);//this method makes cylcle in linked list
		nullTerminatedOrCyclic(list);
	}
}
