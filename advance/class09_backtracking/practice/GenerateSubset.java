package advance.class09_backtracking.practice;

import java.util.ArrayList;
import java.util.List;

public class GenerateSubset {

    void genenarte(int A[], int idx, List<Integer> partial, int N){

        if(idx == N ){
            System.out.println(partial);
            return;
        }

        genenarte(A, idx+1, partial, N);
        partial.add(A[idx]);
        genenarte(A, idx+1, partial, N);
        partial.remove(partial.size()-1);

    }

    public static void main(String[] args) {
        int [] A = {1,2};
        new GenerateSubset().genenarte(A, 0, new ArrayList<>(), A.length);
    }

}
