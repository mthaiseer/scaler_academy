package advance.class25_treesII.classroom;

import java.util.concurrent.atomic.AtomicInteger;

public class KthSmallest {

    int ans = Integer.MAX_VALUE;
    public int kthsmallest(TreeNode A, int B) {

        return kthsmallestHelper(A, new AtomicInteger(B));

    }

    private int  kthsmallestHelper(TreeNode A, AtomicInteger B) {

        if(A == null){
            return Integer.MAX_VALUE;
        }

        int left  = kthsmallestHelper(A.left, B);
        if(left != Integer.MAX_VALUE){
            return left;
        }

        if(B.decrementAndGet() == 0){
            return A.val;
        }
        return kthsmallestHelper(A.right, B);
    }

    public static void main(String[] args) {

        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        //TreeNode six = new TreeNode(6);

        two.left = one;
        two.right = three;

        System.out.println(new KthSmallest().kthsmallest(two, 2));

    }

}
