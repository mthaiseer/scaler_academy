package advance.class24_treesI.lab;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class InOrderTraversal {


    public int[] inorderTraversal(TreeNode A ) {
        if (A == null){
            return null;
        }
        List<Integer> result  = new ArrayList<>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode curr = A;
        while (curr != null || s.size() > 0) {


            while (curr != null) {
                s.push(curr);
                curr = curr.left;
            }


            curr = s.pop();
            result.add(curr.val);
            curr = curr.right;
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);

        one.right = two;
        two.left = three;


        int[] res = new InOrderTraversal().inorderTraversal(one);

        for(int x: res){
            System.out.println(x+ " ");
        }

    }

}
