package advance.class24_treesI.classroom;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class LevelOrder {

    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {

        if(A  == null){
            return null;
        }
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.addLast(A);

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        while(queue.isEmpty() == false){

            ArrayList<Integer> subList = new ArrayList<>();
            int size = queue.size();


            for(int i=0; i<size; i++){

                TreeNode t = queue.removeFirst();
                subList.add(t.val);
                if(t.left != null){
                    queue.addLast(t.left);
                }

                if(t.right != null){
                    queue.addLast(t.right);
                }
            }

            if(subList.size()> 0){
                res.add(subList);
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

        ArrayList<ArrayList<Integer>> res = new LevelOrder().levelOrder(one);
        System.out.println(res);

    }

}
