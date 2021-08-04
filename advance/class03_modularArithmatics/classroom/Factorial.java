package advance.class03_modularArithmatics.classroom;

public class Factorial {

    long  factorial(int n, int m) {
        long ans = 1;

        for (int i = 1; i <= n; i++) {
            ans = ((ans%m) * (i % m) + m)%m;


        }
        return  ans;
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
       // System.out.println(obj.factorial(100000, 1000000007));
       // System.out.println(obj.factorial(5, 1000000007));
        System.out.println(obj.factorial(27, 1000000007));

    }


}
