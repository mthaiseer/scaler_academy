package GFG_MATH.GCD_LCM04;

public class GCDFinder {

    /**
     *
     * @param x
     * @param y
     * @return
     */
    int gcdNaive(int x, int y){

        if(x == 0) return y;
        if(y == 0) return x;

        int res = Math.min(x,y);

        while (res >1){

            if(x% res == 0 && y % res ==0){
                break;
            }
            res--;
        }
        return res;
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    int gcdBetter(int x, int y){

        int res = 1;
        while (x != y){

            if(x > y){
                res =  x-=y;
            }else{
                res =  y-=x;
            }


        }
        return res;
    }

    public static void main(String[] args) {
        GCDFinder obj= new GCDFinder();
        System.out.println(obj.gcdNaive(15, 11));
        System.out.println(obj.gcdNaive(50, 25));

        System.out.println("Better solution");
        System.out.println(obj.gcdBetter(15, 11));
        System.out.println(obj.gcdBetter(50, 25));
        System.out.println(obj.gcdBetter(10, 8));
    }

}
