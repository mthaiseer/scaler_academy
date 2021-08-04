package GFG_MATH.exponentiation;

public class FastExponentBitwise {

    long expo(int a, int b, int m){

        int result  =1;

        while(b > 0){

            if((b&1) ==1){

                result = result * a %m;

            }

            a = a*a;
            b = b>>1;

        }
      return result;

    }

    public static void main(String[] args) {
        System.out.println(new FastExponentBitwise().expo(5,4,100));
    }
}
