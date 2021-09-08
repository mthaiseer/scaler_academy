package advance.class13_searching01.homework;

public class MatrixSearch {

    public int searchMatrix(int[][] A, int B) {

        if(A == null || A.length ==0){
            return 0;
        }

        int M = A.length;
        int N = A[0].length;

        int start =0;
        int end = (M*N)-1;

        while(start<=end){

            int mid = (start+end)/2;
            int i = mid/N;
            int j = mid%N;

            if(A[i][j] == B){
                return 1;
            }else if(A[i][j] > B){
                end  = mid-1;
            }else{
                start = mid+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int A[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {8, 9, 10, 11},
        };

        System.out.println(new MatrixSearch().searchMatrix(A, 100));
    }


}
