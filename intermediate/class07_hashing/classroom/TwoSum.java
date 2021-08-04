package intermediate.class07_hashing.classroom;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public int[] twoSum(final int[] A, int B) {

        int result [] = new int[2];
        Map<Integer, Integer>  cache = new HashMap<>();

        for(int i=0; i<A.length; i++) {

            int key = B - A[i];

            if (cache.containsKey(key)) {

                int preIndex  =  cache.get(key);
                int currentIndex = i+1;
                result[0] = preIndex;
                result[1] = currentIndex;
                return result;
            } else {
                if(!cache.containsKey(A[i])){
                    cache.put(A[i], i + 1);
                }

            }
        }
        return new int[]{};
    }



    public static void main(String[] args) {

        TwoSum obj = new TwoSum();
        //int result [] =  obj.twoSum(new int[] {2, 7, 11, 15, 20}, 91);
        int result [] =  obj.twoSum(new int[] {1,2,2,3,-5}, -3);
       // int result [] =  obj.twoSum(new int[] {-10, -10, -10}, -5);
        for(int x: result){
            System.out.print(x +  " ");
        }
    }


}
