package io.dowlath.dsa.leetcode.binarytree;

public class Searc_In_A_Binary_Search_Tree {
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

    public TreeNode searchBST (TreeNode root , int val){
        if(root == null) return null;
        if(root.data == val) return root;
        if(root.data > val){
           // System.out.println(root.data+" ");
            return searchBST(root.left,val);
        } else{
          //  System.out.println(root.data+" ");
            return searchBST(root.right,val);
        }
    }

    public static void main(String[] args) {
        Searc_In_A_Binary_Search_Tree searcInABinarySearchTree = new Searc_In_A_Binary_Search_Tree();
        searcInABinarySearchTree.createBinaryTree();
        searcInABinarySearchTree.searchBST(searcInABinarySearchTree.root,2);
    }
}
