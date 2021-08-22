package advance.class09_backtracking.classroom;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CombinationalSum {

    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {


        //sort
        Collections.sort(A);
        //make unique elements

        ArrayList<Integer> uniqueEle = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {

            if (i ==0  || A.get(i - 1) != A.get(i)) {
                uniqueEle.add(A.get(i));
            }
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        findCombinationalSum(uniqueEle, 0, B, new ArrayList<>(), result, 0);
        return result;
    }

    private void findCombinationalSum(ArrayList<Integer> uniqueEle, int idx, int target, ArrayList<Integer> partial, ArrayList<ArrayList<Integer>> result, int currentSum) {

        if (currentSum > target) {
            return;
        }

        if (currentSum == target) {
            result.add(new ArrayList<>(partial));
            return;

        }

        for (int i = idx; i < uniqueEle.size(); i++) {

            partial.add(uniqueEle.get(i));
            currentSum += uniqueEle.get(i);


            findCombinationalSum(uniqueEle, i, target, partial, result, currentSum);


            currentSum -= uniqueEle.get(i);
            partial.remove(partial.size()-1);
        }


    }

    public static void main(String[] args) {

        ArrayList<Integer> input = new ArrayList<>();
        input.add(2);
        input.add(3);
        input.add(6);
        input.add(7);

        System.out.println(new CombinationalSum().combinationSum(input, 7));

    }


}
