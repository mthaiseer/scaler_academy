package advance.class13_searching01.homework;

public class SingleElementInSortedArray {

    public int solve(int[] A) {

        int N = A.length-1;
        int result =0;
        if(A.length ==1){
            return A[0];
        }

        if(A[0] != A[1]){
            return A[0];
        }

        if(A[N] != A[N-1]){
            return A[N];
        }

        int start = 0;
        int end = N-1;

        while(start<=end){

            int mid = (start+end)/2;

            if(A[mid] != A[mid-1] && A[mid]!= A[mid+1]){
                return A[mid];
            }

            if((mid % 2 == 0 && A[mid] == A[mid+1] )|| (mid % 2 != 0 && A[mid] == A[mid-1] ) ){

                start = mid+1;
            }else{
                end = mid-1;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new SingleElementInSortedArray().solve(new int[] {1,1,2,2,3,4,4}));
    }

}
