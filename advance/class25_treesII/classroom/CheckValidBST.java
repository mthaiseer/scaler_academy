package advance.class25_treesII.classroom;

public class CheckValidBST {

    public int isValidBST(TreeNode A) {

        return isBSTValidUtil(A, Integer.MIN_VALUE, Integer.MAX_VALUE)? 1: 0;

    }

    boolean isBSTValidUtil(TreeNode node, int min, int max)  {
        if (node == null)
            return true;

        if (node.val < min || node.val > max)
            return false;


        return (isBSTValidUtil(node.left, min, node.val-1) &&
                isBSTValidUtil(node.right, node.val+1, max));
    }

    public static void main(String[] args) {

        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(0);
        TreeNode three = new TreeNode(3);


        one.left = two;
        one.right = three;

        System.out.println(new CheckValidBST().isValidBST(one));

    }



}
