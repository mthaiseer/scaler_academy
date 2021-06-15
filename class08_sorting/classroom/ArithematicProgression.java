package class08_sorting.classroom;

import java.util.*;

public class ArithematicProgression {

    public int solve(List<Integer> A) {

        if (A == null || A.size() == 0) return 0;

        int min = Integer.MAX_VALUE;
        int nextMin =Integer.MAX_VALUE;
        Set<Integer> cache = new HashSet<>();

        for(int i=0; i<A.size(); i++){
            min = Math.min(min, A.get(i));
        }

        for(int i=0; i<A.size(); i++){
            if(A.get(i) > min){
                nextMin = Math.min(nextMin, A.get(i));
            }

        }
        //No second min
        if(nextMin == Integer.MAX_VALUE){
            nextMin = min;
        }

        System.out.println(min + " " + nextMin);

        //find common difference
        int commonDiff = nextMin - min;
        int currentMin = min;

        //store all to hash set
        for(int a: A){
            cache.add(a);
        }

        //check next sequence available in Set
        for(int i=1; i<A.size(); i++){

            if(cache.contains(currentMin+commonDiff)){
                currentMin = currentMin+commonDiff;
            }else{
                return 0;
            }
        }

        return 1;


    }

    public static void main(String[] args) {
        ArithematicProgression obj = new ArithematicProgression();
       System.out.println(obj.solve(Arrays.asList(3,1,5)));
       //System.out.println(obj.solve(Arrays.asList(5,5,5,5)));//
       //System.out.println(obj.solve(Arrays.asList(2, 4, 1)));

    }

}
