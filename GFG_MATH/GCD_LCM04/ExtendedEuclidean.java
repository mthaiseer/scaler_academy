package GFG_MATH.GCD_LCM04;

import java.util.concurrent.atomic.AtomicInteger;

class ExtendedEuclidean {
    // Recursive function to demonstrate the extended Euclidean algorithm.
    // It uses pointers to return multiple values.
    public static int extended_gcd(int a, int b, AtomicInteger x, AtomicInteger y) {
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

    public static void main(String[] args) {
        int a = 18;
        int b = 30;

        AtomicInteger x = new AtomicInteger(), y = new AtomicInteger();

        System.out.println("The GCD is " + extended_gcd(a, b, x, y));
        System.out.printf("x = %d, y = %d\n", x.get(), y.get());
        System.out.println("a * x + b * y == GCD(a, b)" + " :"+ ( (a* x.get())+ (b * y.get()))+ "=== " +extended_gcd(a, b, x, y));
    }
}