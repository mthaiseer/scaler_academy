package advance.class26_tressIII_LCA.classroom;

public class LCA {

    public int lca(TreeNode A, int B, int C) {


        int x = findNode(A, B);
        int y = findNode(A, C);

        if (x == -1 || y == -1) {
            return -1;
        }

        TreeNode node = lcaHelper(A, B, C);
        return node.val;


    }

    private TreeNode lcaHelper(TreeNode root, int B, int C) {

        if (root == null) {
            return null;
        }

        if (root.val == B || root.val == C) {
            return root;
        }

        TreeNode L = lcaHelper(root.left, B, C);
        TreeNode R = lcaHelper(root.right, B, C);

        if (L != null && R != null) {
            return root;
        }

        return L != null ? L : R;
    }

    public int findNode(TreeNode root, int val) {

        if (root == null) {
            return -1;
        }

        if (root.val == val) {
            return 1;
        }

        int left = findNode(root.left, val);
        if (left == 1) {
            return 1;
        }
        return findNode(root.right, val);
    }

    public static void main(String[] args) {

        TreeNode v15 = new TreeNode(15);
        TreeNode v12 = new TreeNode(12);
        TreeNode v9 = new TreeNode(9);
        TreeNode v11 = new TreeNode(11);
        TreeNode v3 = new TreeNode(3);
        TreeNode v6 = new TreeNode(6);
        TreeNode v1 = new TreeNode(1);
        TreeNode v4 = new TreeNode(4);
        TreeNode v7 = new TreeNode(7);
        TreeNode v8 = new TreeNode(8);
        TreeNode v10 = new TreeNode(10);

        v15.left = v12;
        v15.right = v9;
        v12.left = v11;
        v12.right = v3;
        v11.left = v1;
        v11.right = v4;
        v3.left = v7;
        v9.right = v6;
        v6.left = v8;
        v6.right = v10;

        System.out.println(new LCA().lca(v15, 9, 3));


    }

}
