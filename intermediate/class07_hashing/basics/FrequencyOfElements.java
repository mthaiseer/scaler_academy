package intermediate.class07_hashing.basics;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {

    void countFrequency(int arr[], int n){

        Map<Integer, Integer> cache = new HashMap<>();
        for(int i=0; i<arr.length; i++){

            if(cache.containsKey(arr[i])){
                cache.put(arr[i], cache.get(arr[i])+1);
            }else{
                cache.put(arr[i], 1);
            }
        }
        System.out.println(cache);

    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,1,6,3,8,6,6};
        new FrequencyOfElements().countFrequency(arr, arr.length);

    }
}
