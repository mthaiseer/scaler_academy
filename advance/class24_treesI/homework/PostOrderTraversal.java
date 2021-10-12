package advance.class24_treesI.homework;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class PostOrderTraversal {

    public ArrayList<Integer> postorderTraversal(TreeNode A) {

        if(A  == null){
            return null;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(A);
        ArrayList<Integer> data = new ArrayList<>();

        while(stack.isEmpty() == false){

           TreeNode head  = stack.pop();
           data.add(head.val);

            if(head.left != null){
                stack.push(head.left);
            }

            if(head.right!= null){
                stack.push(head.right);
            }

        }

        Collections.reverse(data);
        return data;
    }

    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode six = new TreeNode(6);

        one.left = six;
        one.right = two;
        two.left = three;

        ArrayList<Integer> res = new PostOrderTraversal().postorderTraversal(one);
        System.out.println(res);

    }

}
