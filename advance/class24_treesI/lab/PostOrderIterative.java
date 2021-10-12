package advance.class24_treesI.lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PostOrderIterative {


    List<Integer> postOrder(TreeNode node){

        if(node  == null){
            return null;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        List<Integer> data = new ArrayList<>();

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
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);

        six.left = three;
        six.right = five;
        five.left = four;
        three.left = one;
        three.right = two;

        List<Integer> res = new PostOrderIterative().postOrder(six);
        System.out.println(res);


    }


}
