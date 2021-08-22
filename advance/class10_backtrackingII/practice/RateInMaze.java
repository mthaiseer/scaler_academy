package advance.class10_backtrackingII.practice;

public class RateInMaze {


    void rateInRaze(char board[][], int[][] solution, int startRow, int startCol, int lastRow, int lastCol){

        if(startRow == lastRow && startCol == lastCol){

            solution[startRow][startCol] =1;

            for(int i=0; i<solution.length; i++){
                for(int j=0; j<solution[0].length; j++){
                    System.out.print(solution[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println();
            return;
       }

        if(startRow> lastRow || startCol > lastCol){
            return;
        }

        if(board[startRow][startCol] ==  'X'){
            return;
        }

        solution[startRow][startCol]  =1;
        rateInRaze(board, solution, startRow, startCol+1, lastRow, lastCol);
        rateInRaze(board, solution, startRow+1, startCol, lastRow, lastCol);

        solution[startRow][startCol]  =0;
    }

    public static void main(String[] args) {


        char board[][] = {
                {'0', '0','X','0',},
                {'0', '0','0','X',},
                {'0', '0','X','X',},
                {'0', '0','0','0',}
        };

        int size  = board.length;
        int solution[][] = new int[size][size];

        new RateInMaze().rateInRaze(board, solution, 0, 0, size-1, size-1);

    }

}
