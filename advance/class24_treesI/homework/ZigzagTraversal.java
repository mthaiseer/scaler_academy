package advance.class24_treesI.homework;


import java.util.ArrayList;
import java.util.Stack;

public class ZigzagTraversal {

    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {

        if(A == null){
            return null;
        }

        ArrayList<ArrayList<Integer>> finalRes = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(A);
        int level  =1;

        while(!stack1.isEmpty() || !stack2.isEmpty() ){

            if(level % 2  == 0) {

                ArrayList<Integer> sub = new ArrayList<>();
                while(stack2.isEmpty() == false){
                    TreeNode top = stack2.pop();
                    sub.add(top.val);

                    if(top.right != null){
                        stack1.push(top.right);
                    }
                    if(top.left != null){
                        stack1.push(top.left);
                    }


                }
                finalRes.add(sub);
                level++;

            }else{
                ArrayList<Integer> sub = new ArrayList<>();
                while(stack1.isEmpty() == false){
                    TreeNode top = stack1.pop();
                    sub.add(top.val);

                    if(top.left !=  null){
                        stack2.push(top.left);
                    }
                    if(top.right != null){
                        stack2.push(top.right);
                    }

                }
                finalRes.add(sub);
                level++;
            }
        }
        return finalRes;
    }

    public static void main(String[] args) {

        TreeNode three = new TreeNode(3);
        TreeNode nine = new TreeNode(9);
        TreeNode twenty = new TreeNode(20);
        TreeNode fifteen = new TreeNode(15);
        TreeNode seven  = new TreeNode(7);

        three.left = nine;
        three.right = twenty;
        twenty.left = fifteen;
        twenty.right = seven;

        ArrayList<ArrayList<Integer>> res  = new ZigzagTraversal().zigzagLevelOrder(three);
        System.out.println(res);


    }



}
