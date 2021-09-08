package advance.class15_twopointer.withhashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubArrayWithSumEqualsK {

    int  findSumK(int A[], int k){

        int maxDistance = Integer.MIN_VALUE;
        Map<Integer, Integer> freq = new HashMap<>();
        int prefix =0;

        for(int i=0; i<A.length; i++){
            prefix+= A[i];

            if(prefix == k){
                maxDistance = Math.max(maxDistance, i+1);
            }

            if(freq.get(prefix -  A[i])!=null){
                maxDistance = Math.max(maxDistance, (i-freq.get(prefix -  A[i]))+1);
            }

            freq.put(prefix, i);
        }

        return maxDistance == Integer.MIN_VALUE? 0: maxDistance;
    }

    public static void main(String[] args) {
        System.out.println(new SubArrayWithSumEqualsK().findSumK(new int[] {1, -1, 5, -2, 3}, 3));

    }


}
