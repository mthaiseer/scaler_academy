package advance.class25_treesII.homework;

import java.util.ArrayDeque;
import java.util.Deque;

public class OddEvenLevelSumDiff {


    public int solve(TreeNode A) {

        if(A == null){
            return 0;
        }
        int evenSum =0;
        int oddSum =0;

        Deque<TreeNode> queue  = new ArrayDeque<>();
        queue.addFirst(A);
        int level =1;

        while(queue.isEmpty() == false){

            int size = queue.size();
            for (int i=0; i<size; i++){

                TreeNode head = queue.removeFirst();
                if(level% 2 == 0){

                    evenSum+= head.val;

                }else{
                    oddSum+=head.val;
                }

                if(head.left!= null){
                    queue.addLast(head.left);
                }

                if(head.right != null){
                    queue.addLast(head.right);
                }
            }

            level++;



        }

        return oddSum - evenSum;
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


        int x = new OddEvenLevelSumDiff().solve(one);
        System.out.println(x);


    }


}
