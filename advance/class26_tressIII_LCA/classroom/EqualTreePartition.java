package advance.class26_tressIII_LCA.classroom;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class EqualTreePartition {

    public int solve(TreeNode A) {

        TreeNode tempRoot = A;
        Map<Integer, Integer> map = new HashMap();
        int sum  =  findSum(tempRoot, map);
         return checkResult(sum, map) ? 1: 0;
    }

    boolean checkResult(int sum, Map<Integer, Integer> map ){
        if (sum == 0) {
            return map.getOrDefault(sum, 0) >= 2;
        }

        return sum % 2 == 0 ? map.containsKey(sum / 2) : false;
    }

    private int findSum(TreeNode node,Map<Integer, Integer> map ) {

        if(node  == null){
            return 0;
        }

        int sum = node.val +  findSum(node.left, map)+ findSum(node.right, map);
        map.put(sum, map.getOrDefault(sum, 0) + 1);

        return sum;


    }

    public static void main(String[] args) {

//        TreeNode v15 = new TreeNode(15);
//        TreeNode v20 = new TreeNode(20);
//        TreeNode v1 = new TreeNode(1);
//        TreeNode v3 = new TreeNode(3);
//        TreeNode v10 = new TreeNode(10);
//        TreeNode v9 = new TreeNode(9);
//        TreeNode v20R = new TreeNode(20);
//
//        v15.left = v20;
//        v15.right = v10;
//
//        v20.left = v1;
//        v20.right = v3;
//
//        v10.left = v9;
//        v10.right = v20R;

        //TreeNode v11 = new TreeNode(11);
        TreeNode vNeg8L = new TreeNode(-8);
        TreeNode v3 = new TreeNode(3);
        TreeNode v9 = new TreeNode(9);
        TreeNode vNeg8R = new TreeNode(-8);
        TreeNode v4 = new TreeNode(4);

        vNeg8L.left = v3;
        vNeg8L.right = v9;
        v3.left = vNeg8R;
        v3.right = v4;






       // System.out.println(new EqualTreePartition().solve(v15));
        System.out.println(new EqualTreePartition().solve(vNeg8L));



    }

}
