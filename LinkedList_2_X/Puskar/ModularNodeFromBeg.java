import singlelinkedlist.*;

public class ModularNodeFromBeg extends SingleLinkedList
{
	static ListNode modularNode(ListNode head,int k)
	{
		int i=1;
		ListNode curr_node=head,modular_node=null;
		if(k<0)
		{
			return null;
		}
		else
		{
			while(curr_node!=null)
			{
				if(i%k==0)
				{	
					modular_node=curr_node;
				}
				curr_node=curr_node.next;
				i++;
			}
		}
		return modular_node;
	}
	public static void main(String[] args) 
	{
		ModularNodeFromBeg list =new ModularNodeFromBeg();
		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 3);
		list.insert(list, 4);
		list.insert(list, 5);
		System.out.println((list.modularNode(list.head,2)).data);
	}
}
