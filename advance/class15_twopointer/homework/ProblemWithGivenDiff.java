package advance.class15_twopointer.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProblemWithGivenDiff {


    public int solve(int[] A, int B) {

        Set<Integer> hashSet = new HashSet<>();
        Map<Integer, Integer> frequecy = new HashMap<>();
        int count =0;

        //store values
        for(int x: A){
            hashSet.add(x);
        }

        //build frequency array
        for(int x: A){

            if(frequecy.get(x) == null){
                frequecy.put(x, 1);
            }else{
                frequecy.put(x, frequecy.get(x)+1);
            }


        }

        for(int x: hashSet){

            int target = B -x;

            if(B == 0){

                if(frequecy.get(x) >1){
                    count++;
                }
            }else{

                if(hashSet.contains(B+x)){
                    count++;
                }


            }
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(new ProblemWithGivenDiff().solve(new int[]{1, 5, 3, 4, 2}, 3));
        System.out.println(new ProblemWithGivenDiff().solve(new int[]{8, 12, 16, 4, 0, 20}, 4));
        System.out.println(new ProblemWithGivenDiff().solve(new int[]{8, 5, 1, 10, 5, 9, 9, 3, 5, 6, 6, 2, 8, 2, 2, 6, 3, 8, 7, 2, 5, 3, 4, 3, 3, 2, 7, 9, 6, 8, 7, 2, 9, 10, 3, 8, 10, 6, 5, 4, 2, 3}, 3));
    }


}
