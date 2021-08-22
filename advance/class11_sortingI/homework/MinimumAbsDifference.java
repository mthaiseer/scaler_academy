package advance.class11_sortingI.homework;

import java.util.Arrays;

public class MinimumAbsDifference {

    public int solve(int[] A) {

        int ans = Integer.MAX_VALUE;
        Arrays.sort(A);
        for(int i=1; i<A.length; i++){
            ans  = Math.min(ans, (A[i] -A[i-1]));
        }

        return ans;

    }

    public static void main(String[] args) {
        System.out.println(new MinimumAbsDifference().solve(new int[]{1, 2, 3, 4, 5}));
        System.out.println(new MinimumAbsDifference().solve(new int[]{5, 17, 100, 11}));
    }
}
