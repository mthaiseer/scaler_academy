package advance.class05_primefactors.homework;

public class LuckyNumbers {

    public int solve(int A) {

        int primeCount =0;
        int[] seive = new int[A+1];
        calculateSeive(A, seive);

        for(int i=2; i<=A; i++){
            if(seive[i] ==  2){
                primeCount++;
            }
        }


        return primeCount;

    }

    private void calculateSeive(int A, int[] seive) {

        for(int i=2; i<=A; i++){


            if(seive[i] == 0) {

                for(int j = i*2; j<=A; j +=i){
                    seive[j]++;
                }
            }
        }



    }

    public static void main(String[] args) {
        System.out.println(new LuckyNumbers().solve(8));
        System.out.println(new LuckyNumbers().solve(12));
        System.out.println(new LuckyNumbers().solve(40));
    }


}
