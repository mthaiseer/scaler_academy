package intermediate.class07_hashing.basics;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingNumber {


    private int solve(int arr[], int n){

        Map<Integer, Integer> cache = new HashMap<>();
        for(int i=0; i<n; i++){

            if(cache.containsKey(arr[i])){
                cache.put(arr[i], cache.get(arr[i])+1);
            }else{
                cache.put(arr[i], 1);
            }
        }

        for(int i=0; i<n; i++){
            if(cache.get(arr[i]) ==1 ){
                return arr[i];
            }
        }



        return -1;
    }

    public static void main(String[] args) {

        FirstNonRepeatingNumber obj = new FirstNonRepeatingNumber();
        int[] arr = {2,4, 1,2,1,5,8,0,8};
        int s = obj.solve(arr , arr.length );
        System.out.println(s);

    }
}
