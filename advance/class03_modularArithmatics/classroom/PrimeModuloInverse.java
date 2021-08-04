package advance.class03_modularArithmatics.classroom;

import java.util.concurrent.atomic.AtomicInteger;

public class PrimeModuloInverse {



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


    public int solve(int A, int B) {

        AtomicInteger x = new AtomicInteger(), y = new AtomicInteger();
       extended_gcd(A, B, x,y);

        int result  = (x.get()+B)%B;
        return result;

    }

    public static void main(String[] args) {
        PrimeModuloInverse obj = new PrimeModuloInverse();
        System.out.println(obj.solve(3,5));
        System.out.println(obj.solve(6,23));
    }

}
