package advance.class09_backtracking.homework;

public class UniquePathIII {

    int xx[] = {1,0,0, -1};
    int yy[] = {0,1,-1, 0};


    public int solve(int[][] A) {

        int R = A.length;
        int  C = A[0].length;

        int sRow = -1;
        int sCol = -1;
        int zeroCount =0;

        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){

                if(A[i][j] == 0){
                    zeroCount++;
                }

                if(A[i][j] == 1){
                    sRow = i;
                    sCol = j;
                }


            }

        }

        if(sRow == -1){
            return 0;
        }

        int count  = 0;
        findPath(A, sRow, sCol,zeroCount+1,  count);
        return count;
    }

    boolean isSafe(int u, int v, int A[][]){

        return (0<=u && u<A.length && 0<=v && v<A[0].length&& A[u][v] != -1);


    }

    private void  findPath(int[][] A, int sRow, int sCol, int zeroCount, int count) {


        if(A[sRow][sCol] == 2){
            if(zeroCount == 0){
                count++;
            }
            return;


        }

        A[sRow][sCol] = -1;
        for(int i=0; i<4; i++){

            int u = sRow+xx[i];
            int v = sCol+ yy[i];

            if(isSafe(u, v, A)){
                findPath(A, u, v, zeroCount-1, count);
            }

        }
    }

    public static void main(String[] args) {


        int A[][] = {

                {1, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 2, -1}


        };

        System.out.println(new UniquePathIII().solve(A));
    }


}
