package intermediate.class02_NumberBitManipulation.homework;

public class CountTotalSetBitsBruteForce {

    public static int solve(int A) {
        int result =0;
        for(int i=1; i<=A; i++){
            result+= countCurrentBits(i);
        }
        return result;

    }

    private static int countCurrentBits(int D) {

        int count =0;
        while(D >0){

            count+=D&1;
            D>>=1;

        }
        return  count;

    }

    public static void main(String[] args) {
        System.out.println(solve(3));
    }
}
