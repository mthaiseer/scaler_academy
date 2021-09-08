package advance.class18_hashingII.classroom;

import java.util.HashMap;
import java.util.Map;

public class CountRightTriangle {

    public int solve(int[] A, int[] B) {

        int ans  = 0;
        Map<Integer, Integer> xFreq = new HashMap<>();
        Map<Integer, Integer> yFreq = new HashMap<>();

        for(int i=0; i<A.length; i++){

            xFreq.put(A[i], xFreq.getOrDefault(A[i], 0)+1);
            yFreq.put(B[i], yFreq.getOrDefault(B[i], 0)+1);

        }

        for(int i=0; i<A.length; i++){
            int aCount  = xFreq.get(A[i]);
            int bCount = yFreq.get(B[i]);
            ans = ans+ ((aCount-1) * (bCount-1) )%1000000007;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new CountRightTriangle().solve(new int[]{1, 1, 2}, new int[]{1, 2, 1}));
        System.out.println(new CountRightTriangle().solve(new int[]{1, 1, 2, 3, 3}, new int[]{1, 2, 1, 2, 1}));
    }

}
