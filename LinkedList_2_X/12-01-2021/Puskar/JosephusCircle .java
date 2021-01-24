

public class JosephusCircle 
{	
	static  class ListNode
	{
		int data;
		ListNode next;
		ListNode(int data)
		{
			this.data=data;
		}
	}
	static ListNode head=new ListNode(1);
	static void circleOfDeath(int size,int k)
	{
		
		ListNode temp=head;
		
		for(int i=2;i<=size;i++)
		{
			temp.next=new ListNode(i);
			temp=temp.next;
		}
		temp.next=head;
	
		while(head.next!=head)
		{
		ListNode curr_node=head,temp_node=null;
		int count =0;
		while(count!=k-1)
		{
			temp_node=curr_node;
			curr_node=curr_node.next;
			count++;
		}
		temp_node.next=curr_node.next;
		System.out.println("Roman with Data "+curr_node.data+" Deleted");
		head=curr_node.next;
		System.out.println("Roman with Data "+head.data+" is starting the count");
		}
		if(head.next==head)
		{
			System.out.println("Last Man Standing(Josephus) is "+head.data);
			return;
		}
	}
	static ListNode temp=null;
	public static void main(String[] args) 
	{
		circleOfDeath(4,2);
	}
}
