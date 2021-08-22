package advance.class12_sortingII.homework;

import java.util.Arrays;

public class MaxMod {

    public int solve(int[] A) {
        int ans = Integer.MIN_VALUE;

        Arrays.sort(A);
        for(int i=1; i<A.length; i++){

            if(A[i] >0){
                ans = Math.max(ans, A[i-1]%A[i]);
            }


        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(new MaxMod().solve(new int[]{1, 2, 44, 3}));
        System.out.println(new MaxMod().solve(new int[]{2, 6, 4}));
    }
}
