package advance.class24_treesI.homework;



import java.util.ArrayList;

import java.util.Stack;

public class PreOrderTraversal {


    public ArrayList<Integer> preorderTraversal(TreeNode A) {

        if( A  == null){
            return null;
        }

        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();

        stack.push(A);

        while(stack.isEmpty() == false){

            TreeNode head  = stack.pop();
            res.add(head.val);

            if(head.right != null){
                stack.push(head.right);
            }

            if(head.left != null){
                stack.push(head.left);
            }

        }
        return res;
    }

    public static void main(String[] args) {

        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode six = new TreeNode(6);

        one.left = six;
        one.right = two;
        two.left = three;

        ArrayList res = new PreOrderTraversal().preorderTraversal(one);
        System.out.println(res);


    }

}
