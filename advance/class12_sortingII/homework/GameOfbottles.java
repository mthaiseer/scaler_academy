package advance.class12_sortingII.homework;

import java.util.Arrays;

public class GameOfbottles {

    public int solve(int[] A) {

        int start =0;
        int N= A.length;

        Arrays.sort(A);

        for(int i=1;i<A.length; i++){

            if(A[start] < A[i]){
                start++;
            }

        }

        int s = (N - start);
        return s;
    }

    public static void main(String[] args) {
        System.out.println(new GameOfbottles().solve(new int[] {4,1,2,2,4,5,2,7}));
        System.out.println(new GameOfbottles().solve(new int[] {2,1,3}));
    }

}
