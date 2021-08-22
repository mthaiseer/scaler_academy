package advance.class11_sortingI.classroom;

public class KthSmallestElement {


    void swap(int A[], int i, int j){

        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;

    }
    public int kthsmallest(final int[] A, int B) {

        int N = A.length;

        for(int i=0; i<B; i++){

            for(int j = i+1; j<N; j++){

                if(A[i] > A[j]){
                    swap(A, i, j);
                }
            }
        }

        return A[B-1];
    }

    public static void main(String[] args) {
        System.out.println(new KthSmallestElement().kthsmallest(new int[]{2, 1, 4, 3, 2}, 3));
        System.out.println(new KthSmallestElement().kthsmallest(new int[]{1, 2}, 2));
    }

}
