package advance.class13_searching01.classroom;

public class PeakElement {


    public int solve(int[] A) {

        int N = A.length;

        if(A.length ==1){
            return A[0];
        }
        //if peak at left end
        if(A[0] >= A[1]){
            return A[0];
        }
        //if peak at right
        if(A[N-1] >= A[N-2]){
            return A[N-1];
        }

        int start =0;
        int end = N-1;


        while(start <= end){

            int mid = (start+ end)/2;

            //if not peak and which element greater than peak, move to that side
            if(A[mid]> A[mid-1]&& A[mid]> A[mid+1]){
                return A[mid];
            }else if(A[mid]<A[mid+1]){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }

        return -1;


    }

    public static void main(String[] args) {
        System.out.println(new PeakElement().solve(new int[]{1, 2, 3, 4, 5}));
        System.out.println(new PeakElement().solve(new int[]{5, 17, 100, 11}));
        System.out.println(new PeakElement().solve(new int[]{1, 1000000000, 1000000000}));
    }

}
