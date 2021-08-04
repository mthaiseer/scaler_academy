package advance.class04_GCD.classroom;

public class PUBG {


    public int solve(int[] A) {

        int d = A[0];

        for(int i=1; i<A.length; i++){
            d = gcd(d, A[i]);
        }

        return d;
    }

    int gcd(int a, int b){
        if(b  == 0) return a;
        return gcd(b, a%b);

    }

    public static void main(String[] args) {
        PUBG obj = new PUBG();
        System.out.println(obj.solve(new int[] {6, 4}));
        System.out.println(obj.solve(new int[] {2, 3, 4}));
    }


}
