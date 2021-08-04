package GFG_MATH.modulo;

import java.util.concurrent.atomic.AtomicInteger;

public class MultiplicativeModuloInverse {

    int gcd(int a, int b){
        if(b == 0){
            return a;
        }

        return gcd(b, a%b);
    }

    public int extended_gcd(int a, int b, AtomicInteger x, AtomicInteger y) {
        if (b == 0) {
            x.set(1);
            y.set(0);
            return a;
        }

        AtomicInteger _x = new AtomicInteger(), _y = new AtomicInteger();
        int gcd = extended_gcd(b, a%b, _x, _y);


        x.set(_y.get());
        y.set(_x.get() - (a/b) * _y.get());

        return gcd;
    }

    int moduloInverse(int a, int m){

        if(gcd(a, m)  != 1){
            throw new RuntimeException("No inverse exists");
        }
        AtomicInteger x = new AtomicInteger(), y = new AtomicInteger();
        extended_gcd(a, m, x, y);

        int result  = (x.get()+m)%m;
        return result;

    }


    public static void main(String[] args) {
        int a = 6;
        int m =7;

        MultiplicativeModuloInverse obj = new MultiplicativeModuloInverse();
        int result = obj.moduloInverse(6,7);
        System.out.println(result);//6 => a* result % 7 =1 ==> 6* 6 %7 =1

        int result2 = obj.moduloInverse(18,7);
        System.out.println(result2); //2

        int result3 = obj.moduloInverse(3,5);
        System.out.println(result3); //2

        int result4 = obj.moduloInverse(6,23);
        System.out.println(result4); //2


    }
}
