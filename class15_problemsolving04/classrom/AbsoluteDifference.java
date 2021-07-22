package class15_problemsolving04.classrom;

public class AbsoluteDifference {

    public int solve(int[] A, int[] B, int[] C) {

        int result = Integer.MAX_VALUE;
        int p1 =0;
        int p2 =0;
        int p3 =0;

        while(p1 <=A.length-1 && p2<=B.length-1&& p3<=C.length-1){

            int p1d = A[p1];
            int p2d = B[p2];
            int p3d = C[p3];

            int currentMax =  Math.max(p1d, Math.max(p2d, p3d));
            int currentMin =  Math.min(p1d, Math.min(p2d, p3d));

            result = Math.min(result, (currentMax- currentMin));

            if(currentMin == p1d){p1++;}
            if(currentMin == p2d){p2++;}
            if(currentMin == p3d){p3++;}
        }
        return result;
    }

    public static void main(String[] args) {
        AbsoluteDifference obj = new AbsoluteDifference();
//        System.out.println(obj.solve(
//                new int[]{1,4,5,8,10},
//                new int[]{6,9, 15},
//                new int[]{2,3,6,6}));

        System.out.println(obj.solve(
                new int[]{-1},
                new int[]{-2},
                new int[]{-3}));
    }

}
