package intermediate.class15_problemsolving04.classrom;

import java.util.ArrayList;
import java.util.List;

public class SumMatrixSum {

    public int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {

        int ROW = A.length;
        int COL = A[0].length;
        long [][] PS = new long[ROW+1][COL+1];
        List<Integer> result = new ArrayList<>();

        for(int i=1; i<=ROW; i++){
            for(int j=1; j<=COL; j++){
                PS[i][j] =  PS[i][j-1]+ A[i-1][j-1];
            }
        }

        for(int i=1;i<=COL; i++){
            for(int j=1; j<=ROW; j++){

                PS[j][i] += PS[j-1][i];


            }
        }

        for(int i=0; i<B.length; i++){
            int a = B[i];
            int b = C[i];
            int c = D[i];
            int d = E[i];

            int r =  (int)((PS[c][d] - PS[c][b-1]-PS[a-1][d]+ PS[a-1][b-1])%1000000007);

            if(r < 0) r += 1000000007;
            result.add(r);
        }

        int res[] = new int [result.size()];
        int idx =0;
        for(int  x: result){
            res[idx] =x;
            idx++;
        }

        return res;

    }

    void printMatrix(int A[][]) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
            SumMatrixSum obj = new SumMatrixSum();

            int R[] = obj.solve(new int[][]{
                            {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}
                           },
                    new int[]{1, 2},
                    new int[]{1, 2},
                    new int[]{2, 3},
                    new int[]{2, 3});

            for(int x: R){
                System.out.print(x + " =>");
            }

        System.out.println();
        int R2[] = obj.solve(new int[][]{
                        {5, 17, 100, 11},
                        {0, 0,  2,   8}
                },
                new int[]{1, 1},
                new int[]{1, 4},
                new int[]{2, 2},
                new int[]{2, 4});

        for(int x: R2){
            System.out.print(x + " =>");
        }


        }

    }
