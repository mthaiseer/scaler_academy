package class05_2DArrays.classroom;

public class RowMaximumOnes {

    public int solve(int[][] A) {

        if(A == null) return 0;

        int R = A.length-1;
        int C = 0;
        int rEnd = 0;
        int cEnd = A[0].length-1;
        int maxOnesCol = Integer.MIN_VALUE;

        while(rEnd <= R && cEnd >=C){

            if(cEnd>=0 &&  A[rEnd][cEnd] == 1){
                maxOnesCol = Math.max(maxOnesCol, rEnd);
                cEnd--;
            }

            if(cEnd>=0  && A[rEnd][cEnd] == 0){
                rEnd++;
            }
        }
        return maxOnesCol;
    }

    public static void main(String[] args) {

        RowMaximumOnes obj = new RowMaximumOnes();
        int solution  =  obj.solve(new int[][] {
                {0,1,1},
                {0,0,1},
                {0,1,1}
        });

        System.out.println(solution);


         solution  =  obj.solve(new int[][] {
                {0,0,0},
                {0,1,1},
                {0,1,1}
        });

        System.out.println(solution);
        solution  =  obj.solve(new int[][] {
                {1,1,1},
                {0,1,1},
                {0,1,1}
        });

        System.out.println(solution);

        solution  =  obj.solve(new int[][] {
                {0, 0, 0, 0},
                {0, 1, 1, 1}
        });

        System.out.println(solution);
    }



}
