package advance.class02_Arrays.classroom;

public class RotateMatrix {

    public void solve(int[][] A) {

        int R = A.length;
        int C = A[0].length;

        //transpose matrix
        for(int i=0; i<R; i++){
            for(int j = i+1; j<R; j++){

                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;

            }
        }
         //reverse individual columns
        for(int i=0; i<R; i++){

            int start =0;
            int end = A[i].length-1;
            while(start < end){

                int temp = A[i][start];
                A[i][start] = A[i][end];
                A[i][end] = temp;
                start++;
                end--;
            }
        }

    }

    public static void main(String[] args) {

        int A[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };



        new RotateMatrix().solve(A);
        print(A);
        System.out.println();

        int A2[][] = {
                {1,2},
                {3,4}
        };
        new RotateMatrix().solve(A2);
        print(A2);

        System.out.println();

        int A3[][] = {
                {1}

        };
        new RotateMatrix().solve(A3);
        print(A3);


    }

    static void print(int A[][]){

        int R = A.length;
        int C = A[0].length;

        for(int i=0; i<R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(A[i][j] +  " ");
            }
            System.out.println();
        }

    }

}
