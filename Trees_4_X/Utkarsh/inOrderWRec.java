package Trees_4_X;
import java.util.*;
import sagePack.treeNode;

public class inOrderWRec {
    public List<Integer> printInOrderWRec(treeNode root){
        List<Integer> list = new ArrayList<>();
        if(root == null)
            return list;
        Stack<treeNode> st = new Stack<treeNode>();
        //st.push(root);

        treeNode current = root;
        while(!st.isEmpty() || current!=null){
            if(current!= null){
                st.push(current);
                current = current.left;
            }
            else{
                current = st.pop();
                list.add(current.val);
                current = current.right;
            }            
        }
        return list;
    }
}