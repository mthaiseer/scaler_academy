package advance.class10_backtrackingII.practice;

import java.util.*;


public class PermutationRepeatedElements {

    List<List<Integer>> permute(int A[]){

        Map<Integer, Integer> freqArray = new HashMap<>();
        int[] freq   = new int[20];
        Set<Integer> uniqueElements = new TreeSet<>();

        //build frequency array
        for(int x: A){
            freq[x]++;
            uniqueElements.add(x);
        }


        System.out.println(uniqueElements);
        
        List<List<Integer>> allPermutation = new ArrayList<>();
        //permuteHelper(uniqueElements, freq, 0, new ArrayList<>(), allPermutation);

        return  allPermutation;



    }

    void permuteHelper( Set<Integer> uniqueElements ,   int[] freq , int idx, List<Integer> partial,  List<List<Integer>> allPermutation ){

        if(idx == freq.length){

            allPermutation.add(new ArrayList<>(partial));
            return;

        }

        for(int i=0; i<uniqueElements.size(); i++){
//
//            if(freq[].get(i).intValue() > 0){
//
//                System.out.println();
//
//
//            }

        }


    }

    public static void main(String[] args) {
        PermutationRepeatedElements obj = new PermutationRepeatedElements();
        obj.permute(new int[]{1,1,2});
    }


}
