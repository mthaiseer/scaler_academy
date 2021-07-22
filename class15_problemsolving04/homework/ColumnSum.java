package class15_problemsolving04.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColumnSum {


    public int[] solve(int[][] A) {

        int R = A.length;
        int C = A[0].length;
        List<Integer> resList = new ArrayList<>();

        for(int i=0; i<C; i++){

            int sum = 0;
            for(int j=0; j<R; j++){
                sum+=A[j][i];
            }
            resList.add(sum);

        }


        return  resList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        ColumnSum obj = new ColumnSum();
        int R[] =  obj.solve(new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,2,3,4}
        });
        Arrays.stream(R).forEach(x -> System.out.println(x + " "));
    }

}
