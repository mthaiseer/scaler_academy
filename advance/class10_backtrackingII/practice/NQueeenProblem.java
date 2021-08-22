package advance.class10_backtrackingII.practice;

/**
 * 1. try to place queen in each row, column
 * 2. check is safe by checking left, left Diagonal and right diagonal
 * - if safe then place queen in that row, col and try next row
 * - else remove queen and try next column or backtrack to upper row
 */
public class NQueeenProblem {


    private boolean isSafe(int[][] board, int row, int col, int N) {


        //check each column above have queen placed
        for (int i = 0; i <row; i++) {
            if(board[i][col] == 1){
                return false;
            }
        }

        int x = row;
        int y = col;

        //check left diagonal
        while (x >= 0 && y >= 0) {

            if (board[x][y] == 1) {
                return false;
            }
            x--;
            y--;

        }

        x = row;
        y = col;

        //check right diagonal
        while (x >= 0 && y < N) {

            if (board[x][y] == 1) {
                return false;
            }
            x--;
            y++;

        }


        return true;
    }

    boolean solveNQueen(int[][] board, int row, int N) {

        if (row == N) {
            //print solution board
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {

                    if (board[i][j] == 0) {
                        System.out.print("_ ");
                    } else {
                        System.out.print("Q ");
                    }
                }
                System.out.println();
            }
            System.out.println("*************");
            return true;
        }


        for (int col = 0; col < N; col++) {

            if (isSafe(board, row, col, N)) {

                board[row][col] = 1;
                boolean isSafe =  solveNQueen(board, row + 1, N);

                //backtrack
                board[row][col] = 0;

            }
        }
        return false;
    }

    public static void main(String[] args) {

        int N = 4;
        int[][] board = new int[N][N];
        new NQueeenProblem().solveNQueen(board, 0, N );

    }


}
