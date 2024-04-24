package io.dowlath.dsa.leetcode.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/*
        Is it completeness... : true
 */
public class Check_Completeness_Of_A_Binary_Tree {
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
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;

    }

    public boolean isCompleteTree(TreeNode root){
        boolean last = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            if(current == null) last = true;
            else{
                if(last) return false;
                queue.add(current.left);
                queue.add(current.right);
            }
        } return true;
    }
    public static void main(String[] args) {
        Check_Completeness_Of_A_Binary_Tree completeness = new Check_Completeness_Of_A_Binary_Tree();
        completeness.createBinaryTree();
        System.out.println("Is it completeness... : "+ completeness.isCompleteTree(completeness.root));
    }
}
