package binarytree;
import java.util.*;
public class FindNoOfHalfNodes extends BinaryTree
{
	static int findingNoOfHalfNodes(BinaryTreeNode root)
	{
		int count=0;
		Queue<BinaryTreeNode> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			BinaryTreeNode curr=q.poll();
			if((curr.left==null&&curr.right!=null)||(curr.left!=null&&curr.right==null))
			{
				count+=1;
			}
			if(curr.left!=null)
			{
				q.add(curr.left);
			}
			if(curr.right!=null)
			{
				q.add(curr.right);
			}
		}
		return count;
		
	}
	
	public static void main(String[] args) 
	{
		FindNoOfHalfNodes tree=new  FindNoOfHalfNodes();//Tree Created
		
		tree.root=new  BinaryTreeNode(1);//Root Node created
		
		tree.root.left= new BinaryTreeNode(2);
		
		tree.root.right= new BinaryTreeNode(3);
		
		tree.root.left.left= new BinaryTreeNode(4);
		
		tree.root.left.right= new BinaryTreeNode(5);
		
		tree.root.right.left= new BinaryTreeNode(6); 
		
		System.out.println(findingNoOfHalfNodes(tree.root));
		
	}
}
