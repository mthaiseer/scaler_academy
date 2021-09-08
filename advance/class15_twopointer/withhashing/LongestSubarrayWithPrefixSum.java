package advance.class15_twopointer.withhashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithPrefixSum {

    int findDistance(int A[]){
        int maxDistance = Integer.MIN_VALUE;
        Map<Integer, Integer> freq = new HashMap<>();
        int prefix =0;

        for(int i=0; i<A.length; i++){
            prefix+= A[i];

            if(prefix == 0){
                maxDistance = Math.max(maxDistance, i+1);
            }

            if(freq.get(A[i])!=null){
                maxDistance = Math.max(maxDistance, (i-freq.get(A[i]))+1);
            }

            freq.put(prefix, i);
        }

        return maxDistance == Integer.MIN_VALUE? 0: maxDistance;
    }

    public static void main(String[] args) {
        System.out.println(new LongestSubarrayWithPrefixSum().findDistance(new int[]{-1, 1}));
        System.out.println(new LongestSubarrayWithPrefixSum().findDistance(new int[]{0, -1, 1, 2,5,-5, -2}));

    }
}
