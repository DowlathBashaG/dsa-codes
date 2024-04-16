package io.dowlath.dsa.leetcode.binarytree;


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/*

          PreOrder =>
                        root -> left -> right
          InOrder  =>
                        left -> root -> right

          PostOrder =>  left -> right -> root

 */
public class BinaryTree {
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
       /* TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);

        root = first;   // root -> first
        first.left = second;
        first.right = third;  // second <- first -> third

        second.left = fourth;*/

        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;

        /*TreeNode first = new TreeNode(6);
        TreeNode second = new TreeNode(4);
        TreeNode third = new TreeNode(10);
        TreeNode fourth = new TreeNode(2);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(8);
        TreeNode seventh = new TreeNode(12);

        root = first;    // root -> first
        first.left = second;
        first.right = third;  // second -> root -> third

        second.left = fourth;
        second.right = fifth;

        third.left = sixth;
        third.right = seventh;*/
    }
      // Use case : Recursive
   /*  public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    */

    // Use case : iterative
    public void preOrder(){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data+" ");
            if(temp.right != null){
                stack.push(temp.right);
            }
            if(temp.left != null){
                stack.push(temp.left);
            }
        }
    }

    // Recursive
   /* public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);
    }*/

    //Iterative
    public void inOrder(){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp != null){
            if(temp != null){
                stack.push(temp);
                temp = temp.left;
            } else{
                temp = stack.pop();
                System.out.print(temp.data+ " ");
                temp = temp.right;
            }
        }
    }

    // Recursive
   public void postOrder(TreeNode root){
       if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + "  ");
    }

    // Iterative  ( some issue are there, right now ignore this method use recursive )
    /*public void postOrder(){
        if(root == null){
            return;
        }
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty() || current != null){
            if(current != null)
            {
                stack.push(current);
                current = current.left;
            }
            else
            {
                TreeNode temp = stack.peek().right;
                if(temp == null)
                {
                    temp = stack.pop();
                    System.out.print(temp.data+"  ");
                    while(stack.isEmpty() && temp == stack.peek().right){
                        temp = stack.pop();
                        System.out.print(temp.data+"  ");
                    }
             }
             else
             {
                current = temp;
             }
           }
        }
    }*/

    public void levelOrder(){
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
            if(temp.left != null){
                queue.offer(temp.left);
            }
            if(temp.right != null){
                queue.offer(temp.right);
            }
        }

    }
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        // bt.preOrder(bt.root); // 9 2 4 3
        // bt.preOrder();  // 9 2 4 3
        // bt.inOrder(bt.root); //4 2 9 3
       // bt.inOrder(); // 4 2 9 3
        //bt.postOrder(bt.root);  // 4  2  3  9
        //bt.postOrder();
        bt.levelOrder();


    }
}
