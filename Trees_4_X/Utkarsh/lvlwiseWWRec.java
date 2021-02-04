package Trees_4_X;

import java.util.*;

import sagePack.treeNode;

public class lvlwiseWWRec {
    public List<Integer> printLvlwiseWRec(treeNode root){
        List<Integer> list = new ArrayList<>();
        if(root == null)
            return list;
        Queue<treeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size() > 0){
            for(int i = 0;i<q.size();i++){
                treeNode temp = q.poll();
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
                list.add(temp.val);
            }
        }
        return list;
    }
}