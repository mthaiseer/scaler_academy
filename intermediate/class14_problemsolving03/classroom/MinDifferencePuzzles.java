package intermediate.class14_problemsolving03.classroom;

import java.util.Arrays;

public class MinDifferencePuzzles {

    public int solve(int[] A, int B) {

        int start =0;
        int end =0;
        int ans = Integer.MAX_VALUE;

        Arrays.sort(A);

        for (end =0; end<A.length; end++){

            if(end >= B -1){

                ans = Math.min(ans , (A[end] - A[start]));
                start++;

            }

        }


        return ans;
    }

    public static void main(String[] args) {
        MinDifferencePuzzles obj = new MinDifferencePuzzles();
        System.out.println(obj.solve(new int[]{10, 12, 10, 7, 5, 22}, 4));
        System.out.println(obj.solve(new int[]{2,1}, 1));
    }


}
