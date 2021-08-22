package advance.class10_backtrackingII.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class NumberOfSquarefulArrays {

    public int solve(int[] A) {

        if(A.length ==1){
            return 0;
        }


        HashSet<int[]> result = new HashSet<>();
        Arrays.sort(A);
        int res[] = new int[1];
        findSqaures(A, 0, A.length, res, result);

        System.out.println("SIZE "+ result.size());
        return res[0];

    }

    private void findSqaures(int[] A, int i, int N,  int res[],  HashSet<int[]> result ) {

        if(i == N){
            result.add(A.clone());
            res[0]+=1;
            return;
        }

        for(int k=i; k<N; k++){
            if( k != i && A[k] == A[i]){
                continue;
            }

            swap(A, i, k);
            if( i == 0 || (i> 0 && isSquare(A[i]+ A[i-1]))){
                findSqaures(A, i+1, N, res, result);
            }
            swap(A, i, k);
        }
    }

    boolean isSquare(int A){
        double root = Math.sqrt(A);
        return (root-Math.floor(root))==0;

    }

    void swap(int A[], int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;

    }

    public static void main(String[] args) {
        int A[] ={2, 2, 2};
        System.out.println(new NumberOfSquarefulArrays().solve(A));
        System.out.println(new NumberOfSquarefulArrays().solve(new int[] {1, 17, 8}));
       System.out.println(new NumberOfSquarefulArrays().solve(new int[] {42, 72, 76}));

        System.out.println(new NumberOfSquarefulArrays().solve(new int[] { 36229, 1020, 69, 127, 162, 127}));

    }
}
