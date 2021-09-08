package advance.class17_hashingI.classroom;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveNumbers {

    public int longestConsecutive(final int[] A) {

        int maxCount = 0;
        int count =0;
        Set<Integer> set = new HashSet<>();

        for(int x: A){
            set.add(x);
        }

        for(int e: A){

            if(!set.contains(e-1)){

                int currentEl = e;
                count =0;
                while(set.contains(currentEl)){
                    count++;
                    currentEl+=1;
                    maxCount = Math.max(maxCount, count);
                }
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        System.out.println(new LongestConsecutiveNumbers().longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        System.out.println(new LongestConsecutiveNumbers().longestConsecutive(new int[]{2,1}));
        System.out.println(new LongestConsecutiveNumbers().longestConsecutive(new int[]{100, 200}));
    }


}
