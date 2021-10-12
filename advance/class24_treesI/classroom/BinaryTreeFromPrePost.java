package advance.class24_treesI.classroom;

import java.util.HashMap;
import java.util.Map;

public class BinaryTreeFromPrePost {

    public TreeNode buildTree(int[] A, int[] B) {

        Map<Integer, Integer> indexMap = new HashMap<>();
        for(int i=0; i<A.length; i++){

            indexMap.put(A[i], i);

        }
        TreeNode root = null;
        return  buildTreeHelper(A, B, 0, A.length-1, B.length-1, indexMap,  root);
    }

    private TreeNode buildTreeHelper(int[] A, int[] B, int start, int end, int pos, Map<Integer, Integer> indexMap,  TreeNode root) {



        if(start > end) return null;

        root = new TreeNode(B[pos]);
        int idx = indexMap.get(B[pos]);

        root.left = buildTreeHelper(A, B, start, idx -1,((pos-1) - (end- idx)), indexMap, root);
        root.right =  buildTreeHelper(A, B, idx+1,end,pos-1, indexMap, root);
        return root;
    }

    static  void inorder(TreeNode root){
        if(root == null) return;
        System.out.print(root.val + " ");
        inorder(root.left);
        inorder(root.right);
    }

    public static void main(String[] args) {

        int A[] =  {4,2,7,5,1,3,6};
        int B[] =  {4,7,5,2,6,3,1};

        TreeNode root = new BinaryTreeFromPrePost().buildTree(A, B);
        inorder(root);


    }

}
