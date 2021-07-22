package class15_problemsolving04.homework;

import java.util.Arrays;

public class OptimalPartitioning {

    public int solve(int[] A) {

        Arrays.sort(A);
        int minDistance  = Integer.MAX_VALUE;

        for(int i=1; i<A.length; i++){
            minDistance  = Math.min(minDistance, (A[i] - A[i-1]));
        }
        return minDistance;


    }

    public static void main(String[] args) {
        OptimalPartitioning obj= new OptimalPartitioning();
        System.out.println(obj.solve(new int[] {3, 1, 2, 6, 4})); //1
        System.out.println(obj.solve(new int[] {2, 1, 3, 2, 4, 3}));//0
    }
}
