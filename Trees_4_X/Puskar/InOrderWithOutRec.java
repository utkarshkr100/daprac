import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import binarytree.*;
import binarytree.BinaryTree.BinaryTreeNode;

public class InOrderWithOutRec extends BinaryTree
{
	static void InOrder(BinaryTreeNode root)
	{
		Stack<BinaryTreeNode> stk=new Stack<>();
		Queue<Integer> q= new LinkedList<>();
		boolean flag=false;
		BinaryTreeNode curr=root;
		while(!flag)
		{
			if(curr!=null)
			{
				stk.push(curr);
				curr=curr.left;
			}
			else
			{
				if(stk.isEmpty())
				{
					flag=true;
				}
				else
				{
					curr=stk.pop();
					q.add(curr.data);
					curr=curr.right;
				}
			}
		}
		while(!q.isEmpty())
		{
			System.out.print(q.poll()+" ");
		}
	}
	public static void main(String[] args)
	{
		InOrderWithOutRec tree=new InOrderWithOutRec();//Tree Created
		
		tree.root=new  BinaryTreeNode(1);//Root Node created
		
		tree.root.left= new BinaryTreeNode(2);
		
		tree.root.right= new BinaryTreeNode(3);
		
		/*tree.root.left.left= new BinaryTreeNode(4);
		
		tree.root.left.right= new BinaryTreeNode(5);
		
		tree.root.right.left= new BinaryTreeNode(6); */
		tree.root.left.left=new BinaryTreeNode(4);
		tree.root.right.left=new BinaryTreeNode(5);
		tree.root.right.right=new BinaryTreeNode(6);
		tree.root.right.left.right=new BinaryTreeNode(8);
		tree.root.right.left.right.left=new BinaryTreeNode(9); 
		
		InOrder(tree.root);
	}
}
