package advance.class09_backtracking.homework;

import java.util.ArrayList;
import java.util.List;

public class WordProblemIII {


    public ArrayList<String> wordBreak(String A, ArrayList<String> B) {

        ArrayList<String> globalAns =  new ArrayList<>();
        ArrayList<String> partial =  new ArrayList<>();
        wordBreak(A, B, "", partial, globalAns );
        return globalAns;

    }

    private void wordBreak(String A, ArrayList<String> dictionary, String word,   ArrayList<String> partial ,  ArrayList<String> globalAns) {


        if(A.length() == 0){

            StringBuffer buffer = new StringBuffer();
            for(String p: partial){
                buffer.append(p).append(" ");
            }
            globalAns.add(buffer.toString().trim());

            return;
        }

        for(int i=0; i<A.length(); i++){

            String currentWord = A.substring(0, i+1);
            if(dictionary.contains(currentWord)){
               partial.add(currentWord);
               wordBreak(A.substring(i+1), dictionary, word, partial, globalAns);
               partial.remove(partial.size()-1);
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<String> dic = new ArrayList<>();
        dic.add("cat");
        dic.add("cats");
        dic.add("and");
        dic.add("sand");
        dic.add("dog");

        String A = "catsanddog";

        System.out.println(new WordProblemIII().wordBreak(A, dic));

    }


}
