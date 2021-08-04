package intermediate.class16_problemsolving05.classroom;

import java.util.ArrayList;
import java.util.List;

public class XORQueries {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {

        int[] prefix = new int[A.size()+1];
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        prefix[0] = 0;
        for(int i=1; i<=A.size(); i++){
            prefix[i] = prefix[i-1]+A.get(i-1);
        }

        for(List<Integer> subQuery : B){

            int L = subQuery.get(0);
            int R = subQuery.get(1);
            ArrayList<Integer> subResult  = new ArrayList<>();


            int size  = R-L+1;
            int countOnes = prefix[R] - prefix[(L-1)];
            int zeros = size - countOnes;

            int xorResult = countOnes%2 ==0 ? 0: 1;

            subResult.add(xorResult);
            subResult.add(zeros);
            result.add(subResult);
        }



        return result;
    }

    public static void main(String[] args) {
        XORQueries obj = new XORQueries();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(0);
        A.add(0);
        A.add(0);
        A.add(1);

        ArrayList<ArrayList<Integer>> B = new ArrayList<>();

        ArrayList<Integer> B1 = new ArrayList<>();
        B1.add(2);
        B1.add(4);
        B.add(B1);

        ArrayList<Integer> B2 = new ArrayList<>();
        B2.add(1);
        B2.add(5);
        B.add(B2);

        ArrayList<Integer> B3 = new ArrayList<>();
        B3.add(3);
        B3.add(5);
        B.add(B3);

        System.out.println(obj.solve(A, B));






    }

}
