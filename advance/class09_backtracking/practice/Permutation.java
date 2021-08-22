package advance.class09_backtracking.practice;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    void permutation(int A[], boolean visited[], int N, int idx, List<Integer> partial){

        if(idx == N){

            System.out.println(partial);
            return;

        }

        for(int i=0; i<A.length; i++){

            if(!visited[i]){

                visited[i] = true;
                partial.add(A[i]);
                permutation(A, visited, N, idx+1, partial);
                partial.remove(partial.size()-1);
                visited[i] = false;

            }


        }

    }

    public static void main(String[] args) {

        int A[] =  {1,2,3};
        boolean visited[] = new boolean[A.length];
        new Permutation().permutation(A, visited, A.length, 0, new ArrayList<>());



    }

}
