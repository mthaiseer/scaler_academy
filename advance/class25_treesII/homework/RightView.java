package advance.class25_treesII.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class RightView {

    public ArrayList<Integer> solve(TreeNode A) {

        if(A == null){
            return null;
        }

        ArrayList<Integer> res = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.addLast(A);
        TreeNode last = A;

        while(queue.isEmpty() == false){

            int size = queue.size();

            for(int i=0; i<size; i++){
                TreeNode head = queue.pop();

                if(head.left != null){
                    queue.addLast(head.left);
                }
                if(head.right != null){
                    queue.addLast(head.right);
                }

                if(last == head){
                    res.add(head.val);
                    last = queue.peekLast();
                }
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

        ArrayList<Integer> res = new RightView().solve(one);
        System.out.println(res);

    }

}
