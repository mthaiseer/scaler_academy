package advance.class24_treesI.lab;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class LeftView {

    List<Integer> leftview(TreeNode root) {

        if (root == null) {
            return null;
        }
        List<Integer> res = new ArrayList<>();

        Deque<TreeNode> queue = new ArrayDeque<>();
        TreeNode first = root;
        queue.addFirst(root);

        List<Integer> subList = new ArrayList<>();

        while (queue.isEmpty() == false) {

            TreeNode head = queue.peekFirst();
            int size = queue.size();
            System.out.println("size "+ size);

            for (int i = 0; i < size; i++) {

                if (i == 0) {
                    res.add(queue.peekFirst().val);
                }

                if (head.left != null) {
                    queue.addLast(head.left);
                }

                if (head.right != null) {
                    queue.addLast(head.right);
                }
                queue.removeFirst();

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

        one.left = two;
        one.right = three;
        two.left = four;
        two.right = five;
        three.left = six;
        four.right = seven;

        List<Integer> lists = new LeftView().leftview(one);
        System.out.println(lists);
    }

}
