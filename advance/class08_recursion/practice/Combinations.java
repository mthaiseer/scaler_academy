package advance.class08_recursion.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Combinations {

    void combinations(int arr[], int k, int i, List<Integer> partial){

        if (partial.size() == k){
            System.out.println(partial);
            return;
        }

        if(i  == arr.length){
            return;
        }

        partial.add(arr[i]);
        combinations(arr, k, i+1, partial);
        partial.remove(partial.size()-1);
        combinations(arr, k, i+1, partial);

    }

    public static void main(String[] args) {
        new Combinations().combinations(new int[] {1,2,3,4}, 2, 0, new ArrayList<>());
    }
}
