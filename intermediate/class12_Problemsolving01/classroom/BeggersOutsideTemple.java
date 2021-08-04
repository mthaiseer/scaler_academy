package intermediate.class12_Problemsolving01.classroom;

import java.util.ArrayList;
import java.util.List;

public class BeggersOutsideTemple {

    public ArrayList<Integer> solveNaive(int A, ArrayList<ArrayList<Integer>> B) {

        int [] beggers = new int[A];

        for(List l: B){

            int x = (int)l.get(0) ==  0? 0: (int)l.get(0)-1;
            int y =  (int)l.get(1)-1;
            int coin = (int)l.get(2);

            for(int start =x; start<=y; start++){
                beggers[start] +=coin;
            }

        }

        for(int x: beggers){
            System.out.print(x + " ");
        }
        System.out.println();
        return null;
    }

    public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {

        int N = A-1;
        int [] beggers = new int[A];
        ArrayList<Integer> result  = new  ArrayList<Integer>();

        for(List l: B){
            int leftIndex = (int)l.get(0) ==0 ? 0: (int)l.get(0)-1;
            beggers[leftIndex]  += (int)l.get(2);

           if((int)l.get(1) > N == false){
               beggers[(int)l.get(1)] +=-((int)l.get(2));
           }
        }

        for(int i=1; i<beggers.length; i++){
            beggers[i] = beggers[i-1]+beggers[i];
        }


        for(int n: beggers){
            result.add(n);
        }
        return  result;
    }

    public static void main(String[] args) {
        BeggersOutsideTemple obj = new BeggersOutsideTemple();

        ArrayList<ArrayList<Integer>> B = new ArrayList<>();

        ArrayList w1 = new ArrayList();
        w1.add(1);
        w1.add(2);
        w1.add(10);
        B.add(w1);

        ArrayList w2 = new ArrayList();
        w2.add(2);
        w2.add(3);
        w2.add(20);
        B.add(w2);

        ArrayList w3 = new ArrayList();
        w3.add(2);
        w3.add(5);
        w3.add(25);
        B.add(w3);

        obj.solveNaive(5, B);
        ArrayList<Integer> result = obj.solve(5, B);
        System.out.println("result 2");
        for(int x: result){
            System.out.print(x+ " ");
        }

    }
}
