package GFG_MATH.GCD_LCM04;

public class FindLCM {

    int lcmNaive(int a, int b){

        int res = Math.max(a, b);
        while(true){
            if(res % a == 0 && res%b == 0){
                break;
            }
            res++;
        }
         return res;
    }

    // lcm = (a*b) / gcd(a, b)
    int lcmOptimized(int a, int b){

        int gcd = gcd(a, b);
        return (a*b)/gcd;
    }

    private int gcd(int a, int b) {

        if(b ==0) return a;
        return gcd(b , a%b);
    }

    public static void main(String[] args) {
        FindLCM obj = new FindLCM();
        System.out.println(obj.lcmNaive(4, 6));
        System.out.println(obj.lcmOptimized(4, 6));
    }
}
