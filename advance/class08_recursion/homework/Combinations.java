package advance.class08_recursion.homework;

import java.util.ArrayList;


public class Combinations {

    public ArrayList<ArrayList<Integer>> combine(int A, int B) {

        int []arr = new int[A];
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for(int i=1; i<=A; i++){
            arr[i-1] = i;
        }

        combination(arr, B, 0, new ArrayList<>(), result);

        return result;

    }

    private void combination(int[] arr, int k, int i, ArrayList<Integer> partials, ArrayList<ArrayList<Integer>> result) {

        if(partials.size() == k){
            result.add(new ArrayList<Integer>(partials));
            return;
        }

        if(i == arr.length){
            return;
        }
        partials.add(arr[i]);
        combination(arr, k, i+1, partials, result);
        partials.remove(partials.size()-1);
        combination(arr, k, i+1, partials, result);

    }

    public static void main(String[] args) {
        System.out.println(new Combinations().combine(4, 2));
        System.out.println(new Combinations().combine(3, 2));
    }

}
