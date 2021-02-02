import java.util.Stack;

import binarytree.*;
import binarytree.BinaryTree.BinaryTreeNode;

public class MaximumNumberWithoutRec extends BinaryTree 
{
	static int MaximumNumberInsideTree(BinaryTreeNode root)
	{
		int max=Integer.MIN_VALUE;
		
		Stack<BinaryTreeNode> stk=new Stack<>();
		stk.push(root);
		while(!stk.isEmpty())
		{
			BinaryTreeNode curr=stk.pop();
			if(curr.data>max)
			{
				max=curr.data;
			}
			if(curr.right!=null)
			{
				stk.push(curr.right);
			}
			if(curr.left!=null)
			{
				stk.push(curr.left);
			}
		}
		return max;
		
	}
	public static void main(String[] args)
	{
		MaximumNumberWithoutRec tree= new MaximumNumberWithoutRec();
		
		tree.root=new  BinaryTreeNode(56);//Root Node created
		
		tree.root.left= new BinaryTreeNode(2);
		
		tree.root.right= new BinaryTreeNode(27);
		
		tree.root.left.left= new BinaryTreeNode(4);
		
		tree.root.left.right= new BinaryTreeNode(5);
		
		tree.root.right.left= new BinaryTreeNode(15); 
		
		System.out.println(MaximumNumberInsideTree(tree.root));
	}
}
