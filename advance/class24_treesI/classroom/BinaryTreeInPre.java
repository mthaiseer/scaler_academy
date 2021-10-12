package advance.class24_treesI.classroom;

public class BinaryTreeInPre {

    int preLevel = 0;
    public TreeNode buildTree(int[] A, int[] B) {

        if(A == null || B == null){
            return null;
        }

        return buildTreeHelper(A, B, 0, A.length-1);


    }

    private TreeNode buildTreeHelper(int[] pre, int[] in, int start, int end) {

        if(start > end){
            return null;
        }


        TreeNode root = new TreeNode(pre[preLevel]);
        preLevel++;

        int inIndex = 0;
        for(int i=start; i<=end; i++){

            if(in[i] == root.val){
                inIndex = i;
                break;
            }



        }
        root.left = buildTreeHelper(pre, in, start, inIndex-1);
        root.right = buildTreeHelper(pre,in, inIndex+1, end);
        return root;

    }

    static void inOrderTraversal(TreeNode node){
        if(node ==  null){
            return;
        }

        inOrderTraversal(node.left);
        System.out.print(node.val+  " ");
        inOrderTraversal(node.right);
    }

    public static void main(String[] args) {
        TreeNode root  = new BinaryTreeInPre().buildTree(new int[]{1, 6, 2, 3},  new int[]{6, 1, 3, 2});
        inOrderTraversal(root);


    }

}
