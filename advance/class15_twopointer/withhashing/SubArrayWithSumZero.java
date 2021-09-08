package advance.class15_twopointer.withhashing;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithSumZero {

    boolean isZeroSum(int A[]){

        int prefix =0;
        Set<Integer> cache = new HashSet<>();


        for(int a: A){

            prefix+=a;

            if(prefix == 0 || cache.contains(prefix)){
                return true;
            }

            cache.add(prefix);

        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(new SubArrayWithSumZero().isZeroSum(new int[] {6, -1, 2, 1 -1}));
        System.out.println(new SubArrayWithSumZero().isZeroSum(new int[] {1,2,3,4}));
    }


}
