package advance.class17_hashingI.classroom;

import java.util.HashMap;
import java.util.Map;

public class ShaggyAndDistance {

    public int solve(int[] A) {

        int minDistance = Integer.MAX_VALUE;
        Map<Integer, Integer> freq = new HashMap<>();

        for(int i=0; i<A.length; i++){

            if(freq.get(A[i]) != null && freq.containsKey(A[i])){

                int prevDistance  = freq.get(A[i]);
                int currentDistance  =  i -prevDistance;

                minDistance = Math.min(minDistance, currentDistance);

                freq.remove(A[i]);
            }

            freq.put(A[i], i);


        }

        return minDistance == Integer.MAX_VALUE? -1: minDistance;

    }

    public static void main(String[] args) {
        System.out.println(new ShaggyAndDistance().solve(new int[]{7, 1, 3, 4, 1, 7}));
        System.out.println(new ShaggyAndDistance().solve(new int[]{1,1}));
        System.out.println(new ShaggyAndDistance().solve(new int[]{1,7}));
    }
}
