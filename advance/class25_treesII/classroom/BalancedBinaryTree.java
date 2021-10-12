package advance.class25_treesII.classroom;

public class BalancedBinaryTree {

    boolean isBalanced = true;
    public int isBalanced(TreeNode A) {
        isBalancedHelper(A);
        return isBalanced == true ? 1: 0;
    }

    private int  isBalancedHelper(TreeNode A ) {

        if(A ==  null){
            return -1;
        }

        int l  = isBalancedHelper(A.left);
        int r  = isBalancedHelper(A.right);

        if(Math.abs(l -  r ) > 1){
            this.isBalanced = false;
        }

        return Math.max(l, r)+1;
    }

    public static void main(String[] args) {

        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        //TreeNode six = new TreeNode(6);

        one.left = two;
        two.left = three;

        int res = new BalancedBinaryTree().isBalanced(one);
        System.out.println(res);

    }

}
