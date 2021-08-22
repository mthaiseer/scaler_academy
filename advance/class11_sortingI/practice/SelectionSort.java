package advance.class11_sortingI.practice;

import java.util.Arrays;

public class SelectionSort {

    void swap(int A[], int i, int j){

        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;

    }

    int sortKTimes(int A[], int k){

        int N = A.length;

        for(int i=0; i<k; i++){

            for(int j = i+1; j<N; j++){

                if(A[i] > A[j]){
                    swap(A, i, j);
                }
            }
        }

        return A[k-1];
    }


    int[] sort(int A[]){

        int N = A.length;

        for(int i=0; i<N-1; i++){

            for(int j = i+1; j<N; j++){

                if(A[i] > A[j]){
                    swap(A, i, j);
                }
            }
        }

        return A;
    }

    public static void main(String[] args) {

        Arrays.stream(new SelectionSort().sort(new int[]{5,2,4,3,10, -1})).forEach(it->{
            System.out.print(it+  " ");
        });

        System.out.println();

        int k = new SelectionSort().sortKTimes(new int[]{5,2,4,3,10, -1}, 4);
        System.out.println(k);


    }
}
