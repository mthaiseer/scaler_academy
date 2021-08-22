package advance.class08_recursion.homework;


import java.util.ArrayList;

public class PhoneLetters {

    String[] mapping = {
            "0",
            "1",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz",


    };

    public ArrayList<String> letterCombinations(String A) {

        if(A == null){
            return new ArrayList<>();
        }

        ArrayList<String> result  = new ArrayList<>();
        result.add("");
        for(char d : A.toCharArray()){

            ArrayList<String> list  = new ArrayList<>();


            for(String comb : result){

                for(char c: mapping[d - '0'].toCharArray()){

                    list.add(comb+c);

                }

            }

            result = list;

        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(new PhoneLetters().letterCombinations("23"));
    }


}
