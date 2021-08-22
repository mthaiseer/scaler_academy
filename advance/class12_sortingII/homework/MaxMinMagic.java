package advance.class12_sortingII.homework;

import java.util.Arrays;

public class MaxMinMagic {

    public int[] solve(int[] A) {

        int M = 1000000007;
        int n = A.length;
        int res[] = new int[2];
        int max =0;
        int min = 0;
        Arrays.sort(A);

        for(int i=1; i<A.length; i+=2){

            min =   ((min%M) +  ((int)Math.abs(A[i-1] - A[i])%M))%M;

        }

        for(int i=0; i<n/2; i++){
           max =  ((max%M)+ (int)Math.abs(A[i] - A[n-i-1])%M)%M;
        }

        res[0] = max;
        res[1] = min;

        return res;
    }

    public static void main(String[] args) {
        //int res[] = new MaxMinMagic().solve(new int[]{3, 11, -1, 5});
        int res[] = new MaxMinMagic().solve(new int[]{2,2});
        for (int x: res){
            System.out.println(x);
        }
    }


}
