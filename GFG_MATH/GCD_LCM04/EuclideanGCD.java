package GFG_MATH.GCD_LCM04;

public class EuclideanGCD {

    int euclidean(int a, int b){

        if(b == 0){
            return a;
        }

        return euclidean(b, a%b);

    }

    public static void main(String[] args) {
        System.out.println(new EuclideanGCD().euclidean(10, 12));
        System.out.println(new EuclideanGCD().euclidean(9, 11));
    }
}
