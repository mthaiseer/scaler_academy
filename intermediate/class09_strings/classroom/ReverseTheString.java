package intermediate.class09_strings.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ReverseTheString {

    public String solve(String A) {


        List<String> list  = new ArrayList<>();
        StringTokenizer token = new StringTokenizer(A);
        while (token.hasMoreTokens()){
            list.add(token.nextToken());
        }

        StringBuilder  builder = new StringBuilder();
        for(int i=list.size()-1; i>=0; i--){

            builder.append(list.get(i));
            if(i !=0){
                builder.append(" ");
            }

        }

        return builder.toString();
    }



    public static void main(String[] args) {

        ReverseTheString obj = new ReverseTheString();
        System.out.println(obj.solve("sky  is blue "));

    }
}
