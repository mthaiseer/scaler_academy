package advance.class01_Arrays.classroom;

public class MaxContigousSubArray {

    public int maxSubArray(final int[] A) {
        int currentSum = 0;
        int maxSum  = Integer.MIN_VALUE;

        for(int i=0; i<A.length; i++){

            currentSum+= A[i];
            maxSum = Math.max(maxSum, currentSum);
            if(currentSum <=0){
                currentSum =0;
            }


        }
        return maxSum;
    }

    public static void main(String[] args) {

        System.out.println(new MaxContigousSubArray().maxSubArray(new int[]{1,2,3,4, -10}));
        System.out.println(new MaxContigousSubArray().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));

    }


}
