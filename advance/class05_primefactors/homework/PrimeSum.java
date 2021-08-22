package advance.class05_primefactors.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeSum {


    public ArrayList<Integer> primesum(int A) {

        boolean [] seive = new boolean[A+1];
        Arrays.fill(seive, true);
        calculateSeive(seive, A);
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=2; i<=A; i++){

            int potentialAns  = A - i;

            if(seive[i] && seive[potentialAns]){

                ans.add(i);
                ans.add(potentialAns);
                break;

            }




        }

        return ans;

    }

    private void calculateSeive(boolean[] seive, int A) {

        seive[0] = false;
        seive[1] = false;
        for(int i=2; i*i<=A; i++){

            for(int j= i*i; j<=A; j+=i){
                seive[j] = false;
            }

        }

    }

    public static void main(String[] args) {
        System.out.println(new PrimeSum().primesum(4));
        System.out.println(new PrimeSum().primesum(12));
    }




}
