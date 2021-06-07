package class05_2DArrays.classroom;

import java.util.ArrayList;
import java.util.List;

public class AntiDiagonal {

    public int[][] diagonal(int[][] A) {

        int size = A.length;
        int N = 2 * size -1;

        List<List<Integer>> result = new ArrayList<>(N);

        for(int i=0; i<N; i++){
            result.add(new ArrayList<>());
        }

        for(int i=0;i<size; i++){

            for(int j=0; j<size; j++){

                result.get(i+j).add(A[i][j]);

            }

        }


        int[][] array = new int[result.size()][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[result.get(i).size()];
        }
        for(int i=0; i<result.size(); i++){
            for (int j = 0; j < result.get(i).size(); j++) {
                array[i][j] = result.get(i).get(j);
            }
        }
        return array;
    }

    void print2DArray(int arr[][]){

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        AntiDiagonal obj = new AntiDiagonal();
        int[][] diagonal = obj.diagonal(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        });
         obj.print2DArray(diagonal);

        System.out.println("------------------------");

        int[][] diagonal2 =obj.diagonal(new int[][] {
                {1,2},
                {3,4}

        });
        obj.print2DArray(diagonal2);



    }

}
