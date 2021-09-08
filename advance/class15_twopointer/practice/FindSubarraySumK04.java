package advance.class15_twopointer.practice;

import java.util.ArrayList;
import java.util.List;

public class FindSubarraySumK04 {

    List<Integer> solvePrefixSum(int[] A, int K){

        List<Integer> result = new ArrayList<>();
        int[] prefix = new int[A.length];

        prefix[0] = A[0];

        for(int i=1; i<A.length; i++){
            prefix[i] = prefix[i-1]+A[i];

        }

       int i=0;
       int j =0;

       while(j < prefix.length){

           if(prefix[j] - prefix[i] < K){
               j++;
           }else if(prefix[j] - prefix[i] > K){
               i++;
           }else{
               result.add(i+1);
               result.add(j);
               return result;


           }

       }
        result.add(-1);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new FindSubarraySumK04().solvePrefixSum(new int[] {1,3,15,10,20, 23, 3}, 48));
    }


}
