package advance.class15_twopointer.practice;

import java.util.ArrayList;
import java.util.List;

public class SortedArrayKDiffence02 {

    List<Integer> solve(int[] A, int K){

        List<Integer> res = new ArrayList<>();

        int N = A.length;

        //both pointers are starts from begining
        int i=0;
        int j = 0;

        while(j < N){

            int diff = A[j] - A[i];
            if(diff < K){
                j++;
            }else if(diff > K ){
                i++;
            }else{

                res.add(i+1);
                res.add(j+1);
                return res;
            }


        }
        res.add(-1);
        return  res;
    }

    public static void main(String[] args) {
        System.out.println(new SortedArrayKDiffence02().solve(new int[]{1,3,5,10, 20, 23, 30}, 15));
    }


}
