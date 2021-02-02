import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import binarytree.*;


public class PreOrderWithOutRec extends BinaryTree
{
	static void PreOrder(BinaryTreeNode root)
	{
		Stack<BinaryTreeNode> stk=new Stack<>();
		Queue<Integer> q=new LinkedList<>();
		stk.push(root);
		while(!stk.isEmpty())
		{
			BinaryTreeNode curr=stk.pop();
			q.offer(curr.data);
			if(curr.right!=null)
			{
				stk.push(curr.right);
			}
			if(curr.left!=null)
			{
				stk.push(curr.left);
			}
		}
		while(!q.isEmpty())
		{
			System.out.print(q.poll()+" ");
		}
		
	}
	
	public static void main(String[] args) 
	{
PostOrderWithOutRec tree= new PostOrderWithOutRec();
		
		tree.root=new  BinaryTreeNode(1);//Root Node created
		
		tree.root.left= new BinaryTreeNode(2);
		
		tree.root.right= new BinaryTreeNode(3);
		
		tree.root.left.left= new BinaryTreeNode(4);
		
		tree.root.left.right= new BinaryTreeNode(5);
		
		tree.root.right.left= new BinaryTreeNode(6); 
		
		PreOrder(tree.root);
	}
}
