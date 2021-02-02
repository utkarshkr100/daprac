import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import binarytree.*;

public class LevelOrderWithOutRec extends BinaryTree
{
	static void LevelOrder(BinaryTreeNode root)
	{
		List<Integer> q=new ArrayList<>();
		Queue<BinaryTreeNode> temp=new LinkedList<>();
		temp.add(root);
		while(!temp.isEmpty())
		{
			BinaryTreeNode curr=temp.poll();
			System.out.println(q);
			if(curr!=null)
			q.add(curr.data);
			if(curr.left!=null)
			{
				temp.add(curr.left);
			}
			if(curr.left!=null)
			{
				temp.add(curr.right);
			}
		
		}
		System.out.println(q);
		
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
		
		LevelOrder(tree.root);
		
	}
}
