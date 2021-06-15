package class07_hashing.classroom;

import java.util.HashSet;
import java.util.Set;

public class SubArrayZeroSum {

    public int solveBruteForce(int[] A) {


        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {

                sum += A[j];
                if (sum == 0) {
                    return 1;
                }

            }
        }
        return 0;
    }


    public int solve(int[] A) {


        Set<Long> cache = new HashSet<>();
        Long prefixSum = 0L;
        cache.add(0L);

        for (int i = 0; i < A.length; i++) {

            prefixSum += A[i];
            if (cache.contains(prefixSum)) {
                return 1;
            }
            cache.add(prefixSum);


        }
        return 0;
    }

    public static void main(String[] args) {

        SubArrayZeroSum obj = new SubArrayZeroSum();
        System.out.println(obj.solve(new int[]{1, 2, 3, 4, 5}));
        System.out.println(obj.solve(new int[]{1, -1}));
        System.out.println(obj.solve(new int[]{1, 2, 3, -2 - 1}));

//        System.out.println(obj.solveBruteForce(new int[] {1,2,3,4,5}));
//        System.out.println(obj.solveBruteForce(new int[] {1, -1}));
//        System.out.println(obj.solveBruteForce(new int[] {1,2,3,-2-1}));
        System.out.println(obj.solveBruteForce(new int[]{862, -411, -552, -549, 918, 434, 29, -437, 121, -640, -168, -961, 929, -427, 372, 984, 488, -756, 674, -149, 945, 566, 391, -970, -44, 689, -128, -326, 43, -312, 469, 817, -349, 260, 590, -106, -700, 484, -735, -423, 660, 450, -1148, -237, -844, 62, 513, 506, 382, 77, 244, 335}));
        System.out.println(obj.solve(new int[]{862, -411, -552, -549, 918, 434, 29, -437, 121, -640, -168, -961, 929, -427, 372, 984, 488, -756, 674, -149, 945, 566, 391, -970, -44, 689, -128, -326, 43, -312, 469, 817, -349, 260, 590, -106, -700, 484, -735, -423, 660, 450, -1148, -237, -844, 62, 513, 506, 382, 77, 244, 335}));
    }

}
