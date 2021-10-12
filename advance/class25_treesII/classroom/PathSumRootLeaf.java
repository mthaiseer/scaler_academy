package advance.class25_treesII.classroom;

public class PathSumRootLeaf {


    public int hasPathSum(TreeNode A, int B) {

      return hasPathSumHelper(A, B) == true ? 1: 0;
    }

    public boolean hasPathSumHelper(TreeNode A, int B) {

        if(A == null){
            return false;
        }
        B -=  A.val;
        if(A.left == null && A.right == null){
            if(B == 0){
                return true;
            }
        }
        return hasPathSumHelper(A.left, B) || hasPathSumHelper(A.right, B);

    }

    public static void main(String[] args) {
        TreeNode five = new TreeNode(5);
        TreeNode four = new TreeNode(4);
        TreeNode eight = new TreeNode(8);
        TreeNode eleven = new TreeNode(11);
        TreeNode thirteen = new TreeNode(13);
        TreeNode fourRight = new TreeNode(4);
        TreeNode seven = new TreeNode(7);
        TreeNode two = new TreeNode(2);
        TreeNode one = new TreeNode(1);

        five.left = four;
        five.right = eight;
        four.left = eleven;
        eleven.left = seven;
        eleven.right = two;
        eight.left = thirteen;
        eight.right = fourRight;
        fourRight.right = one;


        System.out.println(new PathSumRootLeaf().hasPathSum(five, 72));

    }


}
