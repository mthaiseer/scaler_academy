package advance.class09_backtracking.practice;

import java.util.*;

public class GenerateUniqueSubsequences {

    void generate(int A[], Map<Integer, Integer> freqMap, int idx, int N, List<Integer> partial){

        if(idx == freqMap.size()){

            System.out.println(partial);
            return;

        }

        for(int i=0; i<=freqMap.get(A[idx]); i++){

            partial.add(i);
            generate(A, freqMap, idx+1, N, partial);
            partial.remove(partial.size()-1);

        }
    }

    public static void main(String[] args) {
        int [] A = {1,1,1,1,2,2,4};



        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int i=0; i<A.length; i++){

            if(freqMap.get(A[i]) == null){
                freqMap.put(A[i], 1);
            }else{
                freqMap.put(A[i], freqMap.get(A[i])+1);
            }

        }

        System.out.println(freqMap);

       new GenerateUniqueSubsequences().generate(A, freqMap, 0, A.length, new ArrayList<>());

    }

}
