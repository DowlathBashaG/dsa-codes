package io.dowlath.dsa.leetcode.binarytree;

/*
      O/P :  Is it univalued binary tree... : true
 */
public class Univalued_Binary_Tree {
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
        TreeNode second = new TreeNode(1);
        TreeNode third = new TreeNode(1);
        TreeNode fourth = new TreeNode(1);
        TreeNode fifth = new TreeNode(1);

        root = first;
        first.left = second;
        first.right = third;
        third.left = fourth;
        third.right = fifth;
    }

    public boolean isUnivaluedTree(TreeNode root){
        if(root == null) return true;
        return helper(root,root.data);
    }
    public boolean helper(TreeNode node,int val){
        if(node == null) return true;
        if(node.data != val) return false;
        return helper(node.left,val) && helper(node.right,val);
    }
    public static void main(String[] args) {
        Univalued_Binary_Tree binaryTree = new Univalued_Binary_Tree();
        binaryTree.createBinaryTree();
        System.out.println("Is it univalued binary tree... : "+ binaryTree.isUnivaluedTree(binaryTree.root));
    }
}
