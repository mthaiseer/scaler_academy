package advance.class15_twopointer.homework;

import java.util.HashMap;
import java.util.Map;

public class PairSumII {

    public int solve(int[] A, int B) {
        int MOD = 1000000007;
        long ans =0;
        int i=0;
        int  j = A.length-1;

        Map<Long, Long> frequecy = new HashMap<>();

        //build frequency array
        for(long x: A){

            if(frequecy.get(x) == null){
                frequecy.put(x, 1L);
            }else{
                frequecy.put(x, frequecy.get(x)+1);
            }


        }

        while(i <=j ){

            long  sum  = (A[i] % MOD+A[j]%MOD)%MOD;

            if(sum > B){
                j--;
            }else if(sum < B){
                i++;
            }else {

                if(A[i] ==  A[j]){

                    long x = (j-i)%MOD+1;
                    ans+= ((x %MOD * (x-1)%MOD)/2)%MOD;
                    break;

                }else{

                    Long leftCount = frequecy.get(Long.valueOf(A[i])) %MOD ;
                    Long  rightCount = frequecy.get(Long.valueOf(A[j])) %MOD;
                    i+= leftCount;
                    j-=rightCount;

                    ans+= (leftCount %MOD*rightCount %MOD)%MOD;
                }
            }
        }
        return (int)ans%MOD ;

    }

    public static void main(String[] args) {
        //System.out.println(new PairSumII().solve(new int[]{1,1,2,4,5,6,6,8}, 7));
        //System.out.println(new PairSumII().solve(new int[]{1,1,1}, 2));
        System.out.println(new PairSumII().solve(new int[]{1, 2, 6, 6, 7, 9, 9}, 13));
    }

}
