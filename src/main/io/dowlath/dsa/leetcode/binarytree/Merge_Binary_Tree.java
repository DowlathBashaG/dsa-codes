package io.dowlath.dsa.leetcode.binarytree;

/*
                 Tree 1                           Tree 2

                    1                               2
                3       2                     1           3

            5                                     4           7

                             Merged Tree

                                3
                           4         5

                       5      4    7


 */

public class Merge_Binary_Tree {
    private TreeNode root;

    public class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }

        TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public void createBinaryTree_1() {
        // Tree_1

        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(3);
        TreeNode third = new TreeNode(2);
        TreeNode fourth = new TreeNode(5);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
    }

    public void createBinaryTree_2() {
        // Tree_2

        TreeNode first = new TreeNode(2);
        TreeNode second = new TreeNode(1);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(7);
        root = first;
        first.left = second;
        first.right = third;
        second.right = fourth;
        third.right = fifth;
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2){

        if(t1 == null && t2 == null) return null;
        if(t1 == null) return t2;
        if(t2 == null) return t1;

        TreeNode output = new TreeNode(t1.data+t2.data);
        output.left = mergeTrees(t1.left, t2.left);
        output.right = mergeTrees(t1.right,t2.right);
        return output;
    }
    public static void main(String[] args) {
      Merge_Binary_Tree mbt1 = new Merge_Binary_Tree();
      mbt1.createBinaryTree_1();
      Merge_Binary_Tree mbt2 = new Merge_Binary_Tree();
      mbt2.createBinaryTree_2();
      TreeNode result = mbt1.mergeTrees(mbt1.root,mbt2.root);
    }
}
