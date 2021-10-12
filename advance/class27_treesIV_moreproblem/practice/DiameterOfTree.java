package advance.class27_treesIV_moreproblem.practice;

public class DiameterOfTree {

    int diameter = 0;
    public int solve(TreeNode A) {
        diameterHelper(A);
        return diameter;
    }

    int  diameterHelper(TreeNode A){
        if(A == null){
            return -1;
        }

        int L = diameterHelper(A.left);
        int R = diameterHelper(A.right);

        diameter = Math.max(diameter, L+R+2);

        return Math.max(L, R)+1;
    }

    public static void main(String[] args) {

        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);

        one.left = two;
        one.right = three;
        two.left = four;
        two.right = five;


        int  d = new DiameterOfTree().solve(one);
        System.out.println(d);

    }

}
