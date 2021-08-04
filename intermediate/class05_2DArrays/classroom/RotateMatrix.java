package intermediate.class05_2DArrays.classroom;

public class RotateMatrix {

    static void transpose(int[][] A){

        for(int i=0; i<A.length; i++){

            for(int j=i; j<A.length; j++){

                swapArray(A, i,j);

            }

        }


    }

    private static void swapArray(int[][] A, int i, int j) {

        int temp = A[i][j];
        A[i][j] = A[j][i];
        A[j][i] = temp;

    }

    public void solve(int[][] A) {
        transpose(A);
        reverse(A);
    }

    private void reverse(int[][] a) {

        for(int i=0;i<a.length; i++){

            int[] inner = a[i];
            int start =0;
            int end = inner.length-1;

            while (start <= end){
                int temp = inner[start];
                inner[start] = inner[end];
                inner[end] = temp;
                start++;
                end--;

            }

        }

    }

    private static void simpleTraversal(int arr[][]){

        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr[i].length; j++){

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
//        int A[][] = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
        int A[][] = {
                {1,2},
                {3,4}
        };
        new RotateMatrix().solve(A);
        simpleTraversal(A);



    }

}
