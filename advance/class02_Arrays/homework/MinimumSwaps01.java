package advance.class02_Arrays.homework;



public class MinimumSwaps01 {



    public int solve(int[] A, int B) {

        int totalElLessOrEqB  = 0;
        for(int x: A){
            if(x <= B){
                totalElLessOrEqB++;
            }
        }

        int ans = Integer.MAX_VALUE;
        int eleDiscardCount  =0;
        int leftWindow =0;

        for (int i=0; i<A.length; i++){

            if(i >= totalElLessOrEqB ){

                ans = Math.min(ans,eleDiscardCount);
                if(A[leftWindow] > B ){
                    eleDiscardCount--;
                }
                leftWindow++;
            }
            if(A[i] > B){
                eleDiscardCount++;
            }
      }

     return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public static void main(String[] args) {



       System.out.println(new MinimumSwaps01().solve(new int[]{52, 7, 93, 47, 68, 26, 51, 44, 5, 41, 88, 19, 78, 38, 17, 13, 24, 74, 92, 5, 84, 27, 48, 49, 37, 59, 3, 56, 79, 26, 55, 60, 16, 83, 63, 40, 55, 9, 96, 29, 7, 22, 27, 74, 78, 38, 11, 65, 29, 52, 36, 21, 94, 46, 52, 47, 87, 33, 87, 70},19));



       System.out.println(new MinimumSwaps01().solve(new int[]{8,3,10, 20,22,13,1,2,55,5,15,50},5 ));
        System.out.println(new MinimumSwaps01().solve(new int[]{5, 17, 100, 11},20));
     System.out.println(new MinimumSwaps01().solve(new int[]{5, 17, 100, 11},90));
       System.out.println(new MinimumSwaps01().solve(new int[]{10, 20, 30},5));
    }
}
