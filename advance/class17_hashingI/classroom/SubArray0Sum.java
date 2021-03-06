package advance.class17_hashingI.classroom;

import java.util.HashSet;
import java.util.Set;

public class SubArray0Sum {

    public int solve(int[] A) {

        int M = 1000000007;
        long prefixSum =0;
        Set<Long> cache = new HashSet<>();

        for(int e: A){

            prefixSum = (prefixSum+  e) ;
            if(prefixSum ==  0){
                return 1;
            }
            if(cache.contains(prefixSum)){
                return 1;
            }
            cache.add(prefixSum);
        }
        return 0;
    }

    public static void main(String[] args) {
//        System.out.println(new SubArray0Sum().solve(new int[]{8,2,1,4,-3, -4}));
//        System.out.println(new SubArray0Sum().solve(new int[]{1,2,3,4}));
//        System.out.println(new SubArray0Sum().solve(new int[]{1,-1}));
        System.out.println(new SubArray0Sum().solve(new int[]{862, -411, -552, -549, 918, 434, 29, -437, 121, -640, -168, -961, 929, -427, 372, 984, 488, -756, 674, -149, 945, 566, 391, -970, -44, 689, -128, -326, 43, -312, 469, 817, -349, 260, 590, -106, -700, 484, -735, -423, 660, 450, -1148, -237, -844, 62, 513, 506, 382, 77, 244, 335 }));
        System.out.println(new SubArray0Sum().solve(new int[]{-78, -97, -44, -18, -7, -26, 37, -76, -23, -35, 48, 9, 25, 62, -90, 27, -40, 18, 88, 82, 15, 96, 31, -2, -45, -48, 52, -78, -79, -76, -18, -88, -85, 58, -48, -48, -16, 77, -79, -89, -78, 27, 98, 53, -6, 43, 73, 38 }));
    }


}
