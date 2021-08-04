package advance.class01_Arrays.classroom;

public class MaximumAbsoluteDifference {

    public int maxArr(int[] A) {

        int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;

        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;

        int ans = 0;

        for(int i=0; i<A.length; i++){

            int index = i+1;

            int leftMax  = A[i] + index;
            if(leftMax> max1){
                max1 = leftMax;
            }

            if(leftMax < min1){
                min1 = leftMax;
            }

            int rightMin = A[i] - index;

            if(rightMin> max2){
                max2 = rightMin;
            }

            if(rightMin < min2){
                min2 = rightMin;
            }

            ans = Math.max( (max1 - min1), (max2-min2));
        }


        return ans;
    }


    public static void main(String[] args) {
        System.out.println(new MaximumAbsoluteDifference().maxArr(new int[]{1,3,-1}));
        System.out.println(new MaximumAbsoluteDifference().maxArr(new int[]{2}));
        System.out.println(new MaximumAbsoluteDifference().maxArr(new int[]{3,-2,5,-4}));
    }

}
