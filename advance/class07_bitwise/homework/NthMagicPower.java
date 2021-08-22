package advance.class07_bitwise.homework;

public class NthMagicPower {

    public int solve(int A) {
        int ans = 0;
        int pow = 1;

        while(A> 0){

            pow *=5;
            if( (A&1) == 1){
                ans+=pow;
            }

            A = A>>1;

        }

        return ans;


    }

    public static void main(String[] args) {

        System.out.println(new NthMagicPower().solve(3));
        System.out.println(new NthMagicPower().solve(10));

    }

}
