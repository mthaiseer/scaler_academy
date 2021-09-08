package advance.class15_twopointer.practice;

import java.util.ArrayList;
import java.util.List;

public class TripletSum03 {

    List<Integer> solve(int A[], int M){

        List<Integer> result = new ArrayList<>();

        //iterate through array and fix a poistion
        for(int i=0; i<A.length; i++){

            int targetSum = M - A[i];

            int j = i+1;
            int k = A.length-1;

            while(j<=k){

                if(A[j] + A[k] > targetSum){
                    k--;
                }else if(A[j]+ A[k] < targetSum){
                    j++;
                }else{
                    result.add(i+1);
                    result.add(j+1);
                    result.add(k+1);
                    return result;
                }

            }



        }
        result.add(-1);
        return  result;
    }

    public static void main(String[] args) {
        System.out.println(new TripletSum03().solve(new int[]{1,3,5,10, 20, 23, 50}, 38));
    }

}
