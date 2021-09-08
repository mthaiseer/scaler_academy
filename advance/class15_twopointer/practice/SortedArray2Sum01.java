package advance.class15_twopointer.practice;

import java.util.ArrayList;
import java.util.List;

public class SortedArray2Sum01 {

    List<Integer> solve(int[] A, int K){

        int i=0;
        int j = A.length-1;
        List<Integer> res = new ArrayList<>();

        while(i <= j){

            if(A[i] + A[j] > K){
                j--;
            }else if(A[i] + A[j] < K){
                i++;
            }else{

                res.add(i+1);
                res.add(j+1);
                return res;
            }


        }
        res.add(-1);
        return res;
    }

    public static void main(String[] args) {
        System.out.println( new SortedArray2Sum01().solve(new int[]{1,3,5,10, 20, 23, 30}, 23));
        System.out.println( new SortedArray2Sum01().solve(new int[]{1,3,5,10, 20, 23, 30}, 100));
    }

}
