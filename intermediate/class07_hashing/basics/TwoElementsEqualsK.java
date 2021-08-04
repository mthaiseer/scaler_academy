package intermediate.class07_hashing.basics;

import java.util.HashMap;
import java.util.Map;

public class TwoElementsEqualsK {

    void solve(int arr[], int K){
        //element, index
        Map<Integer, Integer> cache = new HashMap<>();

        for(int i=0; i<arr.length; i++){

            if(cache.containsKey(K- arr[i])){

                int leftIndex = cache.get(K- arr[i]);
                int rightIndex = i;

                System.out.println(leftIndex +  " ," + rightIndex);
                break;
            }else{
                cache.put(arr[i], i);
            }
        }
    }

    public static void main(String[] args) {

        TwoElementsEqualsK obj  = new TwoElementsEqualsK();
        obj.solve(new int[]{1,8,2,5,7,9,3,10}, 11);

    }
}
