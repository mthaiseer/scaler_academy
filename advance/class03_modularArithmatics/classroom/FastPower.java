package advance.class03_modularArithmatics.classroom;

public class FastPower {

    int power(int x, int y)
    {
        int temp;
        if( y == 0)
            return 1;
        temp = power(x, y / 2);
        if (y % 2 == 0)
            return temp*temp;
        else
            return x*temp*temp;
    }

    long fastPower(int a, int b, int m){

        if(b == 0) return 1;

        if(b % 2 == 0 ){
            return fastPower( (a*a)%m, b/2, m);
        }
        return a* fastPower((a*a)%m, b/2, m);
    }

    public static void main(String[] args) {
        FastPower obj = new FastPower();
        //System.out.println(obj.fastPower(2, 394134213, 1000000007));
        System.out.println(obj.power(2, 394134213));
    }

}
