package io.dowlath.dsa.leetcode.binarytree;

/*

           I/P :

                          4
                       2      7
                     1   3   6  9

           O/P :

                         4
                      7      2
                   9    6  3   1

 */

public class Invert_Tree {
    private TreeNode root;

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {

        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public void createBinaryTree() {
        // Invert Tree
        TreeNode first = new TreeNode(4);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(7);
        TreeNode fourth = new TreeNode(1);
        TreeNode fifth = new TreeNode(3);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(9);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
    }

    public TreeNode invertTree(TreeNode root){

        if(root == null) return null;

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }


    public static void main(String[] args) {
     Invert_Tree it = new Invert_Tree();
     it.invertTree(it.root);

    }

}


