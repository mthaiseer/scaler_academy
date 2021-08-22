package advance.class13_searching01.classroom;

public class SortedInsertPosition {

    public int searchInsert(int[] A, int B) {

        int N = A.length-1;
        if(A.length == 1){
            return 0;
        }

        if(B <A[0]  ){
            return 0;
        }

        if(B > A[N]){
            return N+1;
        }

        int low =0;
        int high = N;

        while (low<= high){

            int mid = (low+high)/2;

            if(A[mid] == B){
                return mid;
            }else if(B> A[mid]){

                low = mid+1;

            }else{
                high = mid-1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        System.out.println(new SortedInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(new SortedInsertPosition().searchInsert(new int[]{1}, 1));
        System.out.println(new SortedInsertPosition().searchInsert(new int[]{1,2,4,5,8}, 6));
        System.out.println(new SortedInsertPosition().searchInsert(new int[]{1,2,4,5,8}, 10));
    }


}
