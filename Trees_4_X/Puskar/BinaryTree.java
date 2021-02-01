package binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class BinaryTreeNode
{
	int data;
	BinaryTreeNode left,right;
	BinaryTreeNode(int data)
	{
		this.data=data;
		left=right=null;
	}
}
public class BinaryTree 
{
	
	BinaryTreeNode root;
	
	BinaryTree(int key)
	{
		root =new BinaryTreeNode(key);
	}
	BinaryTree()
	{
		root =null;
	}
	static public void printInorder(BinaryTreeNode root)
	{
		
		if(root!=null)
		{
			printInorder(root.left);
			System.out.print(root.data+ " ");
			printInorder(root.right);
		}
	}
	static public void printPreorder(BinaryTreeNode root) 
	{
		if(root!=null)
		{
			System.out.print(root.data+ " ");
			printPreorder(root.left);
			printPreorder(root.right);
		}
	}
	static public void printPostorder(BinaryTreeNode root) 
	{
		if(root!=null)
		{
			printPostorder(root.left);
			printPostorder(root.right);
			System.out.print(root.data+ " ");
		}
	}
	public static void printLevelorder(BinaryTreeNode root)
	{
		int h=height(root);
		for(int i=1;i<=h;i++)
		{
			printGivenLevel(root,i);
		}
		
	}
	public static void printGivenLevel(BinaryTreeNode root,int level)
	{
		if(root==null)
		{
			return ;
		}
		else
		{
			if(level==1)
			{
				System.out.print(root.data+" ");
				
			}
			else
			{
				printGivenLevel(root.left,level-1);
				printGivenLevel(root.right,level-1);
			}
		}
	}
	static int height(BinaryTreeNode root)
	{
		if(root==null)
			return 0;
		else
		{
			int l_height=height(root.left);
			int r_height=height(root.right);
			
			if(l_height>r_height)  
				return (l_height+1) ;
			else
				return (r_height+1);
		}
	}
	
	static void printLeafNodes(BinaryTreeNode root)
	{
		int h=height(root);
		printGivenLevel(root,h);
	}
	static int printMaxElement(BinaryTreeNode root)
	{
		int max=Integer.MIN_VALUE;
		if(root!=null)
		{
			int l=printMaxElement(root.left);
			int r=printMaxElement(root.right);
			
			if(l > r)
				max=l ;
			else
				max=r;
			if(root.data>max)
			{
				max=root.data;
			}
			
		}
		return max;
	}
	static boolean searchElement(BinaryTreeNode root,int key)
	{
		boolean flag=false;
		if(root==null)
			return flag;
		else
		{
			if(root.data==key)
			{
				flag=true;
				return flag;
			}
			else
			{
				flag=searchElement( root.left,key)||searchElement(root.right,key);
			}
		}
		return flag;
	}
	
