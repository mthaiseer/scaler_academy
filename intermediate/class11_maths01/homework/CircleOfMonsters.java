package intermediate.class11_maths01.homework;

/**
 *
 * SUM +=  MAX(0, (health i - damage i-1))
 * Sum  - MAX(0, (health i - damage i-1)) + health i;
 *
 */
public class CircleOfMonsters {

    int calculate(int a, int b, int c ){
        int M = 1000000007;
       // return ( (a%M) -(b%M)-(c%M) %M);
       //  return ( ((a) -(b)-(c)) %M);
        return ( ((a%M) -(b%M)-(c%M)+ M) %M);
    }

    public int solve(int[] A, int[] B) {


        long M = 100000000000000l;

        long sum =0;
        long ans = Integer.MAX_VALUE;
        for(int i=0; i<A.length; i++){
            long health = 0;
            long prevDamage =0;
            if(i == 0){
                health = A[0];
                prevDamage = B[B.length-1];
            }else{
                health = A[i];
                prevDamage = B[i-1];
            }

            sum += Math.max(0, (health - prevDamage));

        }

        for(int i=0; i<A.length; i++){

            long health = 0;
            long prevDamage =0;
            if(i == 0){
                health = A[0];
                prevDamage = B[B.length-1];
            }else{
                health = A[i];
                prevDamage = B[i-1];
            }

            long possibleAns = (sum - Math.max(0, (health - prevDamage))+ (A[i]));
            ans  = Math.min(ans, possibleAns);



        }


        return ((int)(ans %M));

    }


    public static void main(String[] args) {

        CircleOfMonsters obj = new CircleOfMonsters();
         int a  = obj.calculate(1111111111, 999999999, 999999999);
        int b  = obj.calculate(10, 9, 15);
        System.out.println(b);
        System.out.println(obj.solve(new int[] {7,2,5,}, new int[]{15,14,3}));
        System.out.println(obj.solve(new int[] {1,2}, new int[]{2,1}));

    }
}
