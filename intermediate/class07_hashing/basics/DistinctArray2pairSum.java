package intermediate.class07_hashing.basics;

import java.util.HashMap;
import java.util.Map;

public class DistinctArray2pairSum {

    void solve(int arr[]){

        Map<Integer, int[]> cache = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){

                int key  = arr[i]+ arr[j];

                if(cache.containsKey(key)){

                    System.out.println(key);

                    int[] preIndeces = cache.get(key);
                    System.out.println(preIndeces[0] + " "+ preIndeces[1] + " "+ i + " "+ j);
                    return;



                }else {
                    int[] indices = new int[2];
                    indices[0] = i;
                    indices[1] = j;
                    cache.put(key, indices);
                }
            }

        }



    }

    public static void main(String[] args) {
        DistinctArray2pairSum obj = new DistinctArray2pairSum();
        //2 4 6 3 1 5
        obj.solve(new int[] {2,4,6,3,1,5});

    }
}
