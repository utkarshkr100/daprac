import binarytree.*;
import binarytree.BinaryTree.BinaryTreeNode;

public class IdenticalStructure extends BinaryTree
{
	static boolean isSameStructure(BinaryTreeNode a, BinaryTreeNode b) 
	{ 
	    // 1. both empty 
	    if (a == null && b == null) 
	        return true; 
	 
	    // 2. both non-empty . compare them 
	    if (a != null && b != null) 
	    { 
	    	System.out.println(a.data+" "+b.data);
	        return
	        ( 
	        		a.data==b.data&&
	            isSameStructure(a.left, b.left) && 
	            isSameStructure(a.right, b.right) 
	            
	        ); 
	    } 
	     
	    // 3. one empty, one not . false 
	    return false; 
	} 
	public static void main(String[] args)
	{
		IdenticalStructure tree=new IdenticalStructure();
		IdenticalStructure tree2=new IdenticalStructure();
		
		tree.root=new  BinaryTreeNode(56);//Root Node created
		
		tree.root.left= new BinaryTreeNode(2);
		
		tree.root.right= new BinaryTreeNode(27);
		
		tree.root.left.left= new BinaryTreeNode(4);
		
		tree.root.left.right= new BinaryTreeNode(5);
		
		tree.root.right.left= new BinaryTreeNode(15); 
		System.out.println(isSameStructure(tree.root,tree.root.left));
	}

}