	//entry of an element at first vacnt place in level order traversal
	static void insertElementAtLast(BinaryTreeNode root,int key)
	{
		if(root==null)
		{
			root=new BinaryTreeNode(key);
		}
		else
		{
			Queue<BinaryTreeNode> q=new LinkedList<>();
			q.add(root);
			while(!q.isEmpty())
			{
				root=q.peek();
				q.remove();
				if(root.left==null)
				{
					root.left=new BinaryTreeNode(key);
					System.out.println("Node with value : "+key+" inserted");
					break;
				}
				else
					q.add(root.left);
				if(root.right==null)
				{
					root.right=new BinaryTreeNode(key);
					System.out.println("Node with value : "+key+" inserted");
					break;
				}
				else
					q.add(root.right);
			}
		}
	}
	static void printReverseLevelOrder(BinaryTreeNode root)
	{
		Stack<BinaryTreeNode> stk=new Stack<>();
		Queue<BinaryTreeNode> q=new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty())
		{
			BinaryTreeNode temp=q.poll();
			if(temp.right!=null)
			{
				q.add(temp.right);
			}
			if(temp.left!=null)
			{
				q.add(temp.left);
			}
			
			stk.push(temp);
			
		}
		System.out.println("Printing Reverse Level order of Binary Tree");
		while(!stk.isEmpty())
		{
			int temp=stk.pop().data;
			System.out.print(temp+" ");
		}
		
	}
	static BinaryTreeNode deepestNode(BinaryTreeNode root)
	{
		Queue<BinaryTreeNode> q= new LinkedList<>();
		q.add(root);
		BinaryTreeNode curr=root;
		while(!q.isEmpty())
		{
			BinaryTreeNode temp=q.peek();
			curr=q.poll();
			if(temp.left!=null)
			{
				q.add(temp.left);
			}
			if(temp.right!=null)
			{
				q.add(temp.right);
			}
		}
		return curr;
	}
	// not work on having duplicate deepest node
	static void deleteThisNode(BinaryTreeNode root,int key)
	{
		int temp=deepestNode(root).data;
		Queue<BinaryTreeNode> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			BinaryTreeNode curr=q.poll();
			if(curr.data==key)
			{
				curr.data=temp;
			}
			else
			{
				if(curr.left!=null)
				{
					q.add(curr.left);
				}
				if(curr.right!=null)
				{
					q.add(curr.right);
				}
			}
		}
		deleteDeepestNode(root,deepestNode(root));
	}
	static void deleteDeepestNode(BinaryTreeNode root,BinaryTreeNode curr)
	{
		Queue<BinaryTreeNode> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			BinaryTreeNode temp=q.poll();
			if(temp.left!=null) 
			{
				if(temp.left==curr)
				{
					temp.left=null;
					return;
				}
				else
					q.add(temp.left);
			}
			if(temp.right!=null)
			{
				if(temp.right==curr)
				{
					temp.right=null;
					return;
				}
				else
				{
					q.add(temp.right);
				}
			}
		}
	}
	public static void main(String[] args)
	{
		BinaryTree tree=new BinaryTree();//Tree Created
		
		tree.root=new  BinaryTreeNode(1);//Root Node created
		
		tree.root.left= new BinaryTreeNode(2);
		
		tree.root.right= new BinaryTreeNode(3);
		
		tree.root.left.left= new BinaryTreeNode(4);
		
		tree.root.left.right= new BinaryTreeNode(5);
		
		tree.root.right.left= new BinaryTreeNode(6); 
		
		/* tree.root.left.left=new BinaryTreeNode(4);
		tree.root.right.left=new BinaryTreeNode(5);
		tree.root.right.right=new BinaryTreeNode(6);
		tree.root.right.left.right=new BinaryTreeNode(8);
		tree.root.right.left.right.left=new BinaryTreeNode(9); */
		
		
		System.out.println("Inorder Traversal Of Tree is :");
		printInorder(tree.root);
		System.out.println("");
		
		System.out.println("Preorder Traversal Of Tree is :");
		printPreorder(tree.root);
		System.out.println("");
		
		System.out.println("Postorder Traversal Of Tree is :");
		printPostorder(tree.root);
		System.out.println("");
		
		System.out.println("Levelorder Traversal Of Tree is :");
		printLevelorder(tree.root);
		System.out.println("");
		System.out.println("Height of Binary Tree is :"+height(tree.root));
		
		System.out.println("Printing Leaf Node");
		printLeafNodes(tree.root);
		System.out.println(" ");
		
		System.out.println("Printing Max Value : "+	printMaxElement(tree.root));
		
		System.out.println("Searching for Data "+9+" "+searchElement(tree.root,9));
		
		System.out.println("Adding element at last place in binary tree in level order");
		insertElementAtLast(tree.root,7);
		

		System.out.println("Inorder Traversal Of Tree is :");
		printInorder(tree.root);
		System.out.println("");
		
		printReverseLevelOrder(tree.root);
		
		System.out.println("");
		System.out.println("DeepestNode  Of Tree is : "+deepestNode(tree.root).data);
		
		deleteThisNode(tree.root,4);
		
		System.out.println("Inorder Traversal Of Tree is :");
		printInorder(tree.root);
		System.out.println("");
	}
	
}
