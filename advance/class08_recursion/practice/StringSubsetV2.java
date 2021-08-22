package advance.class08_recursion.practice;

public class StringSubsetV2 {

    void subset(char[] input, char[] output, int i, int j){

        if( i== input.length){

            if(j < input.length){
                output[j] = '\0';
            }
            System.out.println(output);
            return;
        }

        output[j] = input[i];
        subset(input, output, i+1, j+1);
        subset(input, output, i+1, j);
    }

    public static void main(String[] args) {
        char[] input = {'A', 'B', 'C'};
        char output [] = new char[input.length];
        new StringSubsetV2().subset(input, output, 0, 0);
    }

}
