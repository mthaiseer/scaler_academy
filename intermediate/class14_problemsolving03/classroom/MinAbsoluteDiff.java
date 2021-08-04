package intermediate.class14_problemsolving03.classroom;

import java.util.Arrays;

public class MinAbsoluteDiff {

    public int solve(int[] A) {

        int ans  = Integer.MAX_VALUE;
        Arrays.sort(A);
        for(int i=1; i<A.length; i++){
            ans = Math.min(ans, (A[i] - A[i-1]));
        }
        return ans;
    }

    public static void main(String[] args) {
        MinAbsoluteDiff obj = new MinAbsoluteDiff();
        System.out.println(obj.solve(new int[] {1, 2, 3, 4, 5}));
        System.out.println(obj.solve(new int[] {5, 17, 100, 11}));
    }

}
