package class05_2DArrays.classroom;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public int[][] solve(int A) {

        if(A<0){
            throw new RuntimeException("Invalid array input");
        }

        int result[][]  = new int[A][];

        for(int i=0; i<A; i++){
            int [] subArray = new int[i+1];
            result[i] = subArray;
            for(int j=0; j<=i; j++){

                if(j == 0 || j ==i){

                    result[i][j] = 1;
                }else{
                    result[i][j] =  result[i-1][j-1] +  result[i-1][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        PascalTriangle obj = new PascalTriangle();
        int R[][] = obj.solve(10);

        for(int i=0; i<R.length; i++){
            for(int j=0; j<R[i].length; j++){
                System.out.print(R[i][j]+  " ");
            }
            System.out.println();
        }

    }

}
