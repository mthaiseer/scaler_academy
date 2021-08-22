package advance.class10_backtrackingII.practice;

import java.util.List;

public class PermutationWithDups {

    void permute(int A[], int idx, int N){

        if(idx == N){

            for(int a: A){
                System.out.print(a +  "  ");
            }
            System.out.println();
            return;
        }

        for(int i=idx; i<=N; i++){

            if(i!=idx &&  A[i] == A[idx]){
                continue;
            }

            swap(A, idx, i);
            permute(A, idx+1, N);
            swap(A, idx, i);
        }

    }

    void swap(int A[], int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;

    }

    public static void main(String[] args) {

        int A[] = {1,1,2};
        new PermutationWithDups().permute(A, 0, A.length-1);


    }

}
