package class17_problemsolving06.homework;

import java.util.Arrays;

public class MaximumDifference {

    public int solve(int[] A, int B) {

        int res =0;
        int windowSum  =0;
        int start =0;
        int totalSum =0;

        Arrays.sort(A);

        for(int x: A){
            totalSum+= x;
        }


        for(int i=0; i<A.length; i++){

            windowSum+= A[i];

            if(i >= B-1){

                int tempRes = Math.abs(windowSum -  (totalSum - windowSum));
                res = Math.max(res, tempRes);
                windowSum-= A[start];
                start++;

            }

        }
        return res;
    }

    public static void main(String[] args) {
        //System.out.println(new MaximumDifference().solve(new int[]{1,2,3,4,5}, 2));
        //System.out.println(new MaximumDifference().solve(new int[]{5, 17, 100, 11}, 3));
        System.out.println(new MaximumDifference().solve(new int[]{ 93, 51, 84, 81, 89, 82, 28, 78, 86, 35, 64, 38, 49, 99, 83}, 4));
    }

}
