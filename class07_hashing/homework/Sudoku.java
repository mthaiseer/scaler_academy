package class07_hashing.homework;

import java.util.HashSet;
import java.util.Set;

public class Sudoku {
    public int isValidSudoku(final String[] A) {

        for(int i=0; i<A.length; i++){

            String row = A[i];
            Set<Character> charSet = new HashSet<>();

            for(int j=0; j<row.length(); j++){

                char el = row.charAt(j);
                if(charSet.contains(el)){
                    return 0;
                }

                if(el != '.'){
                    charSet.add(el);
                }

            }

            charSet = new HashSet<>();


        }

        return 1;
    }

    public static void main(String[] args) {
        Sudoku obj = new Sudoku();
        System.out.println(obj.isValidSudoku(new String[]{
                "53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"
        }));
    }


}
