package intermediate.class08_sorting.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StepwiseSelectionSort {


    public int[] solve(int[] A) {
        if(A == null || A.length == 0 ) return new int[]{};

        List<Integer> resultArray = new ArrayList<>();

        int minIndex;

        for(int i=0; i<A.length-1; i++){

            minIndex = Integer.MAX_VALUE;
            int minval = Integer.MAX_VALUE;

            for(int j=i; j<A.length;j++){

                if(A[j] < minval){
                    minval  = Math.min(minval, A[j]);
                    minIndex = j;
                }


            }

            swapme(A, i, minIndex);
            resultArray.add(minIndex);


        }

        int[] result  = new int[resultArray.size()];
        for(int i=0; i<resultArray.size(); i++){
            result[i] = resultArray.get(i);
        }

        return result;
    }

    private void swapme(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }


    public static void main(String[] args) {
        StepwiseSelectionSort obj = new StepwiseSelectionSort();
       int[] a =  obj.solve(new int[]{6, 4, 3, 7, 2, 8});
        Arrays.stream(a).forEach(i-> System.out.print(i+  " "));


    }

}
