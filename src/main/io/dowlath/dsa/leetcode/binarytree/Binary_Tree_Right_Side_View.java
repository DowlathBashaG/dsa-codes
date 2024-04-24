package io.dowlath.dsa.leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

/*
      O/P :  [1, 3, 4]
 */
public class Binary_Tree_Right_Side_View {
    private TreeNode root;

    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data; // Generic Type

        public TreeNode(int data){
            this.data = data;
        }

    }
    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(0);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(0);
        TreeNode seventh = new TreeNode(4);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;


    }
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> output = new ArrayList<>();
        if(root == null) return output;
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        while(!list.isEmpty()){
            int n = list.size();
            output.add(list.get(0).data);
            while( n> 0){
                TreeNode current = list.get(0);
                list.remove(0);
                if(current.right != null) list.add(current.right);
                if(current.left != null) list.add(current.left);
                n--;
            }
        }
        return output;
    }
    public static void main(String[] args) {
        Binary_Tree_Right_Side_View rightSideView = new Binary_Tree_Right_Side_View();
        rightSideView.createBinaryTree();
        List<Integer> res = rightSideView.rightSideView(rightSideView.root);
        System.out.println(res);
    }
}
