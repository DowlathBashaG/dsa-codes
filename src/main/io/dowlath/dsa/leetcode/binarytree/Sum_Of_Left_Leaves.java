package io.dowlath.dsa.leetcode.binarytree;

public class Sum_Of_Left_Leaves {
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
        TreeNode second = new TreeNode(9);
        TreeNode third = new TreeNode(20);
        TreeNode fourth = new TreeNode(15);
        TreeNode fifth = new TreeNode(7);

        root = first;
        first.left = second;
        first.right = third;
        third.left = fourth;
        third.right = fifth;
    }

    public int sumOfLeftLeaves(TreeNode treeNode){
        if(root == null) return 0;
        int sum = 0;
        if(root.left != null){
            if(root.left.left == null && root.left.right == null){
                sum+=root.left.data;
            }else {
                sum+=sumOfLeftLeaves(root.left);
            }
        }
        sum+=sumOfLeftLeaves(root.right);
        return sum;
    }
    public static void main(String[] args) {
        Sum_Of_Left_Leaves sumOfLeftLeaves = new Sum_Of_Left_Leaves();
        System.out.println("Sum of Left Leaves .... : "+ sumOfLeftLeaves.sumOfLeftLeaves(sumOfLeftLeaves.root));
    }
}
