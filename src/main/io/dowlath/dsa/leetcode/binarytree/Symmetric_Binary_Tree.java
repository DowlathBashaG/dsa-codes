package io.dowlath.dsa.leetcode.binarytree;

/*
      Symmentric Binary Tree :

             1
           2   2
         3  4 4  3

      Not Symmentrci Binary Tree :

             1
           2   2
             3   3

 */
public class Symmetric_Binary_Tree {
    private TreeNode root;
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){

        }
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val,TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public void createBinaryTree() {
        // isSymmetric
        /*
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(2);
        TreeNode fourth = new TreeNode(3);
        TreeNode fifth = new TreeNode(4);
        TreeNode sixth = new TreeNode(4);
        TreeNode seventh = new TreeNode(3);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
        */

        // Not Symmentric
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(2);
        //TreeNode fourth = new TreeNode(3);
        TreeNode fifth = new TreeNode(3);
        //TreeNode sixth = new TreeNode(4);
        TreeNode seventh = new TreeNode(3);
        root = first;
        first.left = second;
        first.right = third;
        //second.left = fourth;
        second.right = fifth;
       // third.left = sixth;
        third.right = seventh;

    }

    // Important methods.....below two methods.

    public boolean isSymmertric(TreeNode root){
        if(root == null) return true;
        return helper(root.left,root.right);
    }

    public boolean helper(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        return helper(left.left,right.right) && helper(left.right,right.left);
    }
    public static void main(String[] args) {
        Symmetric_Binary_Tree sbt = new Symmetric_Binary_Tree();
        sbt.createBinaryTree();
        if(sbt.isSymmertric(sbt.root)){
            System.out.println("It is Symmentric Binary Tree");
        } else {
            System.out.println("It is not Symmentric Binary Tree");
        }
    }
}
