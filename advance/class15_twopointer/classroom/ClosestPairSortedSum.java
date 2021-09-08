package advance.class15_twopointer.classroom;

public class ClosestPairSortedSum {

    public int[] solve(int[] A, int[] B, int C) {

        int  M = 1000000007;
        int ai = 0;
        int ae = A.length;
        int be = B.length - 1;
        long mainDiff = Integer.MAX_VALUE;

        int ansA = 0;
        int ansB = 0;

        while (ai < ae && be >= 0) {

            long sum = (A[ai]  + B[be]) ;
            long  currentDiff = Math.abs(sum - C);

            if (sum == C) {
                ansA = ai;
                ansB = be;

                int[] res = new int[2];
                res[0] = A[ansA];
                res[1] = B[ansB];
                return res;
            }

            if(currentDiff==mainDiff && ansA==ai)ansB = be;

            if (currentDiff < mainDiff) {
                mainDiff = currentDiff;
                ansA = ai;
                ansB = be;
            }

            if (sum > C) {
                be--;
            } else {
                ai++;
            }
        }

        int[] res = new int[2];
        res[0] = A[ansA];
        res[1] = B[ansB];
        return res;
    }

    public static void main(String[] args) {
//        int A[] = new ClosestPairSortedSum().solve(new int[]{1,4,5,7}, new int[]{10,20,30, 40}, 38);
//        for (int x: A){
//            System.out.print(x+  "  ");
//        }
//        System.out.println();
        //int [] B = new ClosestPairSortedSum().solve(new int[]{1, 2, 3, 4, 5}, new int[]{2, 4, 6, 8}, 9);
        int[] B = new ClosestPairSortedSum().solve(new int[]{1, 3, 5, 7, 9}, new int[]{2, 4, 6, 8, 10}, 10);

        for (int x : B) {
            System.out.print(x + "  ");
        }
        System.out.println();


    }


}
