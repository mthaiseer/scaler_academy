package advance.class24_treesI.homework;

import java.util.*;

public class LeftView {

    public ArrayList<Integer> solve(TreeNode A) {

        if(A ==  null){
            return null;
        }

        ArrayList<Integer> res = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();
        queue.addFirst(A);
        queue.addLast(null);

        while (queue.isEmpty()== false){

            int size  = queue.size();
            boolean leftAdded = true;


            for(int j=0; j<size-1; j++){
                TreeNode head  = queue.pop();

                if(leftAdded){
                    res.add(head.val);
                    leftAdded = false;
                }

                if(head.left != null){
                    queue.addLast(head.left);
                }

                if(head.right != null){
                    queue.addLast(head.right);
                }

                if(queue.peek()== null){
                    queue.pop();
                    queue.addLast(null);
                }

            }


            leftAdded = true;
            if(queue.isEmpty()== false && queue.size()==1 && queue.peek()== null){
                queue.pop();
            }

        }
       return res;

    }

    public static void main(String[] args) {


        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        TreeNode eight = new TreeNode(8);

        one.left = two;
        one.right = three;

        two.left = four;
        two.right = five;

        three.left = six;
        three.right = seven;

        four.left = eight;

        List<Integer> res = new LeftView().solve(one);
        System.out.println(res);


    }

}
