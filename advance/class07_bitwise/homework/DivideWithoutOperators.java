package advance.class07_bitwise.homework;

public class DivideWithoutOperators {
    public int divide(int A, int B) {

        return divideHelper(A, B);
    }

    private int   divideHelper(long divident, long  divisor) {

        long sign  =  ( (divident < 0) ^ (divisor < 0)) ? -1: 1;

        divident = Math.abs(divident);
        divisor = Math.abs(divisor);


        long quotient = 0, temp = 0;

        for(int i=31; i>=0; --i){
            if(temp + (divisor<< i) <= divident){
                temp+= divisor<<i;
                quotient |= 1L<<i;
            }
        }


        if(sign == -1){
            quotient = -quotient;
        }

        if(quotient > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }

        return (int)quotient;


    }

    public static void main(String[] args) {
//        System.out.println(new DivideWithoutOperators().divide(10, 3));
//        System.out.println(new DivideWithoutOperators().divide(43, -8));
        System.out.println(new DivideWithoutOperators().divide(-2147483648, -1));
    }
}
