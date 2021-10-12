package advance.class25_treesII.classroom;

public class InvertedBinaryTree {

    public TreeNode invertTree(TreeNode A) {
        if(A  == null){
            return A;
        }

        TreeNode left = A.left;
        TreeNode right = A.right;

        A.left = right;
        A.right = left;

       invertTree(A.left);
       invertTree(A.right);


        return A;
    }

//    public TreeNode invertTree(TreeNode A) {
//        if(A  == null){
//            return A;
//        }
//        TreeNode left =  invertTree(A.left);
//        TreeNode right = invertTree(A.right);
//        A.left = right;
//        A.right = left;
//
//        return A;
//    }

    static  void inorder(TreeNode n){

        if(n  == null) return;


        inorder(n.left);
        System.out.print(n.val + " ");
        inorder(n.right);

    }


    public static void main(String[] args) {


        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);


        one.left = two;
        one.right = three;

        inorder(one);
        TreeNode A = new InvertedBinaryTree().invertTree(one);
        System.out.println();
        inorder(A);

    }

}
