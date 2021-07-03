package class14_problemsolving03.classroom;

import java.util.Arrays;

public class SumTheDifference {


    public int solve(int[] A) {

        long  maxi = 0;
        long  mini =0;

        long [] powers = new long[1001];

        powers[0]=1;
        for (int i=1; i<1001; i++){
            powers[i] = powers[i-1] * 2 % 1000000007;
        }

        Arrays.sort(A);

        for(int i=0; i<A.length; i++){
            mini += powers[i] %  1000000007* A[i];
        }

        int exp =0;
        for(int i=A.length-1; i>=0; i--){
            maxi +=  powers[exp]% 1000000007* A[i];
            exp++;
        }

        return (int)((mini - maxi) %1000000007);

    }



    public static void main(String[] args) {
        SumTheDifference obj = new SumTheDifference();
        System.out.println(obj.solve(new int[] {1, 2,3,5,7}));
        System.out.println(obj.solve(new int[] {1}));
        System.out.println(obj.solve(new int[] {1, 2}));
    }


}
