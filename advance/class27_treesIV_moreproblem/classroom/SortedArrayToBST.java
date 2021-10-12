package advance.class27_treesIV_moreproblem.classroom;

import java.util.List;

public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(final int[] A) {


        return sortedArrayToBSTHelper(A, 0, A.length-1);

    }

    private TreeNode sortedArrayToBSTHelper(int[] A, int start, int end) {

        if(start > end){
            return null;
        }
        int mid = (start+end)/2;
        TreeNode root = new TreeNode(A[mid]);
        root.left = sortedArrayToBSTHelper(A, start, mid-1);
        root.right = sortedArrayToBSTHelper(A, mid+1, end);
        return  root;

    }

    static void  inorder(TreeNode node){

        if(node  == null){
            return;
        }

        inorder(node.left);
        System.out.print(node.val+ " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        int A[] =  {1,2,3,4,5,6};

        TreeNode root = new SortedArrayToBST().sortedArrayToBST(A);
        inorder(root);
    }


}
