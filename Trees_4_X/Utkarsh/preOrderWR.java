package Trees_4_X;

import java.util.*;
import sagePack.treeNode;

public class preOrderWR {
    public List<Integer> printPreOrderWRec(treeNode root){
        List<Integer> list = new ArrayList<>();
        if(root == null)
            return list;
        
        Stack<treeNode> st = new Stack<treeNode>();
        st.push(root);

        treeNode ptr = null;

        while(!st.isEmpty()){
            ptr = st.pop();
            list.add(ptr.val);

            if(ptr.right!=null)
                st.push(ptr.right);
            
            if(ptr.left!=null)
                st.push(ptr.left);
        }
        return list;
    }
}
