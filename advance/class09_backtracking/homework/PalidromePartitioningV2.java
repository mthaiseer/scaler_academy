package advance.class09_backtracking.homework;

import java.util.ArrayList;

public class PalidromePartitioningV2 {

    boolean isPalidrome(String input, int start, int end){

        if(input == null || input.length() ==0){
            return false;
        }

        if(start < end){

            if(input.charAt(start) != input.charAt(end)){
                return false;
            }
            start++;
            end--;

        }

        return true;
    }

    public ArrayList<ArrayList<String>> partition(String a) {
        ArrayList<ArrayList<String>>  result = new ArrayList<>();

        partitionHelper(a, 0,  new ArrayList<String>(), result , "");
        return result;
    }

    private void partitionHelper(String S, int i,  ArrayList<String> partial,   ArrayList<ArrayList<String>>  result, String cache) {

        if( i == S.length()){
            result.add(new ArrayList<>(partial));
            return;
        }

        for(int j = i; j<S.length(); ++j){

            if(isPalidrome(S, i, j)){

                partial.add(S.substring(i, j-i+1));
                partitionHelper(S, j+1, partial, result, cache);
                partial.remove(partial.size()-1);


            }


        }

    }

    public static void main(String[] args) {
        System.out.println(new PalidromePartitioningV2().partition("aab"));
    }



}
