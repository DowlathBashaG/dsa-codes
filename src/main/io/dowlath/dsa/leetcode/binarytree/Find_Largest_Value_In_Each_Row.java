package io.dowlath.dsa.leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

public class Find_Largest_Value_In_Each_Row {
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
        TreeNode second = new TreeNode(3);
        TreeNode third = new TreeNode(2);
        TreeNode fourth = new TreeNode(5);
        TreeNode fifth = new TreeNode(3);
        TreeNode sixth = new TreeNode(9);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.right = sixth;

    }

    public List<Integer> largestValue(TreeNode root){
        List<Integer> output = new ArrayList<>();
        helper(root,output,0);
        return output;
    }

    private void helper(TreeNode root, List<Integer> output, int i) {
        if(root == null) return;
        if(i == output.size()){
            output.add(root.data);
        }else{
            output.set(i,Math.max(output.get(i),root.data));
        }
        helper(root.left,output,i+1);
        helper(root.right,output,i+1);
    }

    public static void main(String[] args) {
        Find_Largest_Value_In_Each_Row eachRowLargestValue = new Find_Largest_Value_In_Each_Row();
        List<Integer> largest = eachRowLargestValue.largestValue(eachRowLargestValue.root);
        for(int i : largest){
            System.out.print(i + "  ");
        }

    }
}
