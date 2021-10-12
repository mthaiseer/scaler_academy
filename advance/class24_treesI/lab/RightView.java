package advance.class24_treesI.lab;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class RightView {

    List<List<Integer>> rightView(TreeNode root){

        if(root  == null){
            return null;
        }
        List<List<Integer>> res = new ArrayList<>();

        Deque<TreeNode> queue  = new ArrayDeque<>();
        TreeNode last = root;
        queue.addFirst(root);

        List<Integer> subList = new ArrayList<>();

        while(queue.isEmpty()== false){

            TreeNode head = queue.removeFirst();


            if(head.left != null){
                queue.addLast(head.left);
            }

            if(head.right != null){
                queue.addLast(head.right);
            }

            if(last ==  head){
                subList.add(head.val);
                res.add(new ArrayList<>(subList));
                subList.clear();
                last = queue.peekLast();
            }
        }
        return  res;
    }

    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);

        one.left = two;
        one.right = three;
        two.left = four;
        two.right = five;
        three.left = six;

        List<List<Integer>> lists = new RightView().rightView(one);
        System.out.println(lists);
    }
}
