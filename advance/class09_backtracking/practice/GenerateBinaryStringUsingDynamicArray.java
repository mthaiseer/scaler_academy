package advance.class09_backtracking.practice;

import java.util.ArrayList;
import java.util.List;

public class GenerateBinaryStringUsingDynamicArray {

    static List<List<Integer>> allString = new ArrayList<>();
    void generateBinaryString(List<Integer> result, int idx, int N ){

        if(N == idx){
            allString.add(new ArrayList<>(result));
            return;
        }

        result.add(0);
        generateBinaryString(result, idx+1, N);
        result.remove(result.size()-1);

        //backtracking
        result.add(1);
        generateBinaryString(result, idx+1, N);
        result.remove(result.size()-1);



    }

    public static void main(String[] args) {
        new GenerateBinaryStringUsingDynamicArray().generateBinaryString(new ArrayList<>(), 0, 2);
        System.out.println(allString);
    }

}
