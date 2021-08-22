package advance.class12_sortingII.classroom;

public class ReversePairs {

    public int solveBruteForce(int[] A) {
        int cnt =0;

        for(int i=0; i<A.length-1; i++){
            for(int j=i+1; j<A.length; j++){
              if(A[i] >((long)A[j]*2)){
                    cnt++;
                }

            }
        }
        return cnt;
    }

    public int solve(int[] A) {

        int[] res= new int[1];
        int left =0;
        int right = A.length-1;

        sort(A, left, right, res);

        return res[0];
    }


    void sort(int A[], int L, int R,  int[] res){

        if(L == R){
            return;
        }

        int mid = (L+R)/2;
        sort(A, L, mid, res);
        sort(A, mid+1, R, res);

        int left = L;
        int right = mid+1;
        int count =0;

        while(left<=mid){

            if(right<=R &&  (A[left] > ((long)A[right]*2))) {
                count++;
                right++;
            }else{
                res[0]+=count;
                ++left;
            }


        }
        merge(A, L,  R);
    }

    private void merge(int[] A, int L,  int R) {

        int mid = (L + R) / 2;
        int left[] = new int[(mid - L) + 1];
        int right[] = new int[R - (mid)];
        int temp[] = new int[(R - L) + 1];

        int k = 0;
        for (int i = L; i <= mid; i++) {
            left[k] = A[i];
            k++;
        }

        k = 0;
        for (int i = mid + 1; i <= R; i++) {
            right[k] = A[i];
            k++;
        }

        int ptr = 0;
        int i = 0;
        int j = 0;
        int n = left.length;
        int m = right.length;

        while (i < n && j < m) {

            if (left[i] < right[j]) {
                temp[ptr] = left[i];
                i++;
                ptr++;
            } else {

                temp[ptr] = right[j];
                ptr++;
                j++;

            }
        }

        while (i < n) {
            temp[ptr] = left[i];
            ptr++;
            i++;
        }

        while (j < m) {
            temp[ptr] = right[j];
            ptr++;
            j++;
        }

        int l = L;
        for (int p = 0; p < temp.length; p++) {
            A[l] = temp[p];
            l++;
        }
    }

    public static void main(String[] args) {



//        System.out.println(new ReversePairs().solve(new int[]{1, 3, 2, 3, 1}));
//        System.out.println(new ReversePairs().solve(new int[]{4, 1, 2}));
        System.out.println(new ReversePairs().solve(new int[]{2000000000, 2000000000, -2000000000 }));
        System.out.println(new ReversePairs().solveBruteForce(new int[]{2000000000, 2000000000, -2000000000 }));

    }

}
