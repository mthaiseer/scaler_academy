package advance.class08_recursion.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Permutation {

    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        boolean used[] = new boolean[A.size()];
        permute( A, new ArrayList<>(), result, used);
        return result;
    }

    private void permute(ArrayList<Integer> input, ArrayList<Integer> partial,  ArrayList<ArrayList<Integer>> result,  boolean used[]) {

        if(input.size() == partial.size()){
            result.add(new ArrayList<>(partial));
            return;
        }

        for(int i=0; i<input.size(); i++){

            if(!used[i]){
                used[i] = true;
                partial.add(input.get(i));
                permute(input, partial, result, used);
                used[i]= false;
                partial.remove(partial.size()-1);

            }


        }


    }

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        System.out.println(new Permutation().permute(input));
    }

}
