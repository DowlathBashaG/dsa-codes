package io.dowlath.dsa.leetcode.binarytree;

public class ValidBinaryTreeOrNot {
    private TreeNode root;
    public class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public void insert(int data){
        insert(root,data);
    }

    public TreeNode insert(TreeNode root , int value){
        if(root == null){  // base case
            root = new TreeNode(value);
            return root;
        }
        if(value < root.data){
            root.left = insert(root.left,value);
        }else{
            root.right = insert(root.right,value);
        }
        return root;
    }

    public boolean isValid(TreeNode root,long min,long max){
        if(root == null){ //base case
            return true;
        }
        if(root.data <= min || root.data >= max){
            return false;
        }
        boolean left = isValid(root.left,min,root.data);
        if(left){
            boolean right = isValid(root.right , root.data ,max);
            return right;
        }
        return false;
    }
    public static void main(String[] args) {
        ValidBinaryTreeOrNot vbt = new ValidBinaryTreeOrNot();
        vbt.insert(6);
        vbt.insert(4);
        vbt.insert(2);
        vbt.insert(8);
        vbt.insert(8);
        vbt.insert(7);
        vbt.insert(9);
        long min = Integer.MIN_VALUE;
        long max = Integer.MAX_VALUE;
        if(vbt.isValid(vbt.root, min,max)){
            System.out.println("It is valid binary search tree");
        } else {
            System.out.println("It is not valid binary search tree");
        }
    }
}
