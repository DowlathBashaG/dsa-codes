package io.dowlath.dsa.leetcode.binarytree;

import java.util.Stack;

public class Flatten_Binary_Tree {
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
        TreeNode third = new TreeNode(5);
        TreeNode fourth = new TreeNode(3);
        TreeNode fifth = new TreeNode(4);
        TreeNode sixth = new TreeNode(6);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.right = sixth;
    }

    public void flatten(TreeNode root){
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode current = stack.pop();
            if(current.right != null) stack.push(current.right);
            if(current.left != null) stack.push(current.left);
            current.left = null;
            if(!stack.isEmpty()) current.right = stack.peek();
        }
    }
    public static void main(String[] args) {
        Flatten_Binary_Tree flattenBinaryTree = new Flatten_Binary_Tree();
        flattenBinaryTree.createBinaryTree();
        flattenBinaryTree.flatten(flattenBinaryTree.root);
    }
}
