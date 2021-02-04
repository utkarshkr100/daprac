package Trees_4_X;

import java.util.List;

import sagePack.treeNode;

public class test {
    public static void main(String[] args) {
        treeNode root = new treeNode(10);
        root.left = new treeNode(20);
        root.right = new treeNode(30);
        root.left.left = new treeNode(40);
        root.left.right = new treeNode(50);
        root.right.left = new treeNode(60);
        root.right.right = new treeNode(70);

        //lvlwiseWWRec obj = new lvlwiseWWRec();
        //List<Integer> list = obj.printLvlwiseWRec(root);

        //inOrderWRec obj = new inOrderWRec();
        //List<Integer> list = obj.printInOrderWRec(root);

        //preOrderWR obj = new preOrderWR();
        //List<Integer> list = obj.printPreOrderWRec(root);

        postOrderWRec obj = new postOrderWRec();
        List<Integer> list = obj.printPostOrderWRec(root);

        for(int i:list){
            System.out.print(i+" ");
        }
    }
}
