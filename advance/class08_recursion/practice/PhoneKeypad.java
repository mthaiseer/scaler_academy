package advance.class08_recursion.practice;

import java.util.ArrayList;
import java.util.List;

public class PhoneKeypad {

    String[] mapping = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz",


    };
    List<String> printKeypad(String digit){

        if(digit == null){
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();
        result.add("");

        for(char d: digit.toCharArray()){

            List<String> list  = new ArrayList<>();
            for(String comb : result){

                for(char c: mapping[d -  '0'].toCharArray()){
                   list.add(comb+c);
                }


            }
        result = list;

        }

    return result;


    }

    public static void main(String[] args) {

        String input = "23";

        System.out.println(new PhoneKeypad().printKeypad(input));

    }

}
