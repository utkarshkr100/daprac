
public class RandompPtrCloning 
{
	static class ListNode
	{
		int data;
		ListNode next;
		ListNode random;
		ListNode(int data)
		{
			this.data=data;
			this.next=null;
			this.random=null;
		}
	}
	static ListNode head;
	static void insert(RandompPtrCloning  list,int data)
	{
		ListNode new_node=new ListNode(data);
		ListNode curr_node=list.head;
		if(curr_node==null) 
		{
			list.head=new_node;
			System.out.println("Head with data "+new_node.data+" inserted");
			return;
		}
		else
		{
			while(curr_node.next!=null)
			{
				curr_node=curr_node.next;
			}
			curr_node.next=new_node;
			System.out.println("Node with Data "+new_node.data+" inserted");
			return;
		}
	}
	static void makeRandom(ListNode head)
	{
		head.random=head.next.next;
		head.next.random=head;
		head.next.next.random=head.next.next.next;
		head.next.next.next.next.random=head.next;
		head.next.next.next.random=head.next.next.next.next;
		while(head!=null)
		{
			System.out.println("Random Pointer is Pointing "+ head.random.data);
			head=head.next;
		}
		
	}
	static ListNode Randomptrcloning(ListNode head)
	{
		ListNode temp_node=head,curr_node=null;
		ListNode head2=new ListNode(head.data);
		curr_node=head2;
		while(temp_node!=null)
		{
			ListNode new_node=new ListNode(temp_node.data);
			head2.next=new_node;
			System.out.println("data with value "+ head2.next.data+" cloned");
			head2=head2.next;
			temp_node=temp_node.next;
		}
		temp_node=head;
		head2=curr_node;
		while(temp_node!=null)
		{
			ListNode aux=temp_node.next;
			temp_node.next=curr_node;
			curr_node.random=temp_node.random;
			System.out.println("Random ptr value cloning "+curr_node.random.data);
			temp_node=aux;
			curr_node=curr_node.next;
		}
		return curr_node;
	}
	
	public static void main(String[] args) 
	{
		RandompPtrCloning list =new RandompPtrCloning();
		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 3);
		list.insert(list, 4);
		list.insert(list, 5);
		list.makeRandom(list.head);
		ListNode temp=list.Randomptrcloning(list.head);
	}
	
}
