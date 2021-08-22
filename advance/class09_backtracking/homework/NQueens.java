package advance.class09_backtracking.homework;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NQueens {

    public ArrayList<ArrayList<String>> solveNQueens(int A) {

        ArrayList<ArrayList<String>> result  = new ArrayList<>();
        int [][] board = new int[A][A];
        nQueenHelper(board, 0, A, result);
        return result;
    }


    private boolean isSafe(int[][] board, int row, int col, int N) {

        //keep row change and col static to test any queen placed on top row wise
        for(int i=0; i<row; i++){
            if(board[i][col] ==1 ){
                return false;

            }
        }

        //check left diagonal board[row-i][col-i]
        int r = row;
        int c = col;

        while(r>=0 && c>=0){

            if(board[r][c] ==1 ){
                return false;
            }
            r--;
            c--;

        }

        //check left diagonal board[row-i][col+i]
         r = row;
         c = col;

        while(r>=0 && c< N){

            if(board[r][c] ==1 ){
                return false;
            }
            r--;
            c++;

        }


        return true;
    }

    private boolean nQueenHelper(int[][] board, int row, int N, ArrayList<ArrayList<String>> result) {

        if(row  == N){

            ArrayList<String> subProblem = new ArrayList<>();


            for(int i=0; i<N; i++){
                StringBuffer buffer = new StringBuffer();
                for(int j=0; j<N; j++){

                    if(board[i][j] ==  0){
                        buffer.append(".");

                    }else{
                        buffer.append("Q");
                    }


                }
                subProblem.add(buffer.toString());
            }
           result.add(subProblem);
            return true;
        }

        //try to place queen in each column in row
        for(int col = 0; col < N; col++){

            if(isSafe(board, row, col, N)){

                board[row][col] = 1;
                nQueenHelper(board, row+1, N, result);
                //backtrack
                board[row][col] = 0;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new NQueens().solveNQueens(4));
        System.out.println(new NQueens().solveNQueens(1));
    }


}
