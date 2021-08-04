package intermediate.class01_introToProblemSolving.homeworks;

public class MinimumPicks {

    public static  int solve(int[] A) {
        int minOdd = Integer.MAX_VALUE;
        int maxEven = Integer.MIN_VALUE;

        for(int i=0; i<A.length; i++){
            if(A[i] % 2 ==0){
                maxEven = Math.max(maxEven, A[i]);
            }

            if(A[i] % 2 !=0){
                minOdd = Math.min(minOdd, A[i]);
            }
        }

        if(minOdd == Integer.MAX_VALUE  || maxEven == Integer.MIN_VALUE){
            return 0;
        }
        return maxEven - minOdd;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[] {0, 2, 9}));
        System.out.println(solve(new int[] {5, 17, 100, 1}));
        System.out.println(solve(new int[] {0}));
        System.out.println(solve(new int[] {1,2}));


    }

}
