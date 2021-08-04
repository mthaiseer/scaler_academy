package intermediate.class04_array_dynamicarrays.homework;

import java.util.ArrayList;
import java.util.List;

public class MultipleRotationArray {



    public int[][] solve(int[] A, int[] B) {

        int result [][] = new int[A.length][B.length];

        List<List<Integer>> resultList = new ArrayList<>();

        for(int i=0; i<B.length; i++){

            int point = B[i];
            point = point % A.length;
            int aRotated[] =  rotateHelper(A, point);
            List<Integer> subList = new ArrayList<>();
            for(int x: aRotated){
                subList.add(x);
            }
            resultList.add(subList);
        }

        int[][] array = new int[resultList.size()][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[resultList.get(i).size()];
        }
        for(int i=0; i<resultList.size(); i++){
            for (int j = 0; j < resultList.get(i).size(); j++) {
                array[i][j] = resultList.get(i).get(j);
            }
        }
        return array;
    }

    private int[] rotateHelper(int[] A, int point) {

        int B[] = new int[A.length];
        for(int i=0; i<A.length; i++){
            B[i] = A[i];
        }


        rotate(B,0, point-1);
        rotate(B, point, B.length-1);
        rotate(B,0, B.length-1);
        return B;

    }

    private void rotate(int A[], int i, int j) {

        int start = i;
        int end  =j;

        while(start<end){

            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;

            start++;
            end--;

        }



    }

    public static void main(String[] args) {

        MultipleRotationArray obj = new MultipleRotationArray();


        int [] A = {1, 2, 3, 4, 5};
        int B[] = {2,3};

        int [][] result  = obj.solve(A, B);
        System.out.println(result);




    }


}
