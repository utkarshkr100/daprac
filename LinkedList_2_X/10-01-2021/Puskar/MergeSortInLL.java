import singlelinkedlist.*;


public class MergeSortInLL extends SingleLinkedList
{	public static ListNode mergeTwoSortedLinkedList(ListNode headA,ListNode headB)
	{
		SingleLinkedList list=new SingleLinkedList();
		ListNode curr_nodeA=headA,curr_nodeB=headB,curr_node=list.head;
		
		while(curr_nodeA!=null&&curr_nodeB!=null)
		{
			int data;
			if(curr_nodeA.data<curr_nodeB.data)
			{
				data=curr_nodeA.data;
				curr_nodeA=curr_nodeA.next;
			}
			else
			{
				data=curr_nodeB.data;
				curr_nodeB=curr_nodeB.next;
			}
			ListNode new_node=new ListNode(data);
			new_node.next=null;
			if(list.head==null)
			{
				list.head=new_node;
			}
			else
			{
				curr_node=list.head;
				while(curr_node.next!=null) 
				{
					curr_node=curr_node.next;
				}
				curr_node.next=new_node;
			}
		}
		if(curr_nodeB==null)
		{
			while(curr_nodeA!=null)
			{
			int data=curr_nodeA.data;
			curr_nodeA=curr_nodeA.next;
			ListNode new_node=new ListNode(data);
			new_node.next=null;
			if(list.head==null)
			{
				list.head=new_node;
			}
			else
			{
				curr_node=list.head;
				while(curr_node.next!=null) 
				{
					curr_node=curr_node.next;
				}
				curr_node.next=new_node;
			}
			}
			
			
		}
		if(curr_nodeA==null)
		{
			while(curr_nodeB!=null)
			{
			int data=curr_nodeB.data;
			curr_nodeB=curr_nodeB.next;
			ListNode new_node=new ListNode(data);
			new_node.next=null;
			if(list.head==null)
			{
				list.head=new_node;
			}
			else
			{
				curr_node=list.head;
				while(curr_node.next!=null) 
				{
					curr_node=curr_node.next;
				}
				curr_node.next=new_node;
			}
			}
			
			
		}
		
		return list.head;
	}
	
	public static void main(String[] args)
	{
		MergeSortInLL list1=new MergeSortInLL();
		MergeSortInLL list2=new MergeSortInLL();
		list1.insert(list1, 0);
		list2.insert(list2, 1);
		list1.insert(list1, 2);
		list2.insert(list2, 3);
		list1.insert(list1, 4);
		list2.insert(list2, 5);
		list2.insert(list2, 6);
		list2.insert(list2, 7);
		list2.insert(list2, 8);
		ListNode curr_node=mergeTwoSortedLinkedList(list1.head,list2.head);
		while(curr_node!=null)
		{
			System.out.print(curr_node.data+" ");
			curr_node=curr_node.next;
		}
	}

}
