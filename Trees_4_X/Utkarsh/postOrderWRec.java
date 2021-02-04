package Trees_4_X;
import java.util.*;
import sagePack.treeNode;

public class postOrderWRec {
    public List<Integer> printPostOrderWRec(treeNode root){
        List<Integer> list = new LinkedList<>();
        if(root == null)
            return list;
        Stack<treeNode> st = new Stack<treeNode>();
        st.push(root);

        treeNode temp = null;

        while(!st.isEmpty()){
            temp = st.pop();
            list.add(0, temp.val);
            if(temp.left!=null)
                st.push(temp.left);
            if(temp.right!=null)
                st.push(temp.right);
        }
        return list;
    }
}
