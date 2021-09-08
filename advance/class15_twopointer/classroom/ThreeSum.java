package advance.class15_twopointer.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class ThreeSum {

    public int threeSumClosest(int[] A, int B) {

        Arrays.sort(A);
        int MOD = 1000000007;
        int ans  = 0;
        if(B < 0){
           ans = Integer.MIN_VALUE;
        }else {
            ans = Integer.MAX_VALUE;
        }

        int N = A.length;
        for(int i=0; i<N-2; i++){

            int a = i;
            int b = i+1;
            int c = N-1;

            while (b<c){

                int sum  = (A[a] + A[b] + A[c]);

                if(sum == B ){
                    return sum;
                }

                if(Math.abs(sum - B) < Math.abs(ans-B)){
                    ans = sum;
                }
                if(sum< B){
                    b++;
                }
                if(sum > B){

                    c--;
                }

            }
        }
        return ans;
    }

    public static void main(String[] args) {
       // System.out.println(new ThreeSum().threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
        System.out.println(new ThreeSum().threeSumClosest(new int[]{2, 1, -9, -7, -8, 2, -8, 2, 3, -8}, -1));
    }


}
