package advance.class07_bitwise.homework;

public class TrailingZerosFactorial {

    public int trailingZeroes(int A) {

        int ans =0;
        int Q = 5;

        while(A/Q >0){

            ans += (int)Math.floor(A/Q);
            Q*=5;

        }

        return ans;


    }

    public static void main(String[] args) {
        System.out.println(new TrailingZerosFactorial().trailingZeroes(5));
        System.out.println(new TrailingZerosFactorial().trailingZeroes(10));
        System.out.println(new TrailingZerosFactorial().trailingZeroes(28));
        System.out.println(new TrailingZerosFactorial().trailingZeroes(9247));
    }

}
