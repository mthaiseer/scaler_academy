package advance.class09_backtracking.homework;

import java.util.ArrayList;

public class PalidromePartitioning {


    boolean isPalidrome(String input){

        if(input == null || input.length() ==0){
            return false;

        }

        int start =0;
        int end = input.length()-1;

        while(start < end){

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

        partitionHelper(a,  new ArrayList<String>(), result , "");
        return result;


    }

    private void partitionHelper(String A,  ArrayList<String> partial,   ArrayList<ArrayList<String>>  result, String cache) {


        if(A.length() ==0){
            result.add(new ArrayList<>(partial));
            return;

        }

        for(int i=0;i <A.length(); i++){

            cache = A.substring(0, i+1);
            if(isPalidrome(cache)){
                partial.add(cache);
                partitionHelper(A.substring(i+1), partial, result, cache);
                partial.remove(partial.size()-1);
            }



        }


    }

    public static void main(String[] args) {
        PalidromePartitioning obj = new PalidromePartitioning();
        System.out.println(obj.partition("aab"));
    }

}
