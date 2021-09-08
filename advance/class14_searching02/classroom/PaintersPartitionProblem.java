package advance.class14_searching02.classroom;

public class PaintersPartitionProblem {


    private boolean findOptimalPatition(long A, long B, int[] C, long mid) {

        int count =1;
        long sum  =0;
        for(int i=0; i<C.length; i++){

            if(sum+ (C[i]*B) > mid){

                count++;
                sum = C[i]*B;

                if(count > A){
                    return false;
                }


            }else{
                sum =  sum+C[i] * B;
            }


        }



        return true;
    }

    public int paint(int A, int B, int[] C) {

        int MOD = 1000000007;
        int maxVal =  Integer.MIN_VALUE;
        int  ans = 0;
        long cumSum =0;
        for(int x: C){
            maxVal = Math.max(maxVal, x);
            cumSum+=x;
        }

        long min = maxVal * B;
        long max = cumSum*B;

        while(min<=max){


            long mid = (min+max)/2;

            boolean isPossible = findOptimalPatition(A, B, C, mid);

            if(isPossible){
                ans  = (int)mid %MOD;
                max = mid-1;

            }else{
                min = mid+1;
            }



        }
        return ans;
    }

    public static void main(String[] args) {
       // System.out.println(new PaintersPartitionProblem().paint(2, 5, new int[]{1, 10}));
        //System.out.println(new PaintersPartitionProblem().paint(10, 1, new int[]{1, 8, 11, 3}));
        //System.out.println(new PaintersPartitionProblem().paint(3, 10, new int[]{185, 186, 938, 558, 655, 461, 441, 234, 902, 681 }));
        System.out.println(new PaintersPartitionProblem().paint(1, 1000000, new int[]{1000000, 1000000}));
    }



}
