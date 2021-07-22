package class14_problemsolving03.classroom;

import java.util.HashMap;
import java.util.Map;

public class ContigousArray {

    public int solve(int[] A) {

        Map<Integer, Integer> indexMap = new HashMap<>();
        int maxval = Integer.MIN_VALUE;
        int sum = 0;

        //sum and index
        indexMap.put(0, -1);

        for(int i=0; i<A.length; i++){
            if(A[i] == 0 ){
                A[i] = -1;
            }
        }

        for(int i=0; i<A.length; i++){

            sum =  sum+ A[i];

            if(indexMap.containsKey(sum) ){
                int prevIndex =  indexMap.get(sum);
                maxval = Math.max(maxval, i-prevIndex);
            }else{
                indexMap.put(sum, i);
            }

        }
        return maxval;
    }

    public static void main(String[] args) {
        ContigousArray obj = new ContigousArray();
        System.out.println(obj.solve(new int[] {1,0,1,0,1}));
        System.out.println(obj.solve(new int[] {1, 1, 1, 0}));
    }
}
