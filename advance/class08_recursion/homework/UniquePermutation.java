package advance.class08_recursion.homework;

import java.util.*;

public class UniquePermutation {


    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {


        Set<ArrayList<Integer>> partial= new HashSet<>();
        permute(A, 0, A.size()-1,partial);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>(partial);
        return result;

    }

    private void permute(ArrayList<Integer> A, int l, int r, Set<ArrayList<Integer>> partial) {

       if(l == A.size()){
           partial.add( new ArrayList<>(A));
           return;

       }

       for(int i=l; i<=r; i++){
           swap(A, i, l);
           permute(A, l+1, r, partial);
           swap(A, i, l);

       }

    }

    void swap(ArrayList<Integer> A, int i, int j){

        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);


    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        System.out.println(new UniquePermutation().permute(arr));


    }

}
