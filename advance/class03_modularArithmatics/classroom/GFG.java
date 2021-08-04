package advance.class03_modularArithmatics.classroom;

class GFG {


    static long power(long x,
                      long y, long p) {
        long res = 1;

        x = x % p;

        while (y > 0) {
            if ((y & 1) > 0)
                res = (res * x) % p;

            y = y >> 1; // y = y/2
            x = (x * x) % p;
        }
        return res;
    }

    // Driver Code
    public static void main(String[] args) {
        long a = 3;
        long MOD = 1000000007;
        int remainderB = (int)(1000011 % (MOD - 1));
        System.out.println(power(a, remainderB, MOD));

        System.out.println(power(5,5, MOD));
    }
}
