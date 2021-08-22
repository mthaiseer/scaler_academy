package advance.class08_recursion.classroom;

import java.util.ArrayList;
import java.util.List;

public class GenerateBrackets {

    public ArrayList<String> generateParenthesis(int A) {

        ArrayList<String>  result  = new ArrayList<>();
        generateParenthesis(A, result, 0, 0,  new StringBuffer());
        return result;



    }

    private void generateParenthesis(int A, List<String> result, int open, int close, StringBuffer buffer) {

        if(buffer.length() == (A*2) ){
            result.add(buffer.toString());
            return;
         }

        if(open > A) return;

        if(open < A){
            buffer.append("(");
            generateParenthesis(A, result, open+1, close, buffer);
            buffer.deleteCharAt(buffer.length()-1);
        }

        if(close< open){
            buffer.append(")");
            generateParenthesis(A, result, open, close+1, buffer);
            buffer.deleteCharAt(buffer.length()-1);
        }

    }

    public static void main(String[] args) {
        System.out.println(new GenerateBrackets().generateParenthesis(2));
       // System.out.println(new GenerateBrackets().generateParenthesis(1));
    }

}
