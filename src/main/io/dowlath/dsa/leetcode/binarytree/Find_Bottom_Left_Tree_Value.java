package io.dowlath.dsa.leetcode.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class Find_Bottom_Left_Tree_Value {
    private TreeNode root;
    public class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data = data;
        }
    }
    public void createBinaryTree(){
        TreeNode first = new TreeNode(2);
        TreeNode second = new TreeNode(1);
        TreeNode third = new TreeNode(3);
       /* TreeNode fourth = new TreeNode(5);
        TreeNode fifth = new TreeNode(3);
        TreeNode sixth = new TreeNode(9);*/
        root = first;
        first.left = second;
        first.right = third;
       /* second.left = fourth;
        second.right = fifth;
        third.right = sixth;*/

    }

    public int findBottomLeftValue(TreeNode root){
      Queue<TreeNode> queue = new LinkedList<>();
      queue.add(root);
      while(!queue.isEmpty()){
          root = queue.poll();
          if(root.right != null) queue.add(root.right);
          if(root.left !=null) queue.add(root.left);
      }

        return root.data;
    }
    public static void main(String[] args) {
        Find_Bottom_Left_Tree_Value bottomLeftTreeValue = new Find_Bottom_Left_Tree_Value();
        bottomLeftTreeValue.createBinaryTree();
        System.out.println(bottomLeftTreeValue.findBottomLeftValue(bottomLeftTreeValue.root));
    }
}
