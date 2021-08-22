package advance.class09_backtracking.classroom;

import java.util.ArrayList;
import java.util.Collections;

public class CombinationalSumII {


    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {

        ArrayList<ArrayList<Integer>> globalResult  = new ArrayList<>();
        int sum = 0;
        int idx =0;
        int N = A.size();

        Collections.sort(A);


        combinationSum(A, B, sum, idx, new ArrayList<>(), N, globalResult);

        return globalResult;

    }

    private void combinationSum(ArrayList<Integer> A, int target, int sum, int idx, ArrayList<Integer> partial, int N,  ArrayList<ArrayList<Integer>> globalResult) {




        if(sum == target){
            if(! globalResult.contains(partial)){
                globalResult.add(new ArrayList<>(partial));
            }

            return;
        }

        if(N == idx){
            return;
        }

        if(sum > target){
            return;
        }



        sum += A.get(idx);
        partial.add(A.get(idx));
        combinationSum(A, target, sum, idx+1,partial, N, globalResult);

        //backtrack
        partial.remove(partial.size()-1);
        sum-=A.get(idx);
        combinationSum(A, target, sum, idx+1,partial, N, globalResult);



    }

    public static void main(String[] args) {

        ArrayList<Integer> input = new ArrayList<>();
        input.add(2);
        input.add(1);
        input.add(3);

        ArrayList<ArrayList<Integer>> result = new CombinationalSumII().combinationSum(input, 3);
        System.out.println(result);

        //10, 1, 2, 7, 6, 1, 5

        ArrayList<Integer> input2 = new ArrayList<>();
        input2.add(10);
        input2.add(1);
        input2.add(2);
        input2.add(7);
        input2.add(6);
        input2.add(1);
        input2.add(5);

        ArrayList<ArrayList<Integer>> result2 = new CombinationalSumII().combinationSum(input2, 8);
        System.out.println(result2);






    }


}
