package advance.class12_sortingII.homework;

import java.util.Arrays;

public class SumDifference {

    public int solve(int[] A) {
        int result =0;
        int M = 1000000007;

        int N = A.length;
        int max =0;
        int min =0;

        Arrays.sort(A);

        for(int i=0; i<A.length; i++){
            max=  (int)( (max%M) + (Math.pow(2, i) %M * A[i]%M))%M;
        }

        int k=0;
        for(int i=N-1; i>=0; i--){

            min = (int)( (min%M) + (Math.pow(2, i) %M *  A[k++]%M))%M;

        }
         result =  ((max%M- min%M) + M) %M;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new SumDifference().solve(new int[]{1,2,3,5,7}));
        System.out.println(new SumDifference().solve(new int[]{1,2}));
    }



}
