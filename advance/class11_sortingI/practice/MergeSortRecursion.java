package advance.class11_sortingI.practice;

public class MergeSortRecursion {

    void sort(int A[], int L, int R){

        if(L == R){
            return;
        }

        int mid = (L+R)/2;
        sort(A, L, mid);
        sort(A, mid+1, R);
        merge(A, L,  R);
    }

    private void merge(int[] A, int L,  int R) {

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

            if(left[i] < right[j]){
                temp[ptr] = left[i];
                i++;
                ptr++;
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
    }

    public static void main(String[] args) {
        int A[] = {200, 100, 55, 1, 15, 9, 1,4,3,8,9,16,99};
        int N = A.length-1;

        new MergeSortRecursion().sort(A, 0, N);

        for(int a: A){
            System.out.print(a + " ");
        }
    }

}
