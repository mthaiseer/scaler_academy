package advance.class11_sortingI.classroom;

public class InversionCount {

    public int solve(int[] A) {

        int M  = 1000000007;
        int L =0;
        int R= A.length-1;
        return inversionCount(A, L, R, M);
    }

    private int  inversionCount(int A[], int L, int R, int M) {

        if(L == R){
            return 0;
        }

        int count =0;

        int mid = (L+R)/2;
        count=   (count %M + inversionCount(A, L, mid, M)%M)%M;
        count=    (count %M + inversionCount(A, mid+1, R, M)%M)%M;
        count = (count % M + merge(A, L,  R)%M)%M;

        return count %M ;

    }

    private int merge(int[] A, int L,  int R) {

        int count =0;
        int mid  = (L+R)/2;
        int left[]= new int[(mid-L)+1];
        int right[]= new int[R - (mid)];
        int temp[] = new int[(R-L)+1];

        int k =0;
        for(int i=L; i<=mid; i++){
            left[k] = A[i];
            k++;

        }

        k =0;
        for(int i= mid+1; i<=R; i++){
            right[k] = A[i];
            k++;
        }

        int ptr =0;
        int i=0; int j=0;
        int n = left.length;
        int m = right.length;

        while(i< n && j <m){

            if(left[i] <= right[j]){
                temp[ptr] = left[i];
                i++;
                ptr++;
                count+=j;
            }else{

                temp[ptr] = right[j];
                ptr++;
                j++;

            }
        }

        while(i < n){
            temp[ptr] = left[i];
            ptr++;
            i++;
            count+=j;
        }

        while(j < m){
            temp[ptr] = right[j];
            ptr++;
            j++;
        }

        int l = L;
        for(int p=0; p<temp.length; p++){
            A[l] = temp[p];
            l++;
        }

        return count;
    }


    public static void main(String[] args) {
//        System.out.println(new InversionCount().solve(new int[] {3,2,1}));
//        System.out.println(new InversionCount().solve(new int[] {1,2,3}));
        System.out.println(new InversionCount().solve(new int[]{4, 5, 1, 2, 7, 3}));
        System.out.println(new InversionCount().solve(new int[]{5,1,3,6,4,2}));
   }

}
