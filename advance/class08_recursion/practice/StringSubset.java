package advance.class08_recursion.practice;

public class StringSubset {

    void subset(String input, int i, String partial){

        if(i == input.length()){
            System.out.println(partial);
            return;
        }

        subset(input, i+1, partial);
        subset(input, i+1, partial+input.charAt(i));



    }

    public static void main(String[] args) {
       new StringSubset().subset("123", 0, "");
    }
}
