package io.dowlath.dsa.leetcode.binarytree;

/*
          O/P :  2
 */
public class Distribute_Coin {
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
        TreeNode first = new TreeNode(3);
        TreeNode second = new TreeNode(0);
        TreeNode third = new TreeNode(0);

        root = first;
        first.left = second;
        first.right = third;

    }

    public int distributeCoins(TreeNode root){
     return helper(root,null);
    }
    public int helper(TreeNode node,TreeNode parent){
        if(node == null) return 0;

        int left = helper(node.left,node);
        int right = helper(node.right,node);

        if(parent !=null && node.data != 1){
            parent.data = parent.data + node.data - 1;
        }
        return left + right + Math.abs(1-node.data);
    }

    public static void main(String[] args) {
        Distribute_Coin distributeCoin = new Distribute_Coin();
        distributeCoin.createBinaryTree();
        System.out.println(distributeCoin.distributeCoins(distributeCoin.root));
    }
}
