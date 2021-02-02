import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import binarytree.*;
import binarytree.BinaryTree.BinaryTreeNode;

public class PostOrderWithOutRec extends BinaryTree
{
	static void PostOrder(BinaryTreeNode root)
	{
		Stack<BinaryTreeNode> stk=new Stack<>();
		Queue<Integer> q=new LinkedList<>();
		BinaryTreeNode parent=null;//parent node of current node
		stk.push(root);
		while(!stk.isEmpty())
		{
			BinaryTreeNode curr=stk.peek();
			if(parent==null||parent.left==curr||parent.right==curr)
			{
				if(curr.left!=null)
				{
					stk.push(curr.left);
				}
				else if(curr.right!=null)
				{
					stk.push(curr.right);
				}
			}
			else if(curr.left==parent)
			{
				if(curr.right!=null)
					stk.push(curr.right);
			}

			// from here curr is leaf node 
			else
			{
				q.add(curr.data);
				stk.pop();
			}
			parent =curr;
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
		
		PostOrder(tree.root);
		
	}
}