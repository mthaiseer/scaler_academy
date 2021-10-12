package advance.class25_treesII.classroom;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


class Pair<U, V> {
    public final U first;
    public final V second;


    private Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }


    public static <U, V> Pair<U, V> of(U a, V b) {
        return new Pair<>(a, b);
    }
}
public class TopView {

    public ArrayList<Integer> solve(TreeNode A) {

        if(A ==  null){
            return null;
        }


        ArrayList<Integer> res = new ArrayList<>();
        Pair<TreeNode, Integer> pair = Pair.of(A, 0);
        ArrayDeque<Pair<TreeNode, Integer>> queue = new ArrayDeque<>();
        queue.addFirst(pair);
        Map<Integer, Integer> map = new HashMap<>();

        while(queue.isEmpty() == false){

            Pair<TreeNode, Integer> p = queue.pop();
            TreeNode head  = p.first;
            Integer level = p.second;

            if(head.left != null){
                queue.addLast(Pair.of(head.left, level+-1));
            }

            if(head.right != null){
                queue.addLast(Pair.of(head.right, level+1));
            }

            if(!map.containsKey(level)){
                map.put(level, head.val);
            }
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            res.add(entry.getValue());
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


        ArrayList<Integer> res = new TopView().solve(one);
        System.out.println(res);
    }

}
