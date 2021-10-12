package advance.class25_treesII.homework;

public class IdenticalBinaryTree {

    public int isSameTree(TreeNode A, TreeNode B) {

        boolean isSame  =  isSameTreeHealper(A,B);
        return isSame == true? 1: 0;
    }

    private boolean isSameTreeHealper(TreeNode A, TreeNode B) {

        if(A == null && B  == null){
            return true;
        }

        if(A == null || B  == null){
            return false;
        }

        return ((A.val == B.val) && isSameTreeHealper(A.left, B.left) && isSameTreeHealper(A.right , B.right));
    }

    public static void main(String[] args) {

        TreeNode oneA = new TreeNode(1);
        TreeNode twoA = new TreeNode(2);
        TreeNode threeA = new TreeNode(3);

        TreeNode oneB = new TreeNode(1);
        TreeNode twoB = new TreeNode(2);
        TreeNode threeB = new TreeNode(6);

        oneA.left = twoA;
        oneA.right = threeA;

        oneB.left = twoB;
        oneB.right = threeB;

        System.out.println(new IdenticalBinaryTree().isSameTree(oneA, oneB));




    }

}
